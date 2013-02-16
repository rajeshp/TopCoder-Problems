package SRM.Div2;

/**
 * Created with IntelliJ IDEA.
 * User: TE162141
 * Date: 1/24/13
 * Time: 2:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class AccountBalance_SRM288_Div2_Level1 {

    public int processTransactions(int startingBalance, String[] transactions)
    {
        String[] str=null;

        for(String transaction : transactions)
        {
            str = transaction.split(" ");

            if(str[0].equals("C"))
                startingBalance+=Integer.parseInt(str[1]);
            else
                if(str[0].equals("D"))
                    startingBalance-=Integer.parseInt(str[1]);
        }

        return startingBalance;
    }



    public static void main(String[] args)
    {
        System.out.println(new AccountBalance_SRM288_Div2_Level1().processTransactions(100,new String[]{"C 1000", "D 500", "D 350"}));
        System.out.println(new AccountBalance_SRM288_Div2_Level1().processTransactions(100, new String[]{}));
        System.out.println(new AccountBalance_SRM288_Div2_Level1().processTransactions(100, new String[]{"D 50", "D 20", "D 40"}));
        System.out.println(new AccountBalance_SRM288_Div2_Level1().processTransactions(53874, new String[] {"D 1234", "C 987", "D 2345", "C 654", "D 6789", "D 34567"}));
    }

}
