package SRM.Div2;

/**
 * Created with IntelliJ IDEA.
 * User: TE162141
 * Date: 1/24/13
 * Time: 2:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class TheSquareDivTwo_SRM457_Div2_Level1 {


    public String[] solve(String[] board)
    {
        int[] checkers =  new int[board.length];
        String[] result = new String[board.length];
        int temp=0;

        for(int i=0;i<board.length;i++)
        {
            temp=0;

            for(char c : board[i].toCharArray())
            {
                if(c=='C') temp++;
            }

            checkers[i]=temp;
        }

        StringBuilder sb = new StringBuilder();
        int x=0;
        for(int i=0;i<checkers.length;i++)
        {
            x=board.length-checkers[i];

            while(x>0)
            {
               sb.append(".");
                x--;
            }

            x=checkers[i]-1;
            while(x>=0)
            {
                sb.append("C");
                x--;
            }

            result[i]=sb.toString();
            sb.delete(0,sb.length());

        }




    return result;
    }


    public static void main(String[] args)
    {
        TheSquareDivTwo_SRM457_Div2_Level1 obj = new TheSquareDivTwo_SRM457_Div2_Level1();

        String[] res =null;


        res = obj.solve(new String[] {"..","C."});

        for(String s : res)
        {
            System.out.println(s);
        }

        System.out.println();
        res = obj.solve(new String[] {"CC",".C"});

        for(String s : res)
        {
            System.out.println(s);
        }

        System.out.println();
        res=obj.solve(new String[] {".C..","CC.C","..C.","CCCC"});
        for(String s : res)
        {
            System.out.println(s);
        }
    }

}
