package SRM.Div2;

/**
 * Created with IntelliJ IDEA.
 * User: TE162141
 * Date: 2/4/13
 * Time: 7:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class WorkingRabbits_SRM542_Div2_Level1 {

    public double getEfficiency(String[] profit)
    {

        int sum=0;

        for(int i=0;i<profit.length;i++)
        {
            for(int j=0;j<profit[i].length();j++)
            {
                if(profit[i].charAt(j)==profit[j].charAt(i))
                    sum+= (int) profit[i].charAt(j) - 48;
            }
        }

        sum/=2;
        return sum * 1.0 /profit.length;
    }

    public static void main(String[] args)
    {
      WorkingRabbits_SRM542_Div2_Level1 obj = new WorkingRabbits_SRM542_Div2_Level1();

      System.out.println(obj.getEfficiency(new String[] { "071",
              "702",
              "120" }
      ));
      System.out.println(obj.getEfficiency(new String[]{ "00",
              "00" } ));
      System.out.println(obj.getEfficiency(new String[]{ "013040",
              "100010",
              "300060",
              "000008",
              "416000",
              "000800" }
      ));
      System.out.println(obj.getEfficiency(new String[] { "06390061",
              "60960062",
              "39090270",
              "96900262",
              "00000212",
              "00222026",
              "66761201",
              "12022610" }));
    }

}
