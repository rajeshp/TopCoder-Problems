package SRM.Div2;

/**
 * Created with IntelliJ IDEA.
 * User: rajeshp
 * Date: 2/3/13
 * Time: 4:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class InEqualityChecker_SRM230_Div2_Level1 {


    static int[] getDifferences(int n)
    {
        double n1 = (n * (n-1))/2;

        double s = Math.pow(n1,2);

        double n2 = (n * (n+1))/2;

        double S = Math.pow(n2,2);

        double x = (s+S)/2;

        double y = Math.pow(n,4)/4.0;


        System.out.println(" The return value is : "+(x-y));

        return null;
    }


    public static void main(String[] args)
    {

        getDifferences(2);
        getDifferences(3);
        getDifferences(100);

    }

}
