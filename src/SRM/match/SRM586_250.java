package SRM.match;

/**
 * Created with IntelliJ IDEA.
 *
 * @author prajesh
 *         Date: 27/7/13
 *         Time: 9:58 PM
 *         To change this template use File | Settings | File Templates.
 */
public class SRM586_250 {

    public static void main(String[] args)
    {
       //case 1

        int[] pref1 = new int[]{1, 2, 3, 4};
        int[] pref2 = new int[]{1, 2, 3, 4};

        int[] pref3 = new int[]{6, 1, 5, 2, 3, 4};

        int[] pref4 = new int[]{1, 6, 3, 4, 5, 2} ;

        int[] pref5 = new int[]{8, 7, 1, 2, 4, 5, 6, 3, 9};
        int[] pref6 = new int[]{7, 2, 4, 8, 1, 5, 9, 6, 3} ;

        int[] pref7 = new int[]{1, 2, 3, 4};
        int[] pref8 = new int[]{1, 2, 3, 4};


        System.out.println(simulate(pref1,pref2));
        System.out.println(simulate(pref3,pref4));
        System.out.println(simulate(pref5,pref6));
        System.out.println(simulate(pref7,pref8));


          //printArray(simulate(pref1,pref2));
    }


    public static String charArr2String(char[] s)
    {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length;i++)
            sb.append(s[i]);

        return sb.toString().substring(1);
    }


    public static String simulate(int[] preference1, int[] preference2)
    {

        if(preference1==null || preference2 == null || preference1.length!=preference2.length) return null;

        int[] result = new int[preference1.length];


        int i=0;

        int ptr1=0, ptr2=0;
        /*while(true)
        {


            if(i%2==0)
            {
                //captain 1 chooses

                while(result[preference1[ptr1]-1]!=0)
                {
                    ptr1++;
                }
                result[preference1[ptr1]-1]=1;

            }
            else
            {

                //captain 2 chooses

                while(result[preference2[ptr2]-1]!=0)
                {
                    ptr2++;
                }
                result[preference2[ptr2]-1]=2;

            }
            ptr1++;
            ptr2++;

            i++;

            if(ptr1==preference1.length && i==preference2.length)
                break;

        }



*/



        char[] r = new char[preference1.length+1];


        int chance=0;

        while(true)
        {


            if(chance==preference1.length)
                break;


            if(chance%2==0)
            {
                //captain 1 chooses

                while(r[preference1[ptr1]]!=0)
                {
                    ptr1++;
                }

                r[preference1[ptr1]]='1';
                ptr1++;

            }
            else
            {

                //captain 2 chooses

                while(r[preference2[ptr2]]!=0)
                {
                    ptr2++;
                }
                r[preference2[ptr2]]='2';

                ptr2++;
            }

            chance++;


        }





        return  new String(r);
    }





}
