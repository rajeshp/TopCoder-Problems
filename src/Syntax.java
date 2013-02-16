import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: TE162141
 * Date: 1/22/13
 * Time: 4:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class Syntax {
   final static HashMap<Character,Character> pairs = new HashMap<Character, Character>();
   final static HashSet<Character> opening_brackets = new HashSet<Character>();
   final static HashSet<Character> closing_brackets = new HashSet<Character>();

    static{
        pairs.put('{','}');
        pairs.put('(',')');
        pairs.put('[',']');


        opening_brackets.add('(');
        opening_brackets.add('{');
        opening_brackets.add('[');


        closing_brackets.add(')');
        closing_brackets.add('}');
        closing_brackets.add(']');
    }

     public static void main(String[] args)
     {
       System.out.println(match("x(y(z{test})abc)"));
       System.out.println(match("()"));
       System.out.println(match("([)] "));
       System.out.println(match("[[]](()){{{}}}"));
       System.out.println(match("abc(def(ghi)"));
     }

   static boolean match(String input)
    {

        Stack<Character> s1 = new Stack<Character>();
        Stack<Character> s2 = new Stack<Character>();

        for(char c : input.toCharArray())
        {
            if(closing_brackets.contains(c) || opening_brackets.contains(c))
            s1.push(c);
        }

        char c = '\0';
        while(!s1.isEmpty())
        {

            if(closing_brackets.contains(s1.peek()))
                s2.push(s1.pop());
            else
            {
                if(!s1.isEmpty() && !s2.isEmpty() &&opening_brackets.contains(s1.peek()) && closing_brackets.contains(s2.peek()))
                {
                    if(pairs.get(s1.peek())==s2.peek())
                    {   s1.pop();
                        s2.pop();
                    }
                    else
                        return false;
                }
                else
                    return false;

            }

        }

        return true;
    }

}


