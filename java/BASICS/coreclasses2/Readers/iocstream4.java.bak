/* This  Program demonstrates the use of FilterReader (PushBackReader)
how to create a simple class
Author : Team - J 
Version: 1.0*/
import java.io.*;

class iocstream4  { 
	public static void  main (String args[]) throws Exception{
		char c[] = {'a','b','c','d','e','f','g','h','i','j','k'};
		PushbackReader pbr = new PushbackReader (new CharArrayReader(c),100);
		// mark is supported here ??
		System.out.println(" Is mark supported by this stream "+pbr.markSupported());
		System.out.println(" Next available char = " +(char) pbr.read());
		// read multiple chars 
		char cbuf[] = {'z','y','x'};
		pbr.unread('M');
		System.out.println(" character after unread operation =" +(char) pbr.read());
				System.out.println("2 nd character after unread operation =" +(char) pbr.read());
		//public void unread(char[] cbuf) throws IOException
		pbr.unread(cbuf,0,2);
		char tmp[] = new char[10];
		pbr.read(tmp,0,5);
		System.out.println(" 5 chars after unread 2 chars = " + new String(tmp));
		// in the above println function we are constructing new String
		// from a char array

	}
}