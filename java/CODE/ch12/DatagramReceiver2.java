import java.net.*;

class DatagramReceiver2 {
  private final static int BUFSIZE = 20;

  public static void main(String args[]) {
    try {

      // Obtain port
      int port = Integer.parseInt(args[0]);

      // Create a DatagramSocket object for the port
      DatagramSocket ds = new DatagramSocket(port); 

      // Create a buffer to hold incoming data
      byte buffer[] = new byte[BUFSIZE]; 

      // Create infinite loop
      while(true) {

        // Create a datagram packet
        DatagramPacket dp = 
          new DatagramPacket(buffer, buffer.length);

        // Receive data
        ds.receive(dp); 

        // Display address from the datagram packet
        InetAddress ia = dp.getAddress();
        System.out.println(ia);
        
        // Display port from the datagram packet
        System.out.println(dp.getPort());
      }
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
}