package SRM.Div2;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: TE162141
 * Date: 1/28/13
 * Time: 3:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class TheBeauty_SRM437_Div2_Level1 {


    public int find(int n)
    {
        int result=0;

        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        int digit=0;
        while(n>0)
        {
         digit=n%10;
         n=n/10;
          if(!hmap.containsKey(digit))
                   hmap.put(digit,0);
        }


        return hmap.size();
    }


    public static void main(String[] args)
    {
        TheBeauty_SRM437_Div2_Level1 obj = new TheBeauty_SRM437_Div2_Level1();

        System.out.println(obj.find(7));
        System.out.println(obj.find(100));
        System.out.println(obj.find(123456789));
        System.out.println(obj.find(100000000));
        System.out.println(obj.find(932400154));
    }
}
