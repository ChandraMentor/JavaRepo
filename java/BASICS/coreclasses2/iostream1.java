//reading from an array and displaying on the console

import java.io.*;

class iostream1 { 
public static void  main (String args[]) throws Exception{
byte c[] = {22,23,24,25,26,27,28,29,30,31,32};
InputStream in = new ByteArrayInputStream(c);
System.out.println("Is mark supported by this stream?"+in.markSupported());
in.mark(10);
System.out.println("Next available byte =" + in.read());

byte b[]= new byte[20];
in.read(c,0,3);
int i;
for(i=0;i<3;i++)
System.out.print(c[i]+" ");
System.out.println();
in.reset();
System.out.println("bytes read=" + in.read(b,0,10));
System.out.println("Available value:" + in.available());
System.out.println("read value:"+in.read());
System.out.println("---------------------------");
   }
}