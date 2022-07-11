import java.net.*;

public class clientUDP {
    public static void main(String[] args){
        try {
            DatagramSocket socket = new DatagramSocket(6969);
            byte[] in = new byte[11];
            DatagramPacket dp = new DatagramPacket(in, 11);
            byte[] payload = "hello".getBytes("ASCII");
            InetAddress localhost = InetAddress.getLocalHost();
            DatagramPacket dp2 = new DatagramPacket(payload, 5, localhost, 6970);

            socket.send(dp2);
            long start = System.nanoTime();
            socket.receive(dp);
            long end = System.nanoTime();
            
            System.out.println(new String(dp.getData(), "ASCII"));
            System.out.println(end - start);
            socket.close();
        } catch (Exception e) {
            System.out.println(e);
            return;
        }
        
    }
}
