import java.io.*;

class FibonacciIn {

  public static void main(String args[]) {

    try {

      // Create a file input stream
      FileInputStream fis =
        new FileInputStream(args[0]);

      // Create a data input stream
      DataInputStream dis =
        new DataInputStream(fis);

      // Read and display data
      for(int i = 0; i < 15; i++) {
        System.out.print(dis.readShort() + " ");
      }
      
      // Close file input stream
      fis.close();
    }
    catch(Exception e) {
      System.out.println("Exception: " + e);
    }
  }
}
