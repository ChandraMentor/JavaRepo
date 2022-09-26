import java.io.*;
import java.util.*;

class FileSlice {

  public static void main(String args[]) {

    try {

      // Create a buffered reader
      FileReader fr = new FileReader(args[0]);
      BufferedReader br = new BufferedReader(fr);

      // Obtain start and end field indexes
      int f1 = Integer.parseInt(args[1]);
      int f2 = Integer.parseInt(args[2]);

      // Create an infinite loop
      while(true) {
    
        // Read a line from the file
        String line = br.readLine();
        if(line == null)
          break;

        // Create a string tokenizer
        StringTokenizer st = new StringTokenizer(line);

        // Process tokens
        String output = "";
        int f = 0;
        while(st.hasMoreTokens()) {
          ++f;
          String token = st.nextToken();
          if(f >= f1 && f <= f2) {
            output += token + " ";
          }
        }
          
        // Display output
        System.out.println(output);
      }
    }
    catch(Exception e) {
      System.out.println("Exception: " + e);
    }
  }
}