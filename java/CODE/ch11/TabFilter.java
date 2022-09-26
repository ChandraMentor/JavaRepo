import java.io.*;

class TabFilter {

  public static void main(String args[]) {

    try {

      // Create a buffered reader
      FileReader fr = new FileReader(args[0]);
      BufferedReader br = new BufferedReader(fr);

      // Create a buffered writer
      FileWriter fw = new FileWriter(args[1]);
      BufferedWriter bw = new BufferedWriter(fw);

      // Convert tab to space characters
      String s;
      while((s = br.readLine()) != null) {
        for(int i = 0; i < s.length(); i++) {
          char c = s.charAt(i);
          if(c == '\t') 
            c = ' ';
          bw.write(c);
        }
      }

      // Flush buffered writer
      bw.flush();

      // Close file reader and writer
      fr.close();
      fw.close();
    }
    catch(Exception e) {
      System.out.println("Exception: " + e);
    }
  }
}