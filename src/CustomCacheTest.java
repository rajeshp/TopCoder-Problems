/**
 * Created with IntelliJ IDEA.
 * User: TE162141
 * Date: 2/7/13
 * Time: 6:56 PM
 * To change this template use File | Settings | File Templates.
 */
import com.amagi.*;

public class CustomCacheTest {


    public static void main(String[] str)
    {
        CustomCache obj = new CustomCache(5000);

        int[] a= new int[]{2,3,1,2,2,2,3,3,3,4,3,5};

        try
        {

            for(int i=0;i<a.length;i++)
                        {

                System.out.println("Inserting "+a[i]+" --> "+obj.add(a[i]));
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception in cache..");
        }

        /*System.out.println(obj.peek());
        obj.remove(5);
        System.out.println(obj.peek());*/


        //make the current thread wait for 5 seconds

        try
        {
            System.out.println("Removing most recent elemtn : "+obj.take());
            System.out.println("Removing most recent elemtn : "+obj.take());
            System.out.println("Removing most recent elemtn : "+obj.take());
            System.out.println("Removing most recent elemtn : "+obj.take());
            System.out.println("Removing most recent elemtn : "+obj.take());
            System.out.println("Removing most recent elemtn : "+obj.take());

            Thread.sleep(50);

        obj.add(10);

        }
        catch(InterruptedException ie)
        {
            System.out.println("Somebody interrupted me :(");
        }



        /*int x=0;

        for(int i=0;i<10;i++)
        {
            System.out.println("Removing "+i +"  --> "+obj.remove(i));
        }*/

    }


}
