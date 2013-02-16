
/**
 * Created with IntelliJ IDEA.
 * User: TE162141
 * Date: 1/27/13
 * Time: 11:41 PM
 * To change this template use File | Settings | File Templates.
 */
import java.io.*;
import java.net.*;
import java.util.*;

public final class WebServer {
    public static void main(String args[]) throws Exception {

        //Establish the listen socket
        int PORT = 777;
        ServerSocket listenSocket = new ServerSocket(PORT);


        //Process HTTP service requests in an infinite loop
        while(true) {
            //listen for TCP connection request
            //Construct an object to process the HTTP request message
            HttpRequest1 request = new HttpRequest1(listenSocket.accept());
            Thread thread = new Thread(request);
            thread.start();
        }
    }
}
final class HttpRequest1 implements Runnable {

    final static String CRLF ="\r\n";
    Socket socket;

    public HttpRequest1(Socket socket) throws Exception {
        this.socket = socket;
    }


    //Implement the run() method of the Runnable interface
    public void run() {
        try {
            processRequest();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void processRequest() throws Exception {
        //Get references to sockets input and output streams
        InputStream is = this.socket.getInputStream();
        DataOutputStream os = new DataOutputStream(this.socket.getOutputStream());

        //Set up input stream filter
        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        //Get the request line of HTTP message
        String requestLine = br.readLine();
        //Make the server directory C:\Webserver
        String root_dir;
        root_dir = "C:\\WebServer\\";
// Extract the filename from the request line. Assume a GET command
        StringTokenizer tokens = new StringTokenizer(requestLine);
        tokens.nextToken();
        String fileName = tokens.nextToken();
        // Drop the slash at the begginning.
        if(fileName.startsWith("/"))
            fileName = root_dir + fileName.substring(1,fileName.length());

        // Open the requested file.
        FileInputStream fis = null;
        boolean fileExists = true;
        try {
            fis = new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            fileExists = false;
        }

        // Construct the response message.
        String statusLine = null;
        String contentTypeLine = null;
        String entityBody = null;

        if (fileExists) {
            statusLine = "HTTP/1.0 200 OK" + CRLF;
            contentTypeLine = "Content-type: " + contentType(fileName) + CRLF;
        } else {
            statusLine = "HTTP/1.0 404 Not Found" + CRLF;
            contentTypeLine = "NONE";
            entityBody = "\n\n Sorry The File You Requested Is Not There!!";
        }

        // Send the status line.
        os.writeBytes(statusLine);

        // Send the content type line.
        os.writeBytes(contentTypeLine);

        // Send a blank line to indicate the end of the header lines.
        os.writeBytes(CRLF);

        // Send the entity body.
        if (fileExists) {
            sendBytes(fis, os);
            fis.close();
        } else {
            os.writeBytes(entityBody);
        }

        //Close the streams
        os.close();
        br.close();
        socket.close();
    }

    private String contentType(String fileName) {
        if(fileName.endsWith(".htm") || fileName.endsWith(".html"))
            return "text/html";
        else if(fileName.endsWith(".jpg") || fileName.endsWith(".jpeg"))
            return "image/jpeg";
        else if(fileName.endsWith(".gif"))
            return "image/gif";
        else if(fileName.endsWith(".txt"))
            return "text/plain";
        else
            return "application/octet-stream";
    }

    private static void sendBytes(FileInputStream fis, OutputStream os) throws Exception {
        // Construct a 1K buffer to hold bytes on their way to the socket.
        byte[] buffer = new byte[1024];
        int bytes = 0;

        // Copy requested file into the socket's output stream.
        while((bytes = fis.read(buffer)) != -1 )
            os.write(buffer, 0, bytes);
    }
}