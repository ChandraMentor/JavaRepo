/* This  Program show how to make two FileOutputStreams pointing to 
same file
Author : Team - J 
Version: 1.0*/
import java.io.*;

class Duplicate{ 
	public static void  main (String args[]) throws Exception{
		FileOutputStream fos1 = new  FileOutputStream("Duplicate.txt");
		FileDescriptor fd1 = fos1.getFD();
		System.out.println("fos1.getFD()  = "+ fos1.getFD());
		FileOutputStream fos2 = new  FileOutputStream(fd1);
		System.out.println("fos2.getFD()  = "+ fos2.getFD());
		fos1.write(65);
		fos2.write(66);
		fos2.close();
		// We can't write once one stream is closed
		fos1.write(67);
		fos1.close();
	}
	
}