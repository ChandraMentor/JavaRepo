import java.io.*;

class Tail {
 
  public static void main(String args[]) {
    
    try {

      // Create random access file
      RandomAccessFile raf = 
        new RandomAccessFile(args[0], "r");

      // Determine number of bytes
      // to display at end of file
      long count = Long.valueOf(args[1]).longValue();
      
      // Determine file length
      long position = raf.length();

      // Seek to the correct position
      position -= count;
      if(position < 0)
        position = 0;
      raf.seek(position);
      
      // Read and display the bytes
      while(true) {
      
        // Read byte
        try {
          byte b = raf.readByte();

          // Display as character
          System.out.print((char)b);
        }
        catch(EOFException eofe) {
          break;
        }
      }
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
}