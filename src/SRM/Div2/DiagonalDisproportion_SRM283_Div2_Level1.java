package SRM.Div2;

/**
 * Created with IntelliJ IDEA.
 * User: TE162141
 * Date: 1/23/13
 * Time: 5:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class DiagonalDisproportion_SRM283_Div2_Level1 {

    public int getDisproportion(String[] matrix)
    {
        if(matrix==null) return -1;
        //calculate main diagonal sum
        int main_diagonal_sum=0,collateral_diagonal_sum=0; int c=0,i=0 ;
        for(i=0;i<matrix.length;i++)
        {
            c=(int) matrix[i].charAt(i) - 48;
            if(c>=0 && c<=9)
            main_diagonal_sum+=c;
            else
            {
                break;
            }
        }

      //bad input
        if(i<matrix.length)
            return -1;

        int y=0;
        for(i=matrix.length-1;i>=0;i--)
        {
           c=(int) matrix[i].charAt(y) - 48;
            if(c>=0 && c<=9)
                collateral_diagonal_sum+=c ;
            else
                break;
            y++;
        }

        //bad input
        if(i>0)
            return -1;

        return (main_diagonal_sum-collateral_diagonal_sum);

    }


    public static void main(String[] args)
    {
        System.out.println(new DiagonalDisproportion_SRM283_Div2_Level1().getDisproportion(new String[]{"190","828","373"} ));
        System.out.println(new DiagonalDisproportion_SRM283_Div2_Level1().getDisproportion(new String[]{"9000","0120","0000","9000"} ));
        System.out.println(new DiagonalDisproportion_SRM283_Div2_Level1().getDisproportion(new String[] {"6"}));
        System.out.println(new DiagonalDisproportion_SRM283_Div2_Level1().getDisproportion(new String[] {"7748297018","8395414567","7006199788","5446757413","2972498628","0508396790","9986085827","2386063041","5687189519","7729785238"}));
    }


}
