package SRM.Div1;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author prajesh
 *         Date: 5/7/13
 *         Time: 2:14 AM
 *         To change this template use File | Settings | File Templates.
 */
public class MatchMaking_SRM203_DIV1_Level1 {

    String[] namesMen = null;
    String[] namesWomen = null;
    String[] answersMen = null;
    String[] answersWomen = null;

    public static void main(String[] args)
    {

        Scanner sc  = new Scanner(System.in);

        String namesWomen  =  sc.nextLine().replaceAll("[{]","");
        namesWomen  =  sc.nextLine().replaceAll("\"","");

        //for(String women : namesWomen)
        System.out.println(namesWomen);


    }




}
