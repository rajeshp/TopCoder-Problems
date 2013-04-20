package SRM.Div1;

/**
 * Created with IntelliJ IDEA.
 * @author : prajesh
 * Date: 20/4/13
 * Time: 3:21 PM
 *
 *
 * TopCoder Collegiate Challenge Semifinal Round 3 - Division I, Level One
 *  Dynamic Programming tutorial example
 */
public class ZigZag {


    public int longestZigZag(int[] sequence)
    {
        int[] a = sequence;
        int maxSequenceLength=0, currentSequenceLength=0,diff=0;

        boolean prevDiffPositive = false;

        for(int i=1;i<a.length;i++)
        {
            diff = a[i]-a[i-1];

            if(i==1)
            {
                if(diff>0)
                    prevDiffPositive=true;
                else
                    prevDiffPositive=false;

                currentSequenceLength++;
            }
            else
            {
                if(diff>0 && !prevDiffPositive)
                {
                    currentSequenceLength++;
                    prevDiffPositive=true;
                }
                else
                {
                    if(diff<0 && prevDiffPositive)
                    {
                        currentSequenceLength++;
                        prevDiffPositive=false;
                    }

                }

            }


            if(currentSequenceLength> maxSequenceLength)
                maxSequenceLength=currentSequenceLength;


        }



        return ++maxSequenceLength;
    }


    public static void main(String[] args )
    {
        int[] case1 = new int[]{ 1, 7, 4, 9, 2, 5 };
        int[] case2 = new int[]{ 1, 17, 5, 10, 13, 15, 10, 5, 16, 8 };
        int[] case3 = new int[]{44};
        int[] case4 = new int[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] case5 = new int[]{ 70, 55, 13, 2, 99, 2, 80, 80, 80, 80, 100, 19, 7, 5, 5, 5, 1000, 32, 32 };
        int[] case6 = new int[]{ 374, 40, 854, 203, 203, 156, 362, 279, 812, 955,
                600, 947, 978, 46, 100, 953, 670, 862, 568, 188,
                67, 669, 810, 704, 52, 861, 49, 640, 370, 908,
                477, 245, 413, 109, 659, 401, 483, 308, 609, 120,
                249, 22, 176, 279, 23, 22, 617, 462, 459, 244 };





        ZigZag obj = new ZigZag();

        System.out.println(obj.longestZigZag(case1));
        System.out.println(obj.longestZigZag(case2));
        System.out.println(obj.longestZigZag(case3));
        System.out.println(obj.longestZigZag(case4));
        System.out.println(obj.longestZigZag(case5));
        System.out.println(obj.longestZigZag(case6));

    }


}
