package SRM.Div2;

/**
 * Created with IntelliJ IDEA.
 * User: TE162141
 * Date: 1/23/13
 * Time: 11:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class GridGenerator_SRM256_Div2_Level1 {

    public int generate(int[] row, int[] col)
    {
        int result=0;

        int[][] grid = new int[row.length][row.length];

        for(int i=0;i<row.length;i++)
            grid[0][i]=row[i];

        for(int i=0;i<col.length;i++)
            grid[i][0]=col[i];

        for(int i=1;i<row.length;i++)
        {
            for(int j=1;j<row.length;j++)
            {
                grid[i][j] = grid[i-1][j-1] + grid[i][j-1]+grid[i-1][j];
            }
        }

        result = grid[row.length-1][row.length-1];

        return result;
    }
}
