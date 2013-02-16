package SRM.Div2;

/**
 * Created with IntelliJ IDEA.
 * User: TE162141
 * Date: 1/29/13
 * Time: 6:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class BettingMoney_SRM191_Div2_Level1 {

    public int moneyMade(int[] amounts, int[] centsPerDollar, int finalResult)
    {

        int result=0;


        for(int i=0;i<amounts.length;i++)
        {
            result+=amounts[i];
        }

        result -= amounts[finalResult];

        result *=100;
        result-= centsPerDollar[finalResult]*amounts[finalResult];

        return result;
    }

    public static void main(String[] args)
    {
        BettingMoney_SRM191_Div2_Level1 obj = new BettingMoney_SRM191_Div2_Level1();

        System.out.println(obj.moneyMade(new int[]{10,20,30}, new int[]{20,30,40},1));

    }

}
