import java.net.*;
import java.io.*;

public class clientTCP {
    public static void main(String[] args){
        try {
            Socket socket = new Socket("127.0.0.1", 6969);
            OutputStream os = socket.getOutputStream();
            InputStream is = socket.getInputStream();

            PrintWriter out = new PrintWriter(os, true);
            BufferedReader in = new BufferedReader(new InputStreamReader(is));
            String payload = "hello";

            out.println(payload);
            long start = System.nanoTime();
            String s = in.readLine();
            long end = System.nanoTime();

            System.out.println(s);
            System.out.println(end - start);
            os.close();
            is.close();
            socket.close();
        } catch (Exception e) {
            System.out.println(e);
            return;
        }
        
    }
}