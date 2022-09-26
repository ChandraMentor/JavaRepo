import java.net.*;

class Sensor {

  public static void main(String args[]) {

    try { 

      // Create destination Internet address
      InetAddress ia = 
        InetAddress.getByName(args[0]);

      // Obtain destination port
      int port = Integer.parseInt(args[1]);

      // Create a datagram socket 
      DatagramSocket ds = new DatagramSocket(); 

      // Establish an infinite loop
      while(true) {

        // Create a random sensor value
        int value = (int)(20 * Math.random());
        String s = "" + value;
        System.out.println("Sensor value is " + s);
        
        // Create a datagram packet
        byte buffer[] = s.getBytes();
        DatagramPacket dp = 
          new DatagramPacket(buffer, buffer.length, ia, port); 

        // Send the datagram packet
        ds.send(dp);

        // Sleep for 20 seconds
        Thread.sleep(20000);
      }
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
}