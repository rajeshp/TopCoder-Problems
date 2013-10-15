package SRM.Div2.practice;

/**
 * Created with IntelliJ IDEA.
 *
 * @author prajesh
 *         Date: 15/10/13
 *         Time: 2:37 PM
 *         To change this template use File | Settings | File Templates.
 */
public class EasyHomework_SRM572_Div2_level1 {

    public static void main(String[] args)
    {
        int[] a1 = new int[] {5, 7, 2};
        int[] a2 = new int[] {-5, 7, 2};
        int[] a3 = new int[]{5, 7, 2, 0};
        int[] a4 = new int[]{3, -14, 159, -26};
        int[] a5 = new int[]{123, -456, 789, -101112, 131415, 161718, 192021, 222324, 252627, 282930, 313233, 343536, 373839, 404142, 434445, 464748, 495051, 525354, 555657};
        int[] a6 = new int[]{-10000};


        System.out.println(determineSign(a1));
        System.out.println(determineSign(a2));
        System.out.println(determineSign(a3));
        System.out.println(determineSign(a4));
        System.out.println(determineSign(a5));
        System.out.println(determineSign(a6));


    }


    static String determineSign(int[] A)
    {

        int negativeCount=0;

        boolean isZero=false;


        for(int i=0;i<A.length;i++)
        {

            if(A[i]==0)
            {
                isZero=true;
                break;
            }
            else
            if(A[i]<0)
            {
                negativeCount++;
            }

        }




        if(isZero)
            return "ZERO";
        else
        {
            if(negativeCount > 0 && negativeCount % 2 !=0)
                return "NEGATIVE";
            else
                return "POSITIVE";

        }




    }


}
