import java.io.*;

class FileCopy {

  public static void main(String args[]) {

    try {

      // Create a file reader
      FileReader fr = new FileReader(args[0]);

      // Create a file writer
      FileWriter fw = new FileWriter(args[1]);

      // Read and copy characters
      int i;
      while((i = fr.read()) != -1) {
        fw.write(i);
      }

      // Close the file writer
      fw.close();

      // Close file reader
      fr.close();
    }
    catch(Exception e) {
      System.out.println("Exception: " + e);
    }
  }
}