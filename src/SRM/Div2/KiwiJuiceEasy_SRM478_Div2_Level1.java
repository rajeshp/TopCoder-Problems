package SRM.Div2;

/**
 * Created with IntelliJ IDEA.
 * User: TE162141
 * Date: 1/29/13
 * Time: 2:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class KiwiJuiceEasy_SRM478_Div2_Level1 {

    public int[] thePouring(int[] capacities, int[] bottles, int[] fromId, int[] toId)
    {
        if(capacities == null || bottles==null && capacities.length==bottles.length && fromId.length == toId.length)
            return null;

        int[] result = new int[capacities.length];

        int temp=0;

        for(int i=0;i<toId.length;i++)
        {

            temp = capacities[toId[i]] - bottles[toId[i]];

            if(temp > bottles[fromId[i]])
            {
                bottles[toId[i]] += bottles[fromId[i]];
                bottles[fromId[i]] = 0;
            }
            else
            {
                bottles[toId[i]] += temp;
                bottles[fromId[i]] -= temp;
            }


        }

        return bottles;
    }


    public static void main(String[] args)
    {
        KiwiJuiceEasy_SRM478_Div2_Level1 obj = new KiwiJuiceEasy_SRM478_Div2_Level1();
        int[] result1 = obj.thePouring(new int[]{20, 20},new int[]{5, 8},new int[]{0}, new int[]{1});

        for(int i=0;i<result1.length;i++)
        {
            System.out.print(result1[i]+"  ");
        }

        System.out.println();

        result1 = obj.thePouring(new int[]{10, 10},new int[]{5, 8},new int[]{0}, new int[]{1});

        for(int i=0;i<result1.length;i++)
        {
            System.out.print(result1[i]+"  ");
        }


        System.out.println();

        result1 = obj.thePouring(new int[] {14, 35, 86, 58, 25, 62},new int[] {6, 34, 27, 38, 9, 60},new int[] {1, 2, 4, 5, 3, 3, 1, 0},new int[] {0, 1, 2, 4, 2, 5, 3, 1} );

        for(int i=0;i<result1.length;i++)
        {
            System.out.print(result1[i]+"  ");
        }

        System.out.println();

        result1 = obj.thePouring(new int[] {700000, 800000, 900000, 1000000},new int[] {478478, 478478, 478478, 478478},new int[] {2, 3, 2, 0, 1},new int[] {0, 1, 1, 3, 2} );

        for(int i=0;i<result1.length;i++)
        {
            System.out.print(result1[i]+"  ");
        }
    }


}
