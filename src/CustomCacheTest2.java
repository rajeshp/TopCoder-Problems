/**
 * Created with IntelliJ IDEA.
 * User: TE162141
 * Date: 2/10/13
 * Time: 7:11 PM
 * To change this template use File | Settings | File Templates.
 */

import com.amagi.CustomCache;

import java.util.Random;

class A implements Runnable
{
    CustomCache<Integer> cache;
    int c=0;

    public A()
    {

    }

    public A(CustomCache<Integer> cache)
    {
        this.cache=cache;
    }


    public void run()
    {

            Random random = new Random();
            int ranInt = random.nextInt(100);

            try
            {
            System.out.println("adding element to cache : "+ranInt + " "+cache.add(ranInt));
            }
            catch(InterruptedException ie)
            {
                System.out.println("Thread A Interrupted");
            }
    }

}


class B <T> implements Runnable
{
    CustomCache<T> cache;
    int c=0;

    public B()
    {

    }

    public B(CustomCache<T> cache)
    {
        this.cache=cache;
    }


    public void run()
    {
        synchronized (this)
        {
            try
            {
            T t = cache.take() ;
            System.out.println("Removing most recent element : "+t);

            }
            catch(InterruptedException ie)
            {
                System.out.println("Thread B Interruped ");
            }
        }
    }

}




public class CustomCacheTest2 {

    public static void main(String[] args)
    {

        CustomCache<Integer> cache = new CustomCache<Integer>(1000);

        A objA = new A(cache);

        Thread t1 = new Thread(objA);

        B objB = new B(cache);

        Thread t2 = new Thread(objB);


        try
        {

            t2.start();   // this takes the element from cache, if empty waits till new item is inserted to cache
            t1.start();
           Thread.sleep(5000);


            //System.exit(1);
            throw new InterruptedException();



        }
        catch(InterruptedException ie)
        {
            System.out.println("Interrupted expection");
        }
    }

}
