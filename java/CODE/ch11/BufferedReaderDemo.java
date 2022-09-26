import java.io.*;

class BufferedReaderDemo {
public static void main(String args[]) {
try {
// Create a file reader
FileReader fr = new FileReader(args[0]);
// Create a buffered reader
BufferedReader br = new BufferedReader(fr);
// Read and display lines from file
String s;
while((s=br.readLine())!= null)
System.out.println(s);
// Close file reader
fr.close();
}
catch(Exception e) {
System.out.println("Exception:" + e);
    }
  }
}