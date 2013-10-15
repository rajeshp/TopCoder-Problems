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

   static  class Time
    {
        int hour;
        int min;
        int sec;

        //parse hh:mm:ss and create a time object
        Time(String s)
        {
            if(null!=s)
            {
                String[] timeArr = s.split(":");

                if(timeArr.length==3)
                {
                    hour = Integer.parseInt(timeArr[0]);
                    min = Integer.parseInt(timeArr[1]);
                    sec = Integer.parseInt(timeArr[2]);
                }
            }


        }

        int getTotalSeconds()
        {
            return (hour * 60 * 60) + (min * 60) + sec;
        }



    }

    public static void main(String[] args)
    {

        //case 1

        String[] times1 = new String[]{"01:19:10", "01:17:40", "01:19:44", "01:17:23", "01:17:07"};
        int n1 = 3;

        Integer[] result1 = calculate(times1,n1);


        printResult(result1);


    }

    static void printResult(Integer[] arr)
    {
        if(arr!=null)
        {
            int i=0;
            while(i<arr.length)
            {
                System.out.println(arr[i]+" ");
                i++;
            }
        }
    }



   static int[] getTimesinIntArray(String[] times)
    {
        if(times==null) return null;

        int[] result = new int[times.length];

        int i=0;

        for(String time : times)
        {
            Time objTime = new Time(time);
            result[i++] = objTime.getTotalSeconds();
        }


        return result;
    }


   static  Integer[] calculate(String[] times, int n)
    {
        // condition not given in question
        if(times.length<n) return null;

        int[] intTimes = getTimesinIntArray(times);

        List<Integer> result = new ArrayList<Integer>();

        int temp=0,i=0;


        int wstart=0;
        int wend = wstart + n ;





        for(wstart=0;wend<times.length;wstart++,wend++)
        {
            if(wstart!=0)
            {
                temp = temp  - intTimes[wstart];
                temp = temp  + intTimes[wend]  ;
            }
            else
            {
                for(i=0; i<n;i++)
                {
                    temp += new Time(times[i]).getTotalSeconds();
                }
            }

            result.add(temp/n);
        }

        Integer[] resultArr =  new Integer[result.size()];

        return result.toArray(resultArr);

    }



}
