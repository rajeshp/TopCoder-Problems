import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: TE162141
 * Date: 1/18/13
 * Time: 7:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class FootBall {

   // static int[] points = new int[]{2,3,7};

    public static void main(String[] args)
    {

        System.out.println(fetchCombinations(2));
        System.out.println(fetchCombinations(3));
        System.out.println(fetchCombinations(4));
    }


    static ArrayList<Integer> points = new ArrayList<Integer>();
    static
    {
        points.add(2);
        points.add(3);
        points.add(5);

    }
    public static int fetchCombinations(int n)
    {

        return getCombinations(points.size()-1,n);
    }

    public static int getCombinations(int index, int target)
    {
       if(index<0 || target<0)  return 0;

       if(points.get(index)==target)  return 1 ; //+getCombinations(index-1, target) + getCombinations(index-1,target-points.get(index));

       return getCombinations(index-1, target) + getCombinations(index-1,target-points.get(index));

    }

}
