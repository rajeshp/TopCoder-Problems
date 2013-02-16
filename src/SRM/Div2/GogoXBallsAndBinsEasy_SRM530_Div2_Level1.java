package SRM.Div2;

/**
 * Created with IntelliJ IDEA.
 * User: TE162141
 * Date: 1/29/13
 * Time: 6:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class GogoXBallsAndBinsEasy_SRM530_Div2_Level1 {

    public int solve(int[] T)
    {
        int result=0;

         int x = 0, y = T.length-1;

        int i=0,mid=0;


        if(T.length%2==0)
        {
            mid =  T.length/2;
            while(i<mid)
            {
                result+= (T[y]-T[x]);
                y--; x++; i++;
            }
        }
        else
        {
            mid =  T.length/2;
            while(i<=mid)
            {
                result+= (T[y]-T[x]);
                y--; x++; i++;
            }
        }





        return result;
    }

    public static void main(String[] args)
    {
          GogoXBallsAndBinsEasy_SRM530_Div2_Level1 obj = new GogoXBallsAndBinsEasy_SRM530_Div2_Level1();

        System.out.println(obj.solve(new int[] {0, 2, 5}));
        System.out.println(obj.solve(new int[] {5, 6, 7, 8}));
        System.out.println(obj.solve(new int[] {0, 1, 2, 10}));
        System.out.println(obj.solve(new int[] {1, 2, 3, 4, 5, 6, 7, 8}));
    }

}
