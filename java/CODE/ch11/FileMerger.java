// The syntax to use this application is:
//    java FileMerger inputfile outputfile
// Here, data is read from inputfile0, inputfile1, ...
// and is written to outputfile.  Both of these
// arguments are required.

import java.io.*;

class FileMerger {
  private final static int BUFFERSIZE = 1024;

  public static void main(String args[]) {

    try {
  
      // Create a file output stream
      FileOutputStream fos = 
        new FileOutputStream(args[1]);

      // Create a buffer 
      byte buffer[] = new byte[BUFFERSIZE];

      // Initialize the count
      int count = 0;

      // Process data from the input files
      while(true) {
 
        // Create a file input stream
        String filename = args[0] + count;
        FileInputStream fis;
        try {
          fis = new FileInputStream(filename);
        }
        catch(FileNotFoundException fnfex) {
          break;
        }
        
        // Process data from the file
        while(true) {

          // Read a block from the file
          int i = fis.read(buffer, 0, BUFFERSIZE);
          if(i == -1)
            break;

          // Append data to the output file
          fos.write(buffer, 0, i);
          fos.flush();
        }

        // Increment count
        ++count;
      }

      // Close the output file
      fos.close();
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }
  }
}
          
     