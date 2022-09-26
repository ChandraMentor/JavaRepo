// Usage:
//   java TCPRandomNumberClient server port
// Here, server is the dotted decimal or dotted string
// name of the server and port is the port on which
// that server listens for incoming requests

import java.io.*;
import java.net.*;

class TCPRandomNumberClient {
  private final static int BUFSIZE = 512;

  public static void main(String args[]) {
    try {

      // Get server and port
      String server = args[0];
      int port = Integer.parseInt(args[1]);

      // Create socket
      Socket s = new Socket(server, port);

      // Create data input stream
      InputStream is = s.getInputStream();
      DataInputStream dis = new DataInputStream(is);

      // Create infinite loop
      while(true) {

        // Read number from server
        int i = dis.readInt();

        // Display number
        System.out.println(i);
      }
    }
    catch(Exception e) {
    }
  }
}