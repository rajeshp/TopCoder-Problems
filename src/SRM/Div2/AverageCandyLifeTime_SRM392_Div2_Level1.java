package SRM.Div2;

/**
 * Created with IntelliJ IDEA.
 * User: TE162141
 * Date: 1/30/13
 * Time: 4:01 PM
 * To change this template use File | Settings | File Templates.
 */
public class AverageCandyLifeTime_SRM392_Div2_Level1 {

    static int[] days =  new int[]{31,28,31,30,31,30,31,31,30,31,30,31};

    public double getAverage(int[] eatenCandies)
    {
        int n=0;
        double sum=0;

        for(int i=0;i<eatenCandies.length;i++)
        {
            if(eatenCandies[i]>0)
            {
               sum+= ( eatenCandies[i]  * lifeTime(i));
               n+=eatenCandies[i];
            }

        }

        return sum/n;
    }

    int lifeTime(int month)
    {
        if(month < 0 || month > days.length)
            return  -1 ;

        int sum=0;

        for(int i=0;i<=month;i++)
            sum+=days[i];

        return sum;
    }

    public static void main(String[] args)
    {
       AverageCandyLifeTime_SRM392_Div2_Level1 obj = new AverageCandyLifeTime_SRM392_Div2_Level1();

       System.out.println(obj.getAverage(new int[]{1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
       System.out.println(obj.getAverage(new int[]{0, 1000, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
       System.out.println(obj.getAverage(new int[]{0, 0, 0, 0, 0, 1, 0, 0, 0, 50, 0, 0}));
       System.out.println(obj.getAverage(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}));

    }


}
