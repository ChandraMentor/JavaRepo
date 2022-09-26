/* This  Program show how to open err stream
Author : Team - J 
Version: 1.0*/
import java.io.*;

class ErrFile{ 
	public static void  main (String args[]) throws Exception{
		FileOutputStream fos = new  FileOutputStream(FileDescriptor.err);
		// we can also pass file and file descriptor objects to fos
		fos.write(65);
		fos.write(67);
		PrintStream ps = new PrintStream ( (OutputStream) fos);
		ps.print("aaaa");
		System.out.println("before clsoing");
		fos.close();
		ps.print("can't print this ..");
		System.out.println("after clsoing");
		//Print stream consumes IOExceptions
		System.out.println(ps.checkError());
	}
	
}