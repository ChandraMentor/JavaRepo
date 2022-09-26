import java.io.*;

class LetterCounter {

  public static void main(String args[]) {

    try {

      // Allocate an array to hold letter counts
      int counts[] = new int[26];
      
      // Create a file reader
      FileReader fr = new FileReader(args[0]);

      // Read characters
      int i;
      while((i = fr.read()) != -1) {
        char c = Character.toLowerCase((char)i);
        int k = c - 'a';
        if(k >= 0 && k < 26)
          ++counts[k];
      }

      // Display character counts
      for(int j = 0; j < 26; j++) {
        char c = (char)('a' + j);
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