import java.io.*;
import java.util.zip.*;

class Compress{ 
public static void  main (String args[]) throws Exception{
// construct an input stream which holds the data that has to be compressed
FileInputStream fis = new FileInputStream("win.bmp");
FileOutputStream fos = new FileOutputStream ("winzip.bmp");
DeflaterOutputStream dos = new DeflaterOutputStream(fos);

int data;
while((data = fis.read()) != -1){
dos.write(data);
}
dos.close();
 }
}