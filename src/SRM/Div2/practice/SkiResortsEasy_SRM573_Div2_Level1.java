package SRM.Div2.practice;

/**
 * Created with IntelliJ IDEA.
 *
 * @author prajesh
 *         Date: 15/10/13
 *         Time: 2:16 PM
 *         To change this template use File | Settings | File Templates.
 */
public class SkiResortsEasy_SRM573_Div2_Level1 {


    public static void main(String[] args)
    {

        int[] a1 = new int[]{30, 20, 20, 10};
        int[] a2 = new int[]{6, 8, 5, 4, 7, 4, 2, 3, 1};
        int[] a3 = new int[]{749, 560, 921, 166, 757, 818, 228, 584, 366, 88};
        int[] a4 = new int[]{712, 745, 230, 200, 648, 440, 115, 913, 627, 621, 186, 222, 741, 954, 581, 193, 266, 320, 798, 745};


        System.out.println(minCost(a1));
        System.out.println(minCost(a2));
        System.out.println(minCost(a3));
        System.out.println(minCost(a4));




    }

   static  int minCost(int[] a)
    {
        int total_cost = 0;

        int last=0;

        for(int i=1;i<a.length;i++)
        {
            if(a[i] > a[i-1])
            {
                total_cost+=(a[i] - a[i-1]);
                a[i] = a[i-1];
            }
        }

         return total_cost;
    }

}
