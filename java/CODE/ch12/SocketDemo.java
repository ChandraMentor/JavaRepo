import java.io.*;
import java.net.*;

class SocketDemo {

  public static void main(String args[]) {

    try {

      // Get server and port
      String server = args[0];
      int port = Integer.parseInt(args[1]);

      // Create socket
      Socket s = new Socket(server, port);

      // Read random number from server
      InputStream is = s.getInputStream();
      DataInputStream dis = new DataInputStream(is);
      int i = dis.readInt();

      // Display result
      System.out.println(i);

      // Close socket
      s.close();
    }
    catch(Exception e) {
      System.out.println("Exception: " + e);
    }
  }
}
