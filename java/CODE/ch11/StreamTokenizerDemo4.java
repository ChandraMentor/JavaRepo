import java.io.*;

class StreamTokenizerDemo4 {

  public static void main(String args[]) {

    try {

      // Create a file reader
      FileReader fr = new FileReader(args[0]);

      // Create a buffered reader
      BufferedReader br = new BufferedReader(fr);

      // Create a stream tokenizer
      StreamTokenizer st = new StreamTokenizer(br);

      // Process tokens
      while(st.nextToken() != StreamTokenizer.TT_EOF) {
        switch(st.ttype) {
          case st.TT_WORD:
            System.out.println(st.lineno() + ") " +
              st.sval);
            break;
          case st.TT_NUMBER:
            System.out.println(st.lineno() + ") " + 
              st.nval);
            break;
          default:
            System.out.println(st.lineno() + ") " + 
              (char)st.ttype);
        }
      }

      // Close file reader
      fr.close();
    }
    catch(Exception e) {
      System.out.println("Exception: " + e);
    }
  }
}