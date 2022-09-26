import java.io.*;
import java.net.*;

class SquareServer {
  private final static int BUFSIZE = 20;

  public static void main(String args[]) {
    try {

      // Get port
      int port = Integer.parseInt(args[0]);

      // Create server socket
      ServerSocket ss = new ServerSocket(port);

      // Create infinite loop
      while(true) {

        // Accept incoming requests
      Socket s = ss.accept();

        // Read value from client
  InputStream is = s.getInputStream();
  DataInputStream dis = new DataInputStream(is);
   double value = dis.readDouble();

        // Square the input
        value *= value;
     
        // Write result to client
   OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeDouble(value);
     
        // Close socket
        s.close();
      }
    }
    catch(Exception e) {
      System.out.println("Exception: " + e);
    }
  }
}

