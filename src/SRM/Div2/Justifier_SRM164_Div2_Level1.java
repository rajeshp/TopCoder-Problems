package SRM.Div2;

/**
 * Created with IntelliJ IDEA.
 * User: TE162141
 * Date: 1/29/13
 * Time: 4:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class Justifier_SRM164_Div2_Level1 {

    public String[] justify(String[] textIn)
    {
        int maxLength=0;

        for(String str : textIn)
        {
            if(maxLength<str.length())
                maxLength=str.length();
        }

        String[] result = new String[textIn.length] ;

        StringBuilder sb = new StringBuilder();

        int count=0;

        for(String str : textIn)
        {
            if(str.length()<maxLength)
            {
                  int diff=maxLength-str.length();

                while(diff!=0)
                {
                    sb.append(" ");
                    diff--;
                }
            }

            sb.append(str);


           result[count++] =  sb.toString();
           sb.delete(0,sb.length());

        }

        return result;
    }


    public static void main(String[] args)
    {
        Justifier_SRM164_Div2_Level1 obj = new Justifier_SRM164_Div2_Level1();

        String[] result1 = obj.justify(new String[]{"BOB","TOMMY","JIM"});

        for(String str : result1)
            System.out.print(str+" ");
        System.out.println();

        String[] result2 = obj.justify(new String[]{"JOHN","JAKE","ALAN","BLUE"});

        for(String str : result2)
            System.out.print(str+" ");
        System.out.println();

        String[] result3 = obj.justify(new String[]{"LONGEST","A","LONGER","SHORT"});

        for(String str : result3)
            System.out.print(str+" ");
        System.out.println();
    }
}
