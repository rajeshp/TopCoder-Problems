package SRM.Div2.practice;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @author prajesh
 *         Date: 2/8/13
 *         Time: 2:51 PM
 *         To change this template use File | Settings | File Templates.
 */
public class Substitute_SRM160 {

    private static Map<Character, Integer> index = new HashMap<Character, Integer>();

    public static void main(String[] args)
    {

        String key1="TRADINGFEW";
        String code1="LGXWEV";

        System.out.println(new Substitute_SRM160().getValue(key1,code1));

        String key2="ABCDEFGHIJ";
        String code2="XJ";

        System.out.println(new Substitute_SRM160().getValue(key2,code2));


        String key3="CRYSTALBUM";
        String code3="MMA";

        System.out.println(new Substitute_SRM160().getValue(key3,code3));


    }

    private static void clearIndex()
    {
        index.clear();
    }

    public int getValue(String key, String code)
    {

        clearIndex();
        buildIndex(key);

        StringBuilder sb = new StringBuilder();

        for(char c : code.toCharArray())
        {
            if(index.containsKey(c))
            sb.append(((index.get(c))%10));

        }

        return Integer.parseInt(sb.toString());
    }

    private void buildIndex(String indexString)
    {
        int i=0;
        for(char c : indexString.toCharArray())
        {
            if(!index.containsKey(c))
            {
                index.put(c,i+1);
                i++;
            }

        }
    }


}
