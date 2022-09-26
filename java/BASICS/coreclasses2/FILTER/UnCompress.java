import java.io.*;
import java.util.zip.*;

class UnCompress{ 
public static void  main (String args[]) throws Exception{
// construct an input stream which holds the data that has to be compressed
FileInputStream fis = new FileInputStream("winzip.bmp");
FileOutputStream fos = new FileOutputStream ("uncomp.bmp");
InflaterInputStream iis = new InflaterInputStream(fis);

int data;
while((data = iis.read()) != -1){
fos.write(data);
 }
fos.close();
  }
}