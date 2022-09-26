/* This  Program demonstrates the use of InputStreamReader
how to create a simple class
Author : Team - J 
Version: 1.0*/
import java.io.*;
class iocstream2  { 
	//inputstream reader reads from inputstream and converts bytes to
	//characters
	public static void  main (String args[]) throws Exception{
		byte c[] = {65,67,23,33,43,43,55,66,33,22,22};
		Reader cr = new InputStreamReader(new ByteArrayInputStream(c));
		System.out.println(" Is mark supported by this stream "+cr.markSupported());
		System.out.println(" Next available char = " +(char) cr.read());
		// read multiple chars 
		char tempc[] = new char[c.length];
		//public int read(char[] b,int off,int len)throws IOException
		cr.read(tempc,0,5);
		//public long skip(long n)throws IOException
		System.out.println(" no of chars skipped " +cr.skip(2));
		System.out.println(" Next available char = " + (char)cr.read());
		InputStreamReader ir = (InputStreamReader) cr;
		System.out.println("character encoding scheme used = " + ir.getEncoding());
		System.out.println("Is stream ready for read "+ir.ready());
	}
}