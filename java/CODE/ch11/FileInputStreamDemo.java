import java.io.*;

class FileInputStreamDemo {

  public static void main(String args[]) {

    try {

      // Create a file input stream
      FileInputStream fis = 
        new FileInputStream(args[0]);

      // Read and display data
      int i;
      while((i = fis.read()) != -1) {
        System.out.println(i);
      }

      // Close file input stream
      fis.close();
    }
    catch(Exception e) {
      System.out.println("Exception: " + e);
    }
  }
}