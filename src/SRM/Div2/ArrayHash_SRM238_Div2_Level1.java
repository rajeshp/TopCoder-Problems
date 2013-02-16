package SRM.Div2;

/**
 * Created with IntelliJ IDEA.
 * User: TE162141
 * Date: 1/25/13
 * Time: 5:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class ArrayHash_SRM238_Div2_Level1 {


    public int getHash(String[] input)
    {
       int hash=0,x=0;
        for(int i=0;i<input.length;i++)
        {

            for(int j=0;j<input[i].length();j++)
            {
                 x = (int) input[i].charAt(j) -65 ;
                 x += i+j;
                hash+=x;
            }


        }

        return hash;
    }



    public static void main(String[] args)
    {

        System.out.println(new ArrayHash_SRM238_Div2_Level1().getHash(new String[]{"CBA","DDD"}));
        System.out.println(new ArrayHash_SRM238_Div2_Level1().getHash(new String[]{"A","B","C","D","E","F"}));


    }

}
