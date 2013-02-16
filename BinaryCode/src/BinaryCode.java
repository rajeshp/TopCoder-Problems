import java.util.*;

public class BinaryCode {

    public static void main(String[] args)
    {
        System.out.println(new BinaryCode().decode("123210122"));
    }

	public String[] decode(String message) {

        String[] result = new String[]{"NONE","NONE"};

        //asuming p[0]=0
        int p0=0;
        StringBuilder sb = new StringBuilder();
        sb.append(p0);

        int q=0,p1=0,p2=0,temp=0;
        int i=0;
        for( i=1;i<message.length();i++)
        {
            q = (int) message.charAt(i-1) - 48;
            p1= (int) sb.charAt(i-1) -48 ;

            if(i-2>0)
                p2 = (int) sb.charAt(i-2) - 48;
            else
                p2=0;

            temp = q-p1-p2;

            if(temp==0 || temp==1)
                sb.append(temp);
            else
                break;

        }

        if(i==message.length())
        result[0] = sb.toString();


        //assuming p0=1
        p0=1;
        sb = new StringBuilder();
        sb.append(p0);
         q=0;p1=0;p2=0;temp=0;
         i=0;
        for( i=1;i<message.length();i++)
        {
            q = (int) message.charAt(i-1) -48 ;
            p1= (int) sb.charAt(i-1) -48 ;

            if(i-2>0)
                p2 = (int) sb.charAt(i-2) - 48;
            else
                p2=0;

            temp = q-p1-p2;

            if(temp==0 || temp==1)
                sb.append(temp);
            else
                break;

        }

        if(i==message.length())
            result[1] = sb.toString();



		return result;
	}
}
