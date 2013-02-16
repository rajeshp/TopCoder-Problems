import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created with IntelliJ IDEA.
 * User: Rajesh Rao
 * Date: 1/27/13
 * Time: 11:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyWebServer implements Runnable {

    Socket s =null;

    public MyWebServer(Socket soc)
    {
      s=soc;
    }

    public static void main(String[] args)
    {
        int PORT = 8081;


        if(args[0]!=null)
            PORT = Integer.parseInt(args[0]);



        try
        {

            ServerSocket serverSocket = new ServerSocket(PORT);

            while(true) {
                Socket socket = serverSocket.accept();
                System.out.println("Server listening on port:"+PORT);
                /*Thread thread = new Thread(new MyWebServer(socket));
                thread.start();*/

                ExecutorService threadPool= Executors.newCachedThreadPool();

                threadPool.execute(new MyWebServer(socket));

            }

        }
        catch(IOException ie)
        {
            System.out.println("Server Cannot start on port :"+PORT);
        }
    }


    public void run()
    {

        try
        {
        InputStream in = s.getInputStream();
        s.setKeepAlive(true);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));


            ArrayList arList = new ArrayList();
            String requestLine=null;

             requestLine = br.readLine();

        if(requestLine!=null)
        System.out.println("br.readline()"+requestLine);
            StringTokenizer stringTokenizer=null;
            if(requestLine!=null)
            stringTokenizer = new StringTokenizer(requestLine);
        String method = stringTokenizer.nextToken();
        String file = stringTokenizer.nextToken();
        file = "c:/WebServer"+file;
        System.out.println("file"+file);

        File fileOnDisk = new File(file);

         if(fileOnDisk.exists())
         {
            BufferedReader breader = new BufferedReader(new FileReader(file));


            StringBuffer sb = new StringBuffer();
            String str=null;

            while((str=breader.readLine())!=null)
            {
                sb.append(str + "\r\n");
            }

            bw.write("HTTP/1.1 200 \r\n");
            bw.write("Content-Type: text \r\n");
            bw.write("Content-Length:"+sb.length()+" \r\n");
            bw.write("\r\n");
            bw.write(sb.toString());
         }
          else
         {
            System.out.println("File Not Found "+file+" Http 404 error");
             bw.write("HTTP/1.1 404 \r\n");
             bw.write("Content-Type: text \r\n");
             bw.write("Content-Length:0 \r\n");
             bw.write("\r\n");
         }
            bw.newLine();

            bw.flush();
            bw.close();
            br.close();

            System.out.println("reached here");
        }
        catch(FileNotFoundException ex) {
            System.out.println("Not Found");
        }
        catch(IOException ie)
        {
            System.out.println("IO Exception");
        }


    }



}
