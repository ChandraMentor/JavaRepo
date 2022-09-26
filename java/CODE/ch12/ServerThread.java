import java.io.*;
import java.net.*;

class ServerThread extends Thread {
  private Socket s;
  private double total = 0;
  
  public ServerThread(Socket s) {
    this.s = s;
    total = 0;
  }

  public void run() {
    
    try {
    
      // Get input and output streams 
      InputStream is = s.getInputStream();
      DataInputStream dis = new DataInputStream(is);
      OutputStream os = s.getOutputStream();
      DataOutputStream dos = new DataOutputStream(os);

      // Create an infinite loop
      while(true) {
      
        // Read value from client
        double value = dis.readDouble();

        // Add the value to the total
        total += value;
     
        // Write sum to client
        dos.writeDouble(total);
      }
    }
    catch(Exception e) {
    }
  }
}
