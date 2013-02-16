package SRM.Div2;

/**
 * Created with IntelliJ IDEA.
 * User: TE162141
 * Date: 1/23/13
 * Time: 8:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class InsideOut_SRM224_Div2_Level1 {

    public String unscramble(String line)
    {
        StringBuilder sb = new StringBuilder();

        int n = line.length()/2;

        sb.append(getReverse(line.substring(0,n)));
        sb.append(getReverse(line.substring(n,line.length())));

        return sb.toString();
    }

    public String getReverse(String msg)
    {
        StringBuilder reverseString = new StringBuilder();

       for(int i=msg.length()-1;i>=0;i--)
       {
           reverseString.append(msg.charAt(i));
       }

        return  reverseString.toString();
    }


    public static void main(String[] args)
    {
        System.out.println(new InsideOut_SRM224_Div2_Level1().unscramble("I ENIL SIHTHSIREBBIG S"));
    }
}
