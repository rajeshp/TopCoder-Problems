package com.amagi;

import java.util.*;
import java.util.concurrent.*;

/**
 * Created with IntelliJ IDEA.
 * User: TE162141
 * Date: 2/6/13
 * Time: 3:02 AM
 * To change this template use File | Settings | File Templates.
 */

class QueueNode<T>
{
    T val;
    QueueNode next;

}

class Queue<T> {
    QueueNode<T> head;

    boolean valueSet = false;





    synchronized boolean add(T t) throws InterruptedException
    {

        QueueNode<T> temp = new QueueNode<T>();
        temp.val=t;
        temp.next=head;
        head = temp;
        valueSet=true;


        //notifyAll();

        return true;
    }

    synchronized boolean remove(T t)
    {
        QueueNode<T> current=head,prev=null;

        while(current!=null)
        {

            if(current.val.equals(t))
            {
                //remove current node;
                if(current==head)
                {
                    if(current.next==null)
                        valueSet=false;

                    head=current.next;
                }
                else
                {
                    prev.next = current.next;
                }

                return true;
            }
            else
            {
                prev=current;
                current=current.next;
            }
        }

        return false;
    }


    synchronized T take() throws InterruptedException
    {
        if (head==null)
        {
            wait();
        }
        //remove head and return'

        T temp = head.val;
        head = head.next;

        return temp;
    }

}


public class CustomCache<T> {

  public    Set<T> cache = new LinkedHashSet<T>();
  public   Queue<T> cacheList = new Queue<T>();

  public  long timeLimit=5000; //default 5000ms
  private Sweeper sweeper = new Sweeper(this);



  public CustomCache(long age)
  {

      timeLimit = age;
      Timer timer = new Timer();
      ScheduledExecutorService executorService = new ScheduledThreadPoolExecutor(10);

      executorService.scheduleAtFixedRate(sweeper,10,timeLimit, TimeUnit.MILLISECONDS);


  }

    public synchronized boolean add(T t) throws InterruptedException
    {
       if(!cache.contains(t))
       {
           cache.add(t);

           cacheList.add(t);
           notifyAll();
           return true;
       }
        else
       {
           return false;
       }


    }

    public synchronized boolean remove(T t)
    {
        if(cache.contains(t))
        {
            cache.remove(t);
            return cacheList.remove(t);
        }
        else
            return false;
    }

    public synchronized T peek()
    {
        if(cache.size()==0 || cacheList.head==null)
            return null;

        return cacheList.head.val;
    }

    public synchronized T take() throws InterruptedException
    {
        if(cacheList.head==null)
            wait();
        return cacheList.take();
    }


}


class Sweeper implements Runnable
{
    CustomCache cache=null;



    Sweeper(CustomCache customCache)
    {
        this.cache = customCache;
    }


    public void run()
    {

            cache.cache.clear();
            QueueNode temp = cache.cacheList.head;

            QueueNode prev=null;

            while(temp!=null)
            {
               if(prev!=null)
               {
                   prev.next=null;
               }

                prev = temp;
                temp=temp.next;

            }

            System.out.println("Cache Cleared by sweeper thread..");



    }
}

