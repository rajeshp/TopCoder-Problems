package SRM.Div2.practice;

/**
 * Created with IntelliJ IDEA.
 *
 * @author prajesh
 *         Date: 22/8/13
 *         Time: 2:08 AM
 *         To change this template use File | Settings | File Templates.
 */
public class AdvertisingAgency {


    public static void main(String[] args)
    {

        System.out.println(numberOfRejections(new int[]{1,2,3}));
        System.out.println(numberOfRejections(new int[]{1,1,1}));


    }

    public static int numberOfRejections(int[] requests)
    {
        boolean [] billboards = new boolean[101];

        int count=0;
        for(int request : requests)
        {
            if(!billboards[request])
                billboards[request]=true;
            else
                count++;
        }

        return count;

    }

}
