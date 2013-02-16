package SRM.Div2;

/**
 * Created with IntelliJ IDEA.
 * User: TE162141
 * Date: 1/30/13
 * Time: 3:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class EscapeFromRectangle_SRM311_Div2_Level1 {

    public int shortest(int x, int y, int w, int h)
    {
        int resultX=0,resultY=0,diffX=0,diffY=0;

        diffX = (w-x);
        resultX = diffX < x ? diffX : x;

        diffY = (h-y);
        resultY = diffY<y?diffY : y;


        return (resultX < resultY)? resultX : resultY;
    }

    public static void main(String[] str)
    {
       EscapeFromRectangle_SRM311_Div2_Level1 obj = new EscapeFromRectangle_SRM311_Div2_Level1();

       System.out.println(obj.shortest(1,1,5,5));
       System.out.println(obj.shortest(6,2,10,3));
       System.out.println(obj.shortest(653,375,1000,1000));
       System.out.println(obj.shortest(161,181,762,375));
    }

}
