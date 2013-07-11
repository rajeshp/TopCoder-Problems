package SRM.Div2;

import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 *
 * @author prajesh
 *         Date: 10/7/13
 *         Time: 5:03 PM
 *         To change this template use File | Settings | File Templates.
 */
public class SRM584_Div2 {

    public static void main(String[] args)
    {

        String name1="ababababab";
        String name2 = "";

        System.out.println(possibleHandles(name1, name2));

    }


    public static int possibleHandles(String familyName, String givenName)
    {
        String name1 = familyName;
        String name2 = givenName;
        int i=0;

        String a=null, b=null;

        Set<String> possibleNames = new HashSet<String>();

        while(i < name1.length())
        {
            a = name1.substring(0,i+1);

            int j=0;

            while(j<name2.length())
            {
                b = name2.substring(0,j+1);
                  j++;
                possibleNames.add(getName(a,b));
            }
              i++;
        }

        return possibleNames.size();
    }

    public static String getName(String name1, String name2)
    {
        if(name1!=null && name2!=null)
            return name1 + name2;
        else
            return null;
    }

}
