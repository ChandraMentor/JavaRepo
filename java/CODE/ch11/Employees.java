import java.io.*;
import java.util.*;

public class Employees {
  public static void main(String args[]) {

    try {
      // Create a file reader
    FileReader fr = new FileReader(args[0]);
      // Create a buffered reader
    BufferedReader br = new BufferedReader(fr);
      // Read lines from file
      String s;
      while((s = br.readLine()) != null) {

        // Create string tokenizer
        StringTokenizer st = 
          new StringTokenizer(s, ";");
       
        // Output tokens
        System.out.print("Name: ");
        System.out.println(st.nextToken());

        System.out.print("Designation: ");
        System.out.println(st.nextToken());

        System.out.print("Salary: ");
        System.out.println(st.nextToken() + "\n");
      }

      // Close file reader
      fr.close();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
}