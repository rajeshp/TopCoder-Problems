package SRM.Div2;

/**
 * Created with IntelliJ IDEA.
 * User: TE162141
 * Date: 1/23/13
 * Time: 11:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class RosePetals_SRM315_Div2_Level1 {


    public int getScore(int[] dice)
    {
        int[] weights={0,0,0,2,0,4,0};

        int sum=0;

        for(int i=0;i<dice.length;i++)
        {
            sum+=weights[dice[i]];
        }

        return sum;
    }

}
