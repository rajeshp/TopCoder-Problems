import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: TE162141
 * Date: 1/23/13
 * Time: 5:04 PM
 * To change this template use File | Settings | File Templates.
 *
 *   Single Round Match 271 Round 1 - Division II, Level One
 *
 */
public class CheckFunction {

   HashMap<Integer,Integer> dashMap = new HashMap<Integer, Integer>();

    static
    {

    }

    public int newFunction(String code)
    {
        int[] dashes = new int[] {6,2,5,5,4,5,6,3,7,6};

         int count=0,x=0;

         for(int i=0;i<code.length();i++)
         {
             x=  (int) code.charAt(i) - 48;

             if(x<0 || x>10) return 0;

             count+=dashes[x];

         }




        return count;
    }


    public static void main(String[] args)
    {
        System.out.println(new CheckFunction().newFunction("13579"));
        System.out.println(new CheckFunction().newFunction("02468"));
        System.out.println(new CheckFunction().newFunction("73254370932875002027963295052175"));
    }


}
