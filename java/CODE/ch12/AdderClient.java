import java.io.*;
import java.net.*;

class AdderClient {
  private final static int BUFSIZE = 512;

  public static void main(String args[]) {
    try {

      // Get server and port
      String server = args[0];
      int port = Integer.parseInt(args[1]);

      // Create socket
      Socket s = new Socket(server, port);

      // Create input and output streams for socket
      InputStream is = s.getInputStream();
      DataInputStream dis = new DataInputStream(is);
      OutputStream os = s.getOutputStream();
      DataOutputStream dos = new DataOutputStream(os);

      // Create buffered reader for console
      InputStreamReader isr = 
        new InputStreamReader(System.in);
      BufferedReader br = 
        new BufferedReader(isr);

      // Create infinite loop
      while(true) {

        // Obtain a number from the user
        System.out.print("Input number: ");
        String str = br.readLine();
        double d = Double.valueOf(str).doubleValue();

        // Send the number to the server
        dos.writeDouble(d);

        // Read total from server
        double total = dis.readDouble();

        // Display total
        System.out.println("Current total: " + total);
      }
    }
    catch(Exception e) {
    }
  }
}