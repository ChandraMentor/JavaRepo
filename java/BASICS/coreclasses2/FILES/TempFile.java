/* This  Program show how to create and use temporary files
Author : Team - J 
Version: 1.0*/
import java.io.*;

class TempFile{ 
	public static void  main (String args[]) throws Exception{
	//public static File createTempFile(String prefix,String suffix)
	File tmpfile = File.createTempFile("TempFile","tmp");
	FileOutputStream fos = new FileOutputStream(tmpfile);
	PrintStream ps = new PrintStream(fos);
	// use print stream so that we can use any of the overloaded
	// print functions
	ps.print("Abc");
	ps.println(123);
	ps.close();
	}
	
}