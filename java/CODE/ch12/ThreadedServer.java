import java.net.*;

class ThreadedServer {
  private final static int BUFSIZE = 512;

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
     
        // Start a thread to handle this client
        ServerThread st = new ServerThread(s);
        st.start();
      }
    }
    catch(Exception e) {
      System.out.println("Exception: " + e);
    }
  }
}


