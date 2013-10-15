package SRM.Div2.practice;

/**
 * Created with IntelliJ IDEA.
 *
 * @author prajesh
 *         Date: 2/8/13
 *         Time: 4:35 PM
 *         To change this template use File | Settings | File Templates.
 */
public class FuelConsumption_SRM217 {

    public static void main(String[] args)
    {

        int[]   velocities1 = new int[]{100};
        int[]   fuels1 = new int[]{10000};

        System.out.println(maximalDistance(velocities1,fuels1,10000));

        int[]   velocities2 = new int[]{70, 80, 90, 100, 60, 110};
        int[]   fuels2 = new int[]{4000, 4000, 4000, 4000, 4000, 4000};

        System.out.println(maximalDistance(velocities2,fuels2,40000));

        int[]   velocities3 = new int[]{250, 240, 230, 220, 210, 211};
        int[]   fuels3 = new int[]{5000, 4500, 4000, 3500, 3000, 3000};

        System.out.println(maximalDistance(velocities3,fuels3,50000));

    }


    static double maximalDistance(int[] velocities, int[] consumptions, int fuel)
    {
        double maxDistance=0.0f, temp=0.0f;


        for(int i=0;i<consumptions.length;i++)
        {
            temp  = velocities[i] * (fuel/(double)consumptions[i]);

            if(temp> maxDistance)
                maxDistance=temp;
        }


        return maxDistance;
    }


}
