package SRM.Div2;

/**
 * Created with IntelliJ IDEA.
 * User: TE162141
 * Date: 1/28/13
 * Time: 3:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class TheBlackJackDivTwo_SRM448_Div2_Level1 {

    public int score(String[] cards)
    {
        int result=0;

        if(cards==null) return result;


        for(int i=0;i<cards.length;i++)
        {
                     result+=getWeight(cards[i].charAt(0));
        }

        return result;
    }

    private int getWeight(char c)
    {
        if(c=='T' || c=='J' || c=='K'|| c=='Q')
            return 10;

        if(c=='A') return 11;

        return (int) c - 48;
    }


    public static void main(String[] args)
    {
        TheBlackJackDivTwo_SRM448_Div2_Level1 obj = new TheBlackJackDivTwo_SRM448_Div2_Level1();

        int case1 = obj.score(new String[] {"4S", "7D"});
        int case2 = obj.score(new String[] {"KS", "TS", "QC"});
        int case3 = obj.score(new String[] {"AS", "AD", "AH", "AC"});
        int case4 = obj.score(new String[] {"3S", "KC", "AS", "7C", "TC", "9C", "4H", "4S", "2S"});

        System.out.println(case1);
        System.out.println(case2);
        System.out.println(case3);
        System.out.println(case4);

    }

}
