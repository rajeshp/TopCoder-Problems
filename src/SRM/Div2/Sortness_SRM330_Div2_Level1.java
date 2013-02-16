package SRM.Div2;

/**
 * Created with IntelliJ IDEA.
 * User: TE162141
 * Date: 1/23/13
 * Time: 7:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class Sortness_SRM330_Div2_Level1 {

    public double getSortness(int[] a)
    {
        int[] sortness = new int[a.length];
        int count=0;
        for(int i=0;i<a.length;i++)
        {
               for(int j=0; j<i;j++)
               {
                   if(a[j]>a[i]) count++;
               }

                for(int j=i+1; j<a.length;j++)
                {
                    if(a[j]<a[i]) count++;
                }

            sortness[i]=count;
            count=0;
        }

        double total_sortness=0;

        for(int i=0;i<a.length;i++)
            total_sortness+=sortness[i];

        return total_sortness/sortness.length;
    }

    public static void main(String[] args)
    {
        System.out.println(new Sortness_SRM330_Div2_Level1().getSortness(new int[]{3,2,1,4,6,7,5,8}));
        System.out.println(new Sortness_SRM330_Div2_Level1().getSortness(new int[]{1,2,3}));
        System.out.println(new Sortness_SRM330_Div2_Level1().getSortness(new int[] {5,4,3,2,1}));
        System.out.println(new Sortness_SRM330_Div2_Level1().getSortness(new int[] {1,5,8,7,9,6,10,12,11,3,4,2}));
    }

}
