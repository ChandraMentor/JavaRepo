/* This  Program demonstrates the use of ByteArrayOutputStream
Author : Team - J 
Version: 1.0*/
import java.io.*;
class iostream3  { 
	public static void  main (String args[]) throws Exception{
		byte c1[] = {22,23,24,25,26,27,28,29,30,31,32};
		byte c2[] = {2,3,4,5,6,7,8,9,0,1,2};
		ByteArrayOutputStream b1= new ByteArrayOutputStream();
		ByteArrayOutputStream b2= new ByteArrayOutputStream(50);
		//try to write something to this stream.
		b1.write(33);
		System.out.println(b2.size());
		b2.write(c1,0,c2.length);
		System.out.println(b2.size());
		byte b[] = b2.toByteArray();
		System.out.println("length of newly created byte array" +b.length);
		System.out.println(b2.toString());
		b2.flush(); // in some output streams flush does nothing
		System.out.println(" size of buffer after flushing " +b2.size());
		b2.reset();
		System.out.println(" size of b2 after resetting = "+b2.size());
		b1.writeTo(b2);
		System.out.println(" size of b2 after writing b1 to b2 = " + b2.size());
	}
}