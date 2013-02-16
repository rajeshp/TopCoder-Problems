/**
 * Created with IntelliJ IDEA.
 * User: TE162141
 * Date: 1/24/13
 * Time: 2:56 PM
 * To change this template use File | Settings | File Templates.
 */


class Queue
{
    int[] queue = new int[1] ;
    int head;
    int current;
    int count;

    public void initialize(int length)
    {
        synchronized (queue)
        {
            queue=new int[length];
            head=length/2;
            //current=head-1;
            count=0;
        }
    }

    public void enQueue(int n)   throws QueueFullException
    {

        synchronized (queue)
        {
            if(head==-1)
                head=queue.length-1;

            if(count==queue.length)  throw new QueueFullException("Queue Already Full");

            queue[head--]=n;
            count++;

        }
    }


    public int deQueue()   throws QueueEmptyException
    {
        synchronized (queue)
        {

            if(count==0) throw new QueueEmptyException("Cannot call Dequeque on Empty Queue");

            if(head==-1)
                head=queue.length-1;

            int temp = queue[head];
            count--;
            queue[head--]=0;
            return temp;
        }

    }
}


class QueueFullException extends Exception
{
    public QueueFullException(String message)
    {
        super(message);
    }
}

class QueueEmptyException extends Exception
{
    public QueueEmptyException(String message)
    {
        super(message);
    }
}



class Test1 implements Runnable
{
    Queue q ;

    int queue_length;

    public Test1()
    {

    }

    public Test1(int n)
    {
        queue_length=n;
        q = new Queue();
        q.initialize(n);
    }



     @Override
    public void run()
    {
        try
        {
         for(int i=0;i<queue_length;i++)
         {
             q.enQueue(i);
         }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}


public class Groupon_Screening {

    public  static void main(String[] args)
    {
        Queue q = new Queue();
        q.initialize(10);




        try
        {


        for(int i=1;i<11;i++)
        {
            q.enQueue(i*10);
        }


            for(int i=1;i<11;i++)
            {
                System.out.println(q.deQueue());
            }


        }catch(Exception e)
        {
            System.err.println(e);
        }


       Test1 test1 = new Test1(10);

       Thread t1 = new Thread(test1);
       Thread t2 = new Thread(test1);

        t1.start();
        t2.start();



    }

}
