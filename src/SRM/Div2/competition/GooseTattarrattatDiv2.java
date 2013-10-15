package SRM.Div2.competition;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @author prajesh
 *         Date: 27/8/13
 *         Time: 4:40 PM
 *         To change this template use File | Settings | File Templates.
 */
public class GooseTattarrattatDiv2 {


    class item implements Comparable
    {

        int hits=0;
        String  charVal;


        @Override
        public int compareTo(Object o) {

            if(o instanceof item)
            {
                if(((item) o).hits > this.hits) return 1;
                else
                    if(((item) o).hits< this.hits) return -1;
                else
                        return 0;
            }
            else
                return -1;

        }
    }


    public static void main(String[] args)
    {

        String case1 = "geese";
        String case2 = "tattarrattat";
        String case3 = "www";
        String case4 = "topcoder";
        String case5 = "xrepayuyubctwtykrauccnquqfuqvccuaakylwlcjuyhyammag";


        System.out.println(getmin(case1));
        System.out.println(getmin(case2));
        System.out.println(getmin(case3));
        System.out.println(getmin(case4));
        System.out.println(getmin(case5));



    }


    public static int getmin(String S)
    {


        Map<Character, Integer> frequency = new LinkedHashMap<Character, Integer>();

        for(char c : S.toCharArray())
        {
            if(frequency.containsKey(c))
            {
                int k = frequency.get(c) + 1;
                frequency.put(c,k);
            }
            else
                frequency.put(c,1);
        }

        Character k=null;
        int max=0;

        for(Character key : frequency.keySet())
        {
           if(frequency.get(key)>max)
           {
               k=key;
               max= frequency.get(key);
           }
        }


        return (S.length() -  max) ;


    }


}
