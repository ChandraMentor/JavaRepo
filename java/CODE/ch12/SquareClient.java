import java.io.*;
import java.net.*;

class SquareClient {
  private final static int BUFSIZE = 20;

  public static void main(String args[]) {
    try {

      // Get server, port, and value
      String server = args[0];
      int port = Integer.parseInt(args[1]);
      double value = Double.valueOf(args[2]).doubleValue();

      // Create socket
      Socket s = new Socket(server, port);

      // Write value to server
      OutputStream os = s.getOutputStream();
      DataOutputStream dos = new DataOutputStream(os);
      dos.writeDouble(value);

      // Read result from server
      InputStream is = s.getInputStream();
      DataInputStream dis = new DataInputStream(is);
      value = dis.readDouble();
      
      // Display result
      System.out.println(value);

      // Close socket
      s.close();
    }
    catch(Exception e) {
      System.out.println("Exception: " + e);
    }
  }
}