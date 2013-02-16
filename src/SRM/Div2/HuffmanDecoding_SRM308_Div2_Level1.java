package SRM.Div2;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: TE162141
 * Date: 1/30/13
 * Time: 8:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class HuffmanDecoding_SRM308_Div2_Level1 {

    public String decode(String archive, String[] dictionary)
    {
        int start=0,end=1;

        HashMap<String,Integer> dictionaryMap = new HashMap<String, Integer>();

        Character c =null;
        char ch = '\0';

        for(int i=0;i<dictionary.length;i++)
        {

            dictionaryMap.put(dictionary[i],i);
        }


        StringBuilder sb = new StringBuilder();
        String currentString = null;
        int p=0;

        start=0;end=2;

        while(start<archive.length()  && start <= end)
        {
            if(start+2<=archive.length())
            end=start+2;
            else
            end=archive.length();

            currentString = archive.substring(start,end);

            if(dictionaryMap.containsKey(currentString))
            {
                sb.append( (char) (dictionaryMap.get(currentString) + 65 ));
                start=end;
            }
            else
            {
                start++;
                end++;
            }


        }



            return sb.toString();
    }


    public static void main(String[] args)
    {
        HuffmanDecoding_SRM308_Div2_Level1 obj = new HuffmanDecoding_SRM308_Div2_Level1();

        System.out.println(obj.decode("101101", new String[] {"00","10","01","11"}));
        System.out.println(obj.decode("10111010", new String[] {"0","111","10"}));
        System.out.println(obj.decode("0001001100100111001", new String[] {"1","0"}));
        System.out.println(obj.decode("111011011000100110", new String[] {"010","00","0110","0111","11","100","101"}));
        System.out.println(obj.decode("001101100101100110111101011001011001010", new String[] {"110","011","10","0011","00011","111","00010","0010","010","0000"}));

    }

}
