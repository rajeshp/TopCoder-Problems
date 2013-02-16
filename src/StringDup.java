import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created with IntelliJ IDEA.
 * User: TE162141
 * Date: 1/22/13
 * Time: 3:49 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringDup {

    public static void main(String[] args)
    {

     System.out.println(getMax("ab2sbf2dj2skl"));

    }

    public static char getMax(String str)
    {
        if(str==null) return '\0';

        Map<Character,Integer> original_position = new TreeMap<Character, Integer>();

        for(int i=0;i<str.length();i++)
        {
            if(!original_position.containsKey(str.charAt(i)))
            original_position.put(str.charAt(i),i);
        }

        Map<Character,Integer> chars = new TreeMap<Character, Integer>();

        for(int i=0;i<str.length();i++)
        {
            if(chars.containsKey(str.charAt(i)))
            {
                chars.put(str.charAt(i), chars.get(str.charAt(i))+1);
            }
            else
                chars.put(str.charAt(i),1);
        }


        int max=0;
        char maxchar='\0';

        for(char c : chars.keySet())
        {
             if(chars.get(c)>max)
             {
                 max=chars.get(c);
                 maxchar=c;
             }
        }

      return maxchar;
    }


}
