package SRM.Div2;

/**
 * Created with IntelliJ IDEA.
 * User: TE162141
 * Date: 1/24/13
 * Time: 1:02 AM
 * To change this template use File | Settings | File Templates.
 */
public class Hyphenated_SRM202_Div2_Level2 {

    public double avgLength(String[] lines)
    {
        StringBuilder word = new StringBuilder();

        int totalchars=0,wordcount=0;

        for(String line : lines)
        {

            for(char c : line.toCharArray())
            {
                if((c>=65 && c<=90) || (c>=97 && c<=122))
                    word.append(c);
                else
                {
                    if(c=='-')
                    {
                      if(word.length()!=0)
                      {
                          totalchars+=word.length();
                          wordcount++;
                          word.delete(0,word.length());
                      }
                    }

                    if(c=='.')
                    {
                        totalchars+=word.length();
                        wordcount++;
                        word.delete(0,word.length());
                    }

                    if(c==' ')
                    {
                       if(word.length()==0)
                       {
                           continue;
                       }
                        else
                       {
                           totalchars+=word.length();
                           wordcount++;
                           word.delete(0,word.length());
                       }
                    }
                }
            }

        }

        return totalchars*1.0/wordcount;
    }


    public static void main(String[] args)
    {
        System.out.println(new Hyphenated_SRM202_Div2_Level2().avgLength(new String[] {"All the time I have well-defined  "," trouble."} ));
    }
}
