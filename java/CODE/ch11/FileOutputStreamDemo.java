import java.io.*;

class FileOutputStreamDemo {

  public static void main(String args[]) {

    try {

      // Create a file output stream
      FileOutputStream fos = 
        new FileOutputStream(args[0]);

      // Write 12 bytes to the file
      for(int i = 0; i < 12; i++) {
        fos.write(i);
      }

      // Close file output stream
      fos.close();
    }
    catch(Exception e) {
      System.out.println("Exception: " + e);
    }
  }
}