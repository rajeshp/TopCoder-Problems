package SRM.Div2;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: TE162141
 * Date: 1/24/13
 * Time: 7:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class SoccerLeagues_SRM443_Div2_Level1 {

    static HashMap<Character,Integer> points = new HashMap<Character, Integer>();

    static
    {
        points.put('W',3);
        points.put('L',0);
        points.put('D',1);
    }

    public int[] points(String[] matches)
    {
        int[] result = new int[matches.length];

        int count=0;

        char c='\0';



        for(int i=0;i<matches.length;i++)
        {
            count=0;

            for(int j=0;j<matches[i].length();j++)
            {
               c =   matches[i].charAt(j);

                if(c!='-')
                {
                    if(c=='W') count+=3;
                    if(c=='D') count+=1;
                }
            }

            for(int j=0;j<matches.length;j++)
            {
                c =   matches[j].charAt(i);

                if(c!='-')
                {
                    if(c=='W' && i==j)
                        count+=3;
                    if(c=='D')
                        count+=1;
                    if(c=='L' && i==j)
                        count+=3;
                }
            }

            result[i]=count;

        }








        return  result;
    }


    public static void main(String[] args)
    {
        String[] a1 = new String[]{"-WW","W-W","WW-"};
        String[] a2 = new String[]{"-DD","L-L","WD-"};
        String[] a3 = new String[]{"-DWWD","L-WLL","DD-WD","DDL-L","DDLL-"};


        SoccerLeagues_SRM443_Div2_Level1 obj = new SoccerLeagues_SRM443_Div2_Level1();

        System.out.println(obj.points(a2));

    }

}
