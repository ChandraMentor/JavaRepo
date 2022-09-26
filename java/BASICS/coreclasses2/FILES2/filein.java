/* This  Program show how to read file using byte streams
Author : Team - J 
Version: 1.0*/
import java.io.*;

class filein{ 
	public static void  main (String args[]) throws Exception{
		//public FileInputStream(String name) throws FileNotFoundException
		FileInputStream fis = new FileInputStream("testfile.txt");
		// we can also pass file and file descriptor objects to fis
		int b;
		do{
			b = fis.read();
			System.out.print(b);
		}while(b != -1);
		// close is used to close the file after reading the file
		fis.close();

	}
}