import java.io.*;
import java.net.*;
import java.util.*;

class ServerSocketDemo {

  public static void main(String args[]) {
    try {

      // Get port
      int port = Integer.parseInt(args[0]);

      // Create random number generator
      Random random = new Random();

      // Create server socket
      ServerSocket ss = new ServerSocket(port);

      // Create infinite loop
      while(true) {

        // Accept incoming requests
        Socket s = ss.accept();
     
        // Write result to client
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeInt(random.nextInt());
     
        // Close socket
        s.close();
      }
    }
    catch(Exception e) {
      System.out.println("Exception: " + e);
    }
  }
}


