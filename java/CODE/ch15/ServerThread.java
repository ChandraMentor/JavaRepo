import java.io.*;
import java.net.*;

class ServerThread extends Thread {
  private BufferedReader br;
  private PrintWriter pw;
  
  public ServerThread(Socket socket) {

    try {

      // Get buffered reader and writer for socket
      InputStream is = socket.getInputStream();
      InputStreamReader isr = new InputStreamReader(is);
      br = new BufferedReader(isr);
      OutputStream os = socket.getOutputStream();
      pw = new PrintWriter(os, true);
    }
    catch(Exception e) {
      // Ignore any problems communicating with client
    }
  }

  public void run() {

    try {

      // Create an infinite loop
      while(true) {
      
        // Read string from a client
        String str = br.readLine();

        // Echo this string to all clients
        ChatServer.echoAll(str);
      }
    }
    catch(Exception e) {
      // Ignore any problems communicating with client
    }
  }

  public void echo(String str) {

    try {

      // Write string to client
      pw.println(str);
    }
    catch(Exception e) {
      // Ignore any problems communicating with client
    }
  }
}