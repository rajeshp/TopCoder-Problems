package SRM.Div2;
/**
 * Created with IntelliJ IDEA.
 * User: TE162141
 * Date: 1/24/13
 * Time: 12:02 AM
 * To change this template use File | Settings | File Templates.
 */

import java.util.HashMap;

public class TypingDistance_SRM560_Div2_Level2 {

    public int minDistance(String keyboard, String word)
    {
        HashMap<Character,Integer> keys_position = new HashMap<Character, Integer>();

        for(int i=0;i<keyboard.length();i++)
        {
            keys_position.put(keyboard.charAt(i),i);
        }

        int total_distance=0;
        for(int i=1;i<word.length()-1;i++)
        {
            total_distance+= keys_position.get(word.charAt(i)) - keys_position.get(word.charAt(i-1));
        }

        return total_distance;
    }
}
