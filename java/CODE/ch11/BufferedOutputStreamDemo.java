import java.io.*;

class BufferedOutputStreamDemo {

  public static void main(String args[]) {

    try {

      // Create a file output stream
      FileOutputStream fos = 
        new FileOutputStream(args[0]);

      // Create a buffered output stream
      BufferedOutputStream bos =
        new BufferedOutputStream(fos);

      // Write 12 bytes to the file
      for(int i = 0; i < 12; i++) {
        bos.write(i);
      }

      // Close buffered output stream
      bos.close();
    }
    catch(Exception e) {
      System.out.println("Exception: " + e);
    }
  }
}