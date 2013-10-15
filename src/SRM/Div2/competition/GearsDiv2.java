package SRM.Div2.competition;

/**
 * Created with IntelliJ IDEA.
 *
 * @author prajesh
 *         Date: 27/8/13
 *         Time: 5:17 PM
 *         To change this template use File | Settings | File Templates.
 */
public class GearsDiv2 {

    public static void main(String[] args)
    {
        String case1 = "LRRR";
        String case2 = "RRR";
        String case3 = "LRLR";
        String case4 = "LRLLRRLLLRRRLLLL";
        String case5 = "RRRRRRRLRRRRRRRLRLRLLRLRLRLRRLRLRLLLRLRLLRLLRRLRRR";

        System.out.println(getmin(case1));
        System.out.println(getmin(case2));
        System.out.println(getmin(case3));
        System.out.println(getmin(case4));
        System.out.println(getmin(case5));

    }

    public static int getmin(String Directions)
    {

        if(Directions==null && Directions.length() > 0) return 0;


        char startingChar = Directions.charAt(0);
        char previousChar = '\0';
        char currentChar = '\0';

        int count=0;

        boolean b = false;

        for(int i=0;i<Directions.length();i++)
        {

            if(i>0)
            {
               currentChar = Directions.charAt(i);

                if((previousChar=='L' && currentChar=='L') || (previousChar=='R' && currentChar=='R'))
                {
                    count++;
                    b=true;
                }

            }



                previousChar = Directions.charAt(i);


            if(i>0 && b)
            {
                previousChar = '\0';
                b=false;
            }


        }


        if(startingChar==currentChar && startingChar==Directions.charAt(1))
            count++;

        return count;
    }

}
