// Usage:
//   java ChatServer
// There are no command line arguments.
// The server listens for incoming requests
// on port 2000.

import java.net.*;
import java.util.*;

class ChatServer {
  static Vector serverThreads;

  public static void main(String args[]) {
    try {

      // Create vector to hold server threads
      serverThreads = new Vector();

      // Create server socket
      ServerSocket ss = new ServerSocket(2000);

      // Create infinite loop
      while(true) {

        // Accept incoming requests
        Socket s = ss.accept();
     
        // Start a thread to handle this client
        ServerThread st = new ServerThread(s);
        st.start();

        // Add thread to vector
        serverThreads.addElement(st);
      }
    }
    catch(Exception e) {
      System.out.println("Exception: " + e);
    }
  }

  public synchronized static void echoAll(String str) {
    Enumeration e = serverThreads.elements();
    while(e.hasMoreElements()) {
      try {
        ServerThread st = (ServerThread)e.nextElement();
        st.echo(str);
      }
      catch(Exception ex) {
        // Ignore any problems communicating with a client
      }
    }
  }
}

    