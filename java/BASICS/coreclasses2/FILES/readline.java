/* This  Program show how to read lines from file
Author : Team - J 
Version: 1.0*/
import java.io.*;

class readline{ 
	public static void  main (String args[]) throws Exception{
		FileReader fr = new FileReader("testfile.txt");
		// we can also pass file and file descriptor objects to fis
		LineNumberReader lnr = new LineNumberReader (fr);
		
		for(int i= 0;i<6;i++){
			String s = lnr.readLine();
			System.out.println(s);
		}
		fr.close();
	}
}