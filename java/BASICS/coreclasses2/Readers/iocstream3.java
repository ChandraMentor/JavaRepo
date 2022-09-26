import java.io.*;
// consider using buffered reader to improve performance of your application
// StringReader is very similar to InputStreamReader but to construct we have
// to use String as parameter to constructor

class iocstream3  { 
	//inputstream reader reads from inputstream and converts bytes to
	//characters
public static void  main (String args[]) throws Exception{

byte c[] = {65,67,23,33,43,43,55,66,33,22,22};
BufferedReader br = new BufferedReader (new InputStreamReader
		(new ByteArrayInputStream(c)));
// mark is supported here ??
System.out.println(" Is mark supported by this stream "+br.markSupported());
		System.out.println(" Next available char = " +(char) br.read());
		// read multiple chars 
		char tempc[] = new char[c.length];
		//public int read(char[] b,int off,int len)throws IOException
		br.read(tempc,0,5);
		//public long skip(long n)throws IOException
		System.out.println(" no of chars skipped " +br.skip(2));
		System.out.println(" Next available char = " + (char)br.read());
		//System.out.println("character encoding scheme used = " + br.getEncoding()); we can't use this??
		System.out.println("Is stream ready for read "+br.ready());
	}
}