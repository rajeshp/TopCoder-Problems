package SRM.Div2;

/**
 * Created with IntelliJ IDEA.
 * User: TE162141
 * Date: 1/28/13
 * Time: 6:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class GreatFairyWar_SRM557_Div2_Level1 {


    public int minHP(int[] dps, int[] hp)
    {
        /*int total_hits = 0;

        for(int i=0;i<hp.length;i++)
            total_hits+=hp[i] ;


        int result=0;

        int maxlength=0;

        maxlength= (dps.length>hp.length)?hp.length:dps.length ;


        for(int i=maxlength-1;i>=0;i--)
        {
            result += (total_hits * dps[i]);
            total_hits -= hp[i];
        }

        return result;*/




        int totaldps = 0;

        for(int i=0;i<dps.length;i++)
            totaldps+=dps[i] ;


        int result=0;

        int prev=0;


        for(int i=0;i<hp.length;i++)
        {
            result += (totaldps * hp[i]);
            totaldps=totaldps-dps[i];
        }

        return result;

    }



    public static void main(String[] args)
    {
        int[] dps1 = new int[]{1,2};
        int[] dps2 = new int[]{1,1,1,1,1,1,1,1,1,1};
        int[] dps3 = new int[]{20,12,10,10,23,10};
        int[] dps4 = new int[]{5,7,7,5,7,7};
        int[] dps5 = new int[]{30,2,7,4,7,8,21,14,19,12};
        int[] dps6 = new int[]{1};

        int[] hp1 = new int[]{3,4};
        int[] hp2 = new int[]{1,1,1,1,1,1,1,1,1,1};
        int[] hp3 = new int[]{5,7,7,5,7,7};
        int[] hp4 = new int[]{20,12,10,10,23,10};
        int[] hp5 = new int[]{2,27,18,19,14,8,25,13,21,30};
        int[] hp6 = new int[]{1};


        GreatFairyWar_SRM557_Div2_Level1 obj = new GreatFairyWar_SRM557_Div2_Level1();

       System.out.println(obj.minHP(dps1, hp1));
       System.out.println(obj.minHP(dps2, hp2));
       System.out.println(obj.minHP(dps3, hp3));
       System.out.println(obj.minHP(dps4, hp4));
       System.out.println(obj.minHP(dps5, hp5));
       System.out.println(obj.minHP(dps6, hp6));



    }

}
