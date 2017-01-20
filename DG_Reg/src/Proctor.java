
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.channels.DatagramChannel;

/**
 *
 * @author modis
 */
public class Proctor {
    
    public static void main(String args[]){
        try{
//            DatagramChannel dchannel =  DatagramChannel.open();
//            DatagramSocket socket = dchannel.socket();
//            SocketAddress saddress = new InetSocketAddress("192.168.1.18", 5040);
            DatagramSocket socket = new DatagramSocket(5010, InetAddress.getByName("192.168.1.29"));
            byte[] buffer = new byte[100024];
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
           while(true){
            socket.receive(packet);
            
            String msg = new String(buffer, 0, packet.getLength());
            System.out.println("This is receiving Address : "+packet.getSocketAddress()+" : Message is : "+msg);
           }
        }catch(Exception e){
            System.out.println("this is proctor side error : "+e);
        }
    }
}