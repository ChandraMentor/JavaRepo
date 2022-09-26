import java.io.*;

class ReverseConsoleInput {

  public static void main(String args[]) {

    try {

      // Create an input stream reader
      InputStreamReader isr = new InputStreamReader(System.in);

      // Create a buffered reader
      BufferedReader br = new BufferedReader(isr);

      // Read and process lines from console
      String s;
      while((s = br.readLine()) != null) {
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        System.out.println(sb);
      }

      // Close input stream reader
      isr.close();
    }
    catch(Exception e) {
      System.out.println("Exception: " + e);
    }
  }
}
