package SRM.Div2.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: rajeshp
 * Date: 27/7/13
 * Time: 6:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class MovingAverages_SRM209_Div2_Level1 {

    class Time
    {
        int hour;
        int min;
        int sec;

        //parse hh:mm:ss and create a time object
        Time(String s)
        {

            String[] timeArr =

        }

        int getTotalSeconds()
        {
            return (hour * 60 * 60) + (min * 60) + sec;
        }



    }

    public static void main(String[] args)
    {


    }


    int[] calculate(String[] times, int n)
    {
        // condition not given in question
        if(times.length<n) return null;

        List<Integer> result = new ArrayList<Integer>();

        for(int i=0; i<n;i++)


    }



}
