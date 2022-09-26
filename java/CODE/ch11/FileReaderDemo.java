import java.io.*;

class FileReaderDemo {
public static void main(String args[]) {
try {
// Create a file reader
FileReader fr = new FileReader(args[0]);
// Read and display characters
int i;
while((i = fr.read()) != -1) {
System.out.print((char)i);
  }
 // Close file reader
fr.close();
 }
catch(Exception e) {
System.out.println("Exception: " + e);
    }
  }
}