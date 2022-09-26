// The syntax to use this application is:
//    java FileSplitter inputfile outputfile filesize
// Here, inputfile is the name of the file to be split.
// Bytes are read from inputfile and are written to
// outputfile0, outputfile1, outputfile2, ...
// until all of the bytes from inputfile are read.
// The size of each outputfile is specified by filesize.
// The inputfile and outputfile arguments are required.
// If filesize is omitted, a value of 1024 is used.

import java.io.*;

class FileSplitter {

  public static void main(String args[]) {
   
    try {
  
      // Create a file input stream
      FileInputStream fis = 
        new FileInputStream(args[0]);

      // Determine size of the buffer
      int size = 1024;
      if(args.length > 2) {
        size = Integer.parseInt(args[2]);
      }

      // Create a buffer of the correct size
      byte buffer[] = new byte[size];

      // Initialize the count
      int count = 0;

      // Process data from the file
      while(true) {
 
        // Read a block from the file
        int i = fis.read(buffer, 0, size);
        if(i == -1)
          break;

        // Create an output file
        String filename = args[1] + count;
        FileOutputStream fos = 
          new FileOutputStream(filename);
        fos.write(buffer, 0, i);
        fos.flush();
        fos.close();

        // Increment count
        ++count;
      }
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
}
          
     