package SRM.Div2;

/**
 * Created with IntelliJ IDEA.
 * User: prajesh
 * Date: 23/3/13
 * Time: 11:02 AM
 * To change this template use File | Settings | File Templates.
 */
public class AccessLevel_SRM218_Div2_Level1 {


    public String canAccess(int[] rights, int minPermission)
    {
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<rights.length;i++)
        {
            if(rights[i]<minPermission)
                sb.append("D");
            else
                sb.append(("A"));
        }

        return sb.toString();
    }


    public static void main(String[] args)
    {
        AccessLevel_SRM218_Div2_Level1 obj = new AccessLevel_SRM218_Div2_Level1();

        System.out.println(obj.canAccess(new int[] {0,1,2,3,4,5},2));
    }
}
