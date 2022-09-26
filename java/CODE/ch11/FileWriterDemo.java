import java.io.*;
class FileWriterDemo {
public static void main(String args[]) {
 try {
  // Create a file writer
FileWriter fw = new FileWriter(args[0]);
   // Write strings to the file
for(int i=0;i<12;i++) {
fw.write("Line " + i + "\n");
      }
      // Close file writer
  fw.close();
    }
    catch(Exception e) {
      System.out.println("Exception: " + e);
    }
  }
}