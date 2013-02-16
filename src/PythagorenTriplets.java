/**
 * Created with IntelliJ IDEA.
 * User: TE162141
 * Date: 1/18/13
 * Time: 8:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class PythagorenTriplets {

    public static void main(String[] args)
    {
        System.out.println(getSqure(2));
        System.out.println(findPythagorenTriplet(1000));
    }

    static int findPythagorenTriplet(int n)
    {
        if(n<=0)
            return -1;
        /*int[] a = new int[n];

        for(int i=0;i<n-1;i++)
        {
            a[i]=i+1;
        }*/

         int i=1,a=0,b,c;

        while(i<2000)
        {
            a=i;b=i+1;c=i+2;

            if( (getSqure(a)+(getSqure(b))==(getSqure(c))))
            {
                System.out.println(a+" , "+b+" , "+c);
            }

           i++;
        }

       if(i<Integer.MAX_VALUE)
           return a;
        else
            return -1;
    }

   static int getSqure(int n)
    {
        if(n<=0) return 0;
        else
            return n*n;
    }
}
