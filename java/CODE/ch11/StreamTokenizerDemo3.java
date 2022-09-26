import java.io.*;

class StreamTokenizerDemo3 {

  public static void main(String args[]) {

    try {

      // Create a file reader
      FileReader fr = new FileReader(args[0]);

      // Create a buffered reader
      BufferedReader br = new BufferedReader(fr);

      // Create a stream tokenizer
      StreamTokenizer st = new StreamTokenizer(br);

      // Consider end-of-line as a token
      st.eolIsSignificant(true);

      // Declare variable to count lines
      int lines = 1;

      // Process tokens
      while(st.nextToken() != StreamTokenizer.TT_EOF) {
        switch(st.ttype) {
          case st.TT_EOL:
            ++lines;
        }
      }

      // Display the number of lines
      System.out.println("There are " + lines + " lines");

      // Close file reader
      fr.close();
    }
    catch(Exception e) {
      System.out.println("Exception: " + e);
    }
  }
}