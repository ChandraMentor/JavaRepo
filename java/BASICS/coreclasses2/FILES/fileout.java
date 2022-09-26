/* This  Program show how to write file using byte streams
Author : Team - J 
Version: 1.0*/
import java.io.*;

class fileout{ 
	public static void  main (String args[]) throws Exception{
		//public FileOutputStream (String name) throws FileNotFoundException
		FileOutputStream fos = new FileOutputStream ("testfileout.txt");
		// we can also use FileOutputStream(String name, boolean append) 
		byte b[] = {65,67,68,10,68,69,70,13,10,71,72};
		fos.write(b);
		// we can write byte by byte also to fos stream it is same
		// as writing to any of the streams we have seen earlier
		// immediately writes the content to the file on disk
		fos.flush();
		// we now has to close the file
		fos.close();
		System.out.println(" cr = " + (int) '\r');
		System.out.println(" lf = " + (int) '\n');
	}
}