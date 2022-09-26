/* This  Program demonstrates the use of PrintStream( Filteroutputstream)
Author : Team - J 
Version: 1.0*/
import java.io.*;
class iostream7  { 
	public static void  main (String args[]) throws Exception{
		byte c1[] = {22,23,24,25,26,27,28,29,30,31,32};
		byte c2[] = {2,3,4,5,6,7,8,9};
		ByteArrayOutputStream bas = new ByteArrayOutputStream() ;
		PrintStream ps = new PrintStream (bas);
		ps.print(1222);//print integer to stream
		ps.print('a');//print char to stream, Like this we can
			      // write all the primitive datatypes
		// System.out is a public variable of type
		// PrintStream. Here in this example we have used bas
		// as the outputstream java uses the standard input to
		// this printstream
		System.out.println("abc");
		System.setOut(ps);
		// from here onwards every thing will be written to our
		// printstream instead of Screen.
		System.out.println("Can u see this message ???");
	}
}