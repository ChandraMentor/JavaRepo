/* This  Program demonstrates the use of LineNumberReader(FilterReader)
how to create a simple class
Author : Team - J 
Version: 1.0*/
import java.io.*;

class iocstream5  { 
	public static void  main (String args[]) throws Exception{
		char c[] = {'a','b','c','\n','d','e','\r','\n','f','g','h','\r','i','j','k'};
		LineNumberReader lnr = new LineNumberReader (new CharArrayReader(c));
		//public int getLineNumber()
		System.out.println(" current line no = " + lnr.getLineNumber());
		//public String readLine() throws IOException
		String S =  lnr.readLine();
		System.out.println(S);
		S = lnr.readLine();
		System.out.println(S);
		System.out.println(" current line no = " + lnr.getLineNumber());
		S =  lnr.readLine();
		System.out.println(S);
		System.out.println(" current line no = " + lnr.getLineNumber());
		lnr.setLineNumber(0);
		System.out.println(lnr.readLine());
		System.out.println(" current line no = " + lnr.getLineNumber());
		System.out.println(lnr.readLine());
		System.out.println(lnr.readLine());
	}
}