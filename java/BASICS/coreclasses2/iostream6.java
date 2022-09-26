import java.io.*;
class iostream6  { 
public static void  main (String args[]) throws Exception{
byte c1[] = {22,23,24,25,26,27,28,29,30,31,32};
byte c2[] = {2,3,4,5,6,7,8,9};
PipedInputStream pis;
PipedOutputStream pos;
// create an input stream to which we can write
pos= new PipedOutputStream();
// create an input stream and connect it to previously
// created output stream
pis = new PipedInputStream(pos);
pos.write(c1,0,c1.length);
System.out.println("Data available in pis = " +pis.available());
pos.write(c2,0,c2.length);
System.out.println("Data available in pis = " +pis.available());
pis.read(c2,0,c2.length);
System.out.println("Data available in pis = " +pis.available());
}
}