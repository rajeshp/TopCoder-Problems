package SRM.Div2;

/**
 * Created with IntelliJ IDEA.
 * User: TE162141
 * Date: 1/23/13
 * Time: 11:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class KiloMan_SRM181_Div2_Level1 {


    public int hitsTaken(int[] pattern, String jumps)
    {
        int count=0;

        for(int i=0;i<jumps.length();i++)
        {
            if(jumps.charAt(i)=='J' && pattern[i]>2)
                count++;

            if(jumps.charAt(i)=='S' && (pattern[i]==1 || pattern[i]==2))
                count++;

        }

        return count;

    }


    public static void main(String[] args)
    {
        System.out.println(new KiloMan_SRM181_Div2_Level1().hitsTaken(new int[]{1,3,2,3,3,1,2,2,1},"JJSSSJSSJ"));
        System.out.println(new KiloMan_SRM181_Div2_Level1().hitsTaken(new int[] {1,1,1,1,1,1,1,2,2,2,2,2,2,2,3,3,3,3,3,3,3,4,4,4,4,
                4,4,4,5,5,5,5,5,5,5,6,6,6,6,6,6,6,7,7,7,7,7,7,7},"SSSSSSSSSSSSSSJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ"        ));
        System.out.println(new KiloMan_SRM181_Div2_Level1().hitsTaken(new int[] {1,2,2,1},"SJJS"));
        System.out.println(new KiloMan_SRM181_Div2_Level1().hitsTaken(new int[] {1},"J"
        ));

    }

}
