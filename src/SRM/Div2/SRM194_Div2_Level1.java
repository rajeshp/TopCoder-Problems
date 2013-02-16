package SRM.Div2;

/**
 * Created with IntelliJ IDEA.
 * User: TE162141
 * Date: 1/23/13
 * Time: 5:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class SRM194_Div2_Level1 {

   public static void main(String[] args)
   {

       System.out.println(new SRM194_Div2_Level1().maxPoints(new int[]{1,4,3,0,0},new int[] {3,1,5,3,1}));
       System.out.println(new SRM194_Div2_Level1().maxPoints(new int[]{12,45,20,17,48,0},new int[] {48,10,53,94,0,100}));
       System.out.println(new SRM194_Div2_Level1().maxPoints(new int[]{35,0},new int[] {0,76}));
       System.out.println(new SRM194_Div2_Level1().maxPoints(new int[]{13,79,26,73,14,89,71,37,89,71,19,59,39},new int[] {88,27,5,70,84,94,20,50,2,11,31,22,50}));


   }
    public int maxPoints(int[] wins, int[] ties)
    {
        int win_point=3,tie_point=1;

        int winner_point=0;
        for(int i=0;i<wins.length;i++)
            wins[i]=wins[i]*win_point;

        for(int i=0;i<ties.length;i++)
            ties[i]=ties[i]*tie_point;


        for(int i=0;i<ties.length;i++)
        {
            wins[i]+=ties[i];
            if(wins[i]>winner_point)
                winner_point=wins[i];
        }

        return winner_point;
    }
}
