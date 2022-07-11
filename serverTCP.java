import java.net.*;
import java.io.*;

public class serverTCP {
    public static void main(String[] args){
        try {
            ServerSocket serverSocket = new ServerSocket(6969);
            Socket socket = serverSocket.accept();
            OutputStream os = socket.getOutputStream();
            PrintWriter out = new PrintWriter(os, true);
            out.println("back at you");
            os.close();
            socket.close();
            if(!serverSocket.isClosed())
                serverSocket.close();
        } catch (Exception e) {
            System.out.println(e);
            return;
        }
        
    }
}
