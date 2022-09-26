import java.io.*;

class BufferedInputStreamDemo {
public static void main(String args[]) {

try {

// Create a file input stream
FileInputStream fis = 
new FileInputStream(args[0]);

// Create a buffered input stream
BufferedInputStream bis =
new BufferedInputStream(fis);

// Read and display data
int i;
while((i=bis.read())!=-1) {
System.out.println((char)i);
      }
 // Close file input stream
fis.close();
    }
catch(Exception e) {
System.out.println("Exception: " + e);
    }
  }
}