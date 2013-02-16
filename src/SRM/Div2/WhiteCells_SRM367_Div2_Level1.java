package SRM.Div2;

/**
 * Created with IntelliJ IDEA.
 * User: TE162141
 * Date: 1/23/13
 * Time: 6:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class WhiteCells_SRM367_Div2_Level1 {



    public int countOccupied(String[] board)
    {
        int col=0;
        int count=0;

        for(int i=0;i<board.length;i++)
        {


            if(i%2==0)
            {
                col=0;
                while(col<8)
                {
                    if(board[i].charAt(col)=='F')
                        count++;
                    col+=2;
                }
            }
            else
            {
                col=1;
                while(col<8)
                {
                    if(board[i].charAt(col)=='F')
                        count++;
                    col+=2;
                }
            }


        }


        return count;

    }




    public static void main(String[] args)
    {
        String[] case1 = new String[] {"........",
                "........",
                "........",
                "........",
                "........",
                "........",
                "........",
                "........"};

        String[] case2 = new String[]{"FFFFFFFF",
                "FFFFFFFF",
                "FFFFFFFF",
                "FFFFFFFF",
                "FFFFFFFF",
                "FFFFFFFF",
                "FFFFFFFF",
                "FFFFFFFF"};

        String[] case3 = new String[]  {".F.F...F",
                "F...F.F.",
                "...F.F.F",
                "F.F...F.",
                ".F...F..",
                "F...F.F.",
                ".F.F.F.F",
                "..FF..F."} ;


        String[] case4 = new String[]  {"........",
                "..F.....",
                ".....F..",
                ".....F..",
                "........",
                "........",
                ".......F",
                ".F......"};



        WhiteCells_SRM367_Div2_Level1 obj = new WhiteCells_SRM367_Div2_Level1();


        System.out.println(obj.countOccupied(case1));
        System.out.println(obj.countOccupied(case2));
        System.out.println(obj.countOccupied(case3));
        System.out.println(obj.countOccupied(case4));


    }

}
