/* This  Program show how to write file using char streams
Author : Team - J 
Version: 1.0*/
import java.io.*;

class filewrite{ 
	public static void  main (String args[]) throws Exception{
		
		FileWriter fw = new FileWriter  ("testfileout1.txt");
		// we can also use FileOutputStream(String name, boolean append) 
		char c[] = {'a','b','c','d','e','f','g','h','i','j','k'};
		fw.write(c);
		// we can write byte by byte also to fos stream it is same
		// as writing to any of the streams we have seen earlier
		// immediately writes the content to the file on disk
		fw.flush();
		// we now has to close the file
		fw.close();
	}
}