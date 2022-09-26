import java.io.*;

class DocComments {
  
  public static void main(String args[]) {

    try {
      
      // Create file reader, buffered reader
      FileReader fr = new FileReader(args[0]);
      BufferedReader br = new BufferedReader(fr);

      // Initialize display flag
      boolean display = false;

      // Process lines from file
      String line;
      while((line = br.readLine()) != null) {
        char array[] = line.toCharArray();
        int length = array.length;
        int i = 0;
        while(true) {
          if(i >= length) 
            break;
          if(array[i] == '/') {
            if((i + 1) < length && array[i + 1] == '*') {
              if((i + 2) < length && array[i + 2] == '*') {
                display = true;
                i += 3;
                continue;
              }
            }
          }
          else if(array[i] == '*') {
            if((i + 1) < length && array[i + 1] == '/') {
              display = false;
              System.out.println("");
              i += 2;
              continue;
            }
          }
          if(display)
            System.out.print(array[i]);
          i += 1;
        }
      }
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
}