package SRM.Div2;

/**
 * Created with IntelliJ IDEA.
 * User: TE162141
 * Date: 1/29/13
 * Time: 2:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class DitherCounter_SRM208_Div2_Level1 {



    public int count(String dithered, String[] screen)
    {
        int result=0;
        for(char c : dithered.toCharArray())
        {

            for(String row : screen)
            {

                for(char pixel : row.toCharArray())
                {
                    if(c==pixel)
                        result++;
                }

            }

        }

        return result;
    }


}
