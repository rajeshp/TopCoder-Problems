package SRM.Div2;

/**
 * @author prajesh
 *
 * This class is the solution for SRM_Div2_Level2 problem FolderAccess
 * Created with IntelliJ IDEA.
 * User: prajesh
 * Date: 23/3/13
 * Time: 11:19 AM
 * To change this template use File | Settings | File Templates.
 */
public class FolderSize_SRMDiv2_Level1 {
    public int[] calculateWaste(String[] files, int folderCount, int clusterSize)
    {
        int[] waste = new int[folderCount] ;

        int[] folders = new int[folderCount];

        for(String file : files)
        {
            String[] fileDetails = file.split(" ");
            int folderIndex = Integer.parseInt(fileDetails[0]);
            folders[folderIndex] += Integer.parseInt(fileDetails[1]);
        }




        for(int i=0;i<folderCount;i++)
        {
            if(folders[i]>0)
            waste[i] = clusterSize - (folders[i] % clusterSize);
        }


        return  waste;
    }






    public static void main(String[] args)
    {

        FolderSize_SRMDiv2_Level1 obj = new FolderSize_SRMDiv2_Level1();

        int[] result1 = obj.calculateWaste(new String[]{"0 55", "0 47", "1 86"}, 3,50);

        for(int i=0;i<result1.length;i++)
            System.out.print(result1[i]+" ");

        System.out.println();

        int[] result2 = obj.calculateWaste(new String[]{"0 123", "2 456", "4 789", "6 012", "8 345"},10,98);

        for(int i=0;i<result2.length;i++)
            System.out.print(result2[i]+" ");

    }





}



