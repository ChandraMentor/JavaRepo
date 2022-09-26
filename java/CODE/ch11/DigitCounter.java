import java.io.*;

class DigitCounter {

  public static void main(String args[]) {

    try {

      // Allocate an array to hold digit counts
      int counts[] = new int[10];
      
      // Create a file reader
      FileReader fr = new FileReader(args[0]);

      // Read characters
      int i;
      while((i = fr.read()) != -1) {
        char c = (char)i;
        int k = c - '0';
        if(k >= 0 && k < 10)
          ++counts[k];
      }

      // Display digit counts
      for(int j = 0; j < 10; j++) {
        char c = (char)('0' + j);
        System.out.print(c + "=");
        System.out.print(counts[j] + "; ");
      }

      // Close file reader
      fr.close();
    }
    catch(Exception e) {
      System.out.println("Exception: " + e);
    }
  }
}