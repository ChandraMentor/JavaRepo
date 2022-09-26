import java.io.*;

class PrintWriterDemo {

  public static void main(String args[]) {

    try {

      // Create a print writer
      PrintWriter pw = new PrintWriter(System.out);

      // Experiment with some methods
      pw.println(true);
      pw.println('A');
      pw.println(500);
      pw.println(40000L);
      pw.println(45.67f);
      pw.println(45.67);
      pw.println("Hello");
      pw.println(new Integer("99"));

      // Close print writer
      pw.close();
    }
    catch(Exception e) {
      System.out.println("Exception: " + e);
    }
  }
}