/* This  Program demonstrates the use of in,out
Author : Team - J 
Version: 1.0*/
import java.io.*;
class iostream9  { 
	public static void  main (String args[]) throws Exception{
		byte c1[] = {22,23,24,25,26,27,28,29,30,31,32};
		nullop  nop = new nullop();
		PrintStream ps = new PrintStream (nop);
		System.out.println(" before setting new out stream ");
		System.setOut(ps);
		System.out.println(" after setting new out stream ");

		FileOutputStream out = new FileOutputStream(FileDescriptor.out);
		//System.setOut(new PrintStream(new BufferedOutputStream(out),true));
		System.setOut(new PrintStream(new BufferedOutputStream(out)));
		
		System.out.println(" after re setting new out stream ");
		System.out.flush();
	}
}