package SRM.Div2;

/**
 * Created with IntelliJ IDEA.
 * User: prajesh
 * Date: 19/4/13
 * Time: 3:49 PM
 * To change this template use File | Settings | File Templates.
 */
public class DerivateSequence_SRM322_Div2_Level1 {


    public int[] derSeq(int[] a, int n)
    {

        int[] result = new int[n*(n+1)/2] ;

        int startIndex = result.length - a.length;

        for(int i=0;i<a.length && (startIndex + i)< result.length;i++)
        {
            result[i] =  a[i];
        }





        return result;
    }


    int getParent(int n)
    {
        return (n-1)/2;
    }


    public static void main(String[] args)
    {
        DerivateSequence_SRM322_Div2_Level1 obj = new DerivateSequence_SRM322_Div2_Level1();

        int[] case1  = new int[]{5,6,3,9,-1};

        int[] result1 = obj.derSeq(case1, 3);

        printArray(result1);


    }

    static void printArray(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"  ");
        }
    }


}
