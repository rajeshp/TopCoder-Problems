/**
 * Created with IntelliJ IDEA.
 *
 * @author prajesh
 *         Date: 27/4/13
 *         Time: 6:01 PM
 *         To change this template use File | Settings | File Templates.
 */
public class AppendString {

    private static AppendString instance = null;

    public String num="1";

    protected AppendString(){}

    public AppendString(String str ){  this.num += str;}

    public static AppendString getInstance(String str)
    {
       if(instance == null)
       {
           instance = new AppendString();
           instance.num+=str;
       }

        return instance;
    }


    public static void main(String[] args)
    {
        AppendString appString = new AppendString("2");


        for(int i=3;i<10;i++)
        {
            appString = AppendString.getInstance(i+"");
        }

        System.out.println(appString.num );
    }

}
