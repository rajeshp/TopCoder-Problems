package SRM.Div2;

import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: TE162141
 * Date: 1/28/13
 * Time: 6:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class WhichDay_SRM519_Div2_Level1 {





   public String getDay(String[] notOnThisDay)
   {

       Set<String> daysOfWeek = new HashSet<String>();


       String[] days = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

       for(String day : days)
           daysOfWeek.add(day);


       Set<String> notOnThisDaySet = new HashSet<String>();

      for(String day : notOnThisDay)
      {
        notOnThisDaySet.add(day);
      }

      daysOfWeek.removeAll(notOnThisDaySet);

       return (String) daysOfWeek.toArray()[0];
   }


    public static void main(String[] args)
    {
        WhichDay_SRM519_Div2_Level1 obj = new WhichDay_SRM519_Div2_Level1();

        System.out.println(obj.getDay(new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"}));
        System.out.println(obj.getDay(new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Friday", "Thursday"}));
        System.out.println(obj.getDay(new String[]{"Sunday", "Monday", "Tuesday", "Thursday", "Friday", "Saturday"}));
        System.out.println(obj.getDay(new String[]{"Sunday", "Friday", "Tuesday", "Wednesday", "Monday", "Saturday"}));
    }
}
