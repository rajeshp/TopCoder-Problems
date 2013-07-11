package DP;

/**
 * Created with IntelliJ IDEA.
 * User: prajesh
 * Date: 22/4/13
 * Time: 10:06 PM
 *
 *  Single Round Match 467 Round 1 - Division II, Level One
 */
public class SuperSum {

    public int calculate(int k, int n)
    {
        int tableSize=0;

            tableSize=1+n;

        int[][] table = new int[tableSize][tableSize];

        for(int i=0;i<=n;i++)


            table[0][i] = i;

        int sum=0,row=0,col=0;


        for(row=1;row<=n;row++)
        {

            for(col=0;col<=n;col++)
            {
                sum += table[row-1][col];
                table[row][col] = sum;
            }

            sum=0;

        }


        return table[k][n];


    }



    public static void main(String[] args)
    {
        int[] test1 = new int[]{1,3};
        int[] test2 = new int[]{2,3};
        int[] test3 = new int[]{4,10};
        int[] test4 = new int[]{10,10};


        SuperSum  obj = new SuperSum();

        System.out.println(obj.calculate(test1[0],test1[1]));
        System.out.println(obj.calculate(test2[0],test2[1]));
        System.out.println(obj.calculate(test3[0],test3[1]));
        System.out.println(obj.calculate(test4[0],test4[1]));

    }


}
