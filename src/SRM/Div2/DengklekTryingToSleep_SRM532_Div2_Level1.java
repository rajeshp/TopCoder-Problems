package SRM.Div2;

import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: TE162141
 * Date: 1/28/13
 * Time: 3:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class DengklekTryingToSleep_SRM532_Div2_Level1 {

    public int minDucks(int[] ducks)
    {
        if(ducks==null) return -1;
        int min=ducks[0], max=ducks[0];

        Set<Integer> duckSet = new HashSet<Integer>() ;


        for(int i=0;i<ducks.length;i++)
        {
            if(ducks[i]<min) min=ducks[i];
            if(ducks[i]>max) max=ducks[i];

           duckSet.add(ducks[i]);
        }

        int count=0;

        for(int i=min;i<=max;i++)
        {
            if(!duckSet.contains(i))
                count++;
        }

        return count;
    }


    public static void main(String[] args)
    {
        DengklekTryingToSleep_SRM532_Div2_Level1 obj = new DengklekTryingToSleep_SRM532_Div2_Level1();

        int case1 = obj.minDucks(new int[] {5, 3, 2});
        int case2 = obj.minDucks(new int[] {58});
        int case3 = obj.minDucks(new int[] {9, 3, 6, 4});
        int case4 = obj.minDucks(new int[] {7, 4, 77, 47, 74, 44});
        int case5 = obj.minDucks(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10});

        System.out.println(case1);
        System.out.println(case2);
        System.out.println(case3);
        System.out.println(case4);
        System.out.println(case5);

    }

}
