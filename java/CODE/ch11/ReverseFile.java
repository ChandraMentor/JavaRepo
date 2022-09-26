import java.io.*;

class ReverseFile {
public static void main(String args[]) {
try {
// Create random access file
RandomAccessFile raf = 
 new RandomAccessFile(args[0], "r");
 // Initialize position in file
long position = raf.length();
System.out.println(position);

// Process characters in the file
while(position > 0) {
//Update position
position -= 1;
//Seek and read byte
raf.seek(position);
byte b = raf.readByte();
// Display byte as character
System.out.print((char)b);
      }
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
}