package TCI;

import com.sun.media.sound.InvalidFormatException;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: TE162141
 * Date: 2/5/13
 * Time: 4:35 PM
 * To change this template use File | Settings | File Templates.
 */

class MatchMakerMember implements Comparable<MatchMakerMember>
{
   String name;
   char gender;
   char interstedIn;

   char[] answers;

   public MatchMakerMember()
   {

   }

   public MatchMakerMember(String str)
   {
     String[] s = str.split(" ");
     name = s[0];
     gender=s[1].charAt(0);
     interstedIn = s[2].charAt(0);
     answers =  new char[s.length-3];
     int i=3,j=0;
     while(i<s.length)
     {
         answers[j++]=s[i++].charAt(0);
     }

   }

    @Override
   public boolean equals(Object m)
   {
       if(this.name.equals(m))
           return true;
       else
           return false;
   }

   @Override
   public int hashCode()
   {
     return this.name.hashCode();
   }

   public int compareTo(MatchMakerMember a)
   {
     return matchAnswers(this.answers,a.answers);
   }


    public static int matchAnswers(char[] c1, char[] c2)
    {
        int result=0;

        if(c1.length == c2.length)
        {

            for(int i=0;i<c1.length;i++)
            {
                if(c1[i]==c2[i])
                    result++;
            }

        }


        return result;
    }

}

public class MatchMaker_TCI01_Div1_Level1 {

    public String[] getBestMatches(String[] param0, String param1, int param2)
    {
        HashMap<String, MatchMakerMember> members = new HashMap<String, MatchMakerMember>();

        Set<MatchMakerMember> males = new HashSet<MatchMakerMember>();
        Set<MatchMakerMember> females = new HashSet<MatchMakerMember>();

        Map<Integer,ArrayList<String>> matches = new TreeMap<Integer, ArrayList<String>>();


        for(String s : param0)
        {
            MatchMakerMember m = new MatchMakerMember(s);

            members.put(m.name,m);

            if(m.gender=='M')
                males.add(m);
            else
                if(m.gender == 'F')
                    females.add(m);
                else
                {
                   System.out.println("Invalid input format :"+s);
                }


        }

        MatchMakerMember currentMember = members.get(param1);
        int matchesCount=0;
        if(currentMember.interstedIn=='M')
        {
            //search all males
            for(MatchMakerMember mem : males)
            {
               if(!mem.name.equals(currentMember.name))
               matchesCount =  MatchMakerMember.matchAnswers(currentMember.answers, mem.answers);

                if(matchesCount>0 && matchesCount >= param2)
                {
                    if(matches.containsKey(matchesCount))
                    {
                        matches.get(matchesCount).add(mem.name);
                    }
                    else
                    {
                        ArrayList<String> al = new ArrayList<String>();
                        al.add(mem.name);
                        matches.put(matchesCount,al);
                    }
                }
                matchesCount=0;
            }

        }
        else
            if(currentMember.interstedIn=='F')
            {
                //search all females
                for(MatchMakerMember mem : females)
                {
                    if(!mem.name.equals(currentMember.name))
                    matchesCount =  MatchMakerMember.matchAnswers(currentMember.answers, mem.answers);

                    if(matchesCount>0 && matchesCount >= param2)
                    {
                        if(matches.containsKey(matchesCount))
                        {
                            matches.get(matchesCount).add(mem.name);
                        }
                        else
                        {
                            ArrayList<String> al = new ArrayList<String>();
                            al.add(mem.name);
                            matches.put(matchesCount,al);
                        }
                    }

                    matchesCount=0;
                }
            }
        else
            {
                System.out.println("Input format expect"+currentMember.interstedIn);
            }


        ArrayList<String> result = new ArrayList<String>();

        int maxsf = 0;
        if(matches.size()>0)
         maxsf = Collections.max(matches.keySet());

        if(matches.size()>0)
        {
            int x=0;

            for(int i=maxsf;i>=0;i--)
            {

                if(matches.containsKey(i))
                    result.addAll(matches.get(i));

            }


        }

        Object[] results= result.toArray();
        String[] strResults = new String[results.length];

        for(int i=0;i<results.length;i++)
        {
            strResults[i] =  results[i].toString();
        }


        return strResults ;
    }




    public static void main(String[] args)
    {
      //  MatchMakerMember mem1 = new MatchMakerMember("BETTY F M A A C C");

      String[] strings = {"BETTY F M A A C C",
              "TOM M F A D C A",
              "SUE F M D D D D",
              "ELLEN F M A A C A",
              "JOE M F A A C A",
              "ED M F A D D A",
              "SALLY F M C D A B",
              "MARGE F M A A C C"};


      String case1 = "BETTY";
      int sf1 = 2;

      MatchMaker_TCI01_Div1_Level1 obj = new MatchMaker_TCI01_Div1_Level1();

      String[] result = obj.getBestMatches(strings, case1,sf1);

      System.out.print("{");
        for(int i=0;i<result.length;i++)
            System.out.print(result[i]+",");

        System.out.println("}");

        String case2 = "JOE";
        int sf2 = 1;

        result = obj.getBestMatches(strings, case2,sf2);

        System.out.print("{");
        for(int i=0;i<result.length;i++)
            System.out.print(result[i]+",");

        System.out.println("}");

        String case3 = "MARGE";
        int sf3 = 4;

        result = obj.getBestMatches(strings, case3,sf3);

        System.out.print("{");
        for(int i=0;i<result.length;i++)
            System.out.print(result[i]+",");

        System.out.println("}");

    }

}
