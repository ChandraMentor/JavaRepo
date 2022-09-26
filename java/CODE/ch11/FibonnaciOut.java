import java.io.*;

class FibonacciOut {

  public static void main(String args[]) {

    try {

      // Create a file output stream
      FileOutputStream fos =
        new FileOutputStream(args[0]);

      // Create a data output stream
      DataOutputStream dos =
        new DataOutputStream(fos);

      // Write 15 Fibonacci numbers
      int count = 0;
      int i = 0;
      int j = 1;
      do {
        dos.writeShort(j);
        int k = i + j;
        i = j;
        j = k;
      } while(++count < 15);
      
      // Close file output stream
      fos.close();
    }
    catch(Exception e) {
      System.out.println("Exception: " + e);
    }
  }
}