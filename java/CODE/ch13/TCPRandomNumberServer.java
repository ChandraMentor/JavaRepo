// Usage:
//   java TCPRandomNumberServer port
// Here, port is the port on which the server
// accepts incoming client requests

import java.io.*;
import java.net.*;

class TCPRandomNumberServer {
  static TCPBroadcastThread tcpBroadcastThread;

  public static void main(String args[]) {

    // Get port
    int port = Integer.parseInt(args[0]);

    try {

      // Create a separate thread to broadcast
      // the random numbers to the clients
      tcpBroadcastThread = new TCPBroadcastThread();
      tcpBroadcastThread.start();

      // Create server socket
      ServerSocket ss = new ServerSocket(port);

      // Create infinite loop
      while(true) {

        // Accept incoming requests
        Socket s = ss.accept();
     
        // Get a data output stream for this socket
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);

        // Tell the broadcast thread about 
        // this output stream
        tcpBroadcastThread.addDataOutputStream(dos);
      }
    }
    catch(Exception e) {
      System.out.println("Exception: " + e);
    }
  }
}


