package SRM.Div2;

/**
 * Created with IntelliJ IDEA.
 * User: prajesh
 * Date: 13/3/13
 * Time: 6:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class Thimbles_SRM354_Div2_Level1 {

    int thimbleWithBall(String[] swaps)
    {

        char pos='1';

        for(String swap : swaps)
        {

            if(swap.charAt(0)==pos)
            {
               pos=swap.charAt(2);
            }
            else
            {
                if(swap.charAt(2)==pos)
                {
                    pos=swap.charAt(0);
                }
            }
        }



        return (int) pos - 48;
    }



    public static void main(String[] args)
    {

        Thimbles_SRM354_Div2_Level1 obj = new Thimbles_SRM354_Div2_Level1();

        String[] case1 = new String[]{"1-2", "3-1"};
        String[] case2 = new String[]{"3-1", "2-3", "3-1", "3-2"};
        String[] case3= new String[] {"2-3", "1-3", "2-3", "2-1", "3-1"};
        String[] case4 = new String[]{"1-2", "3-2", "1-2", "2-1", "2-1", "3-2", "1-3", "3-1", "1-2"};



        System.out.println("Case 1 :"+obj.thimbleWithBall(case1));
        System.out.println("Case 2 :"+obj.thimbleWithBall(case2));
        System.out.println("Case 3 :"+obj.thimbleWithBall(case3));
        System.out.println("Case 4 :"+obj.thimbleWithBall(case4));






    }

}
