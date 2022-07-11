import java.net.*;

public class serverUDP {
    public static void main(String[] args){
        try {
            DatagramSocket socket = new DatagramSocket(6970);
            byte[] in = new byte[5];
            DatagramPacket dp = new DatagramPacket(in, 5);
            byte[] payload = "back at you".getBytes("ASCII");
            InetAddress localhost = InetAddress.getLocalHost();
            DatagramPacket dp2 = new DatagramPacket(payload, 11, localhost, 6969);
            socket.receive(dp);
            socket.send(dp2);
            socket.close();
        } catch (Exception e) {
            System.out.println(e);
            return;
        }
        
    }
}
