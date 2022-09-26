/* This  Program show how to read file using char streams
Author : Team - J 
Version: 1.0*/
import java.io.*;

class fileread{ 
	public static void  main (String args[]) throws Exception{
		FileReader fr = new FileReader("testfileout1.txt");
		// we can also pass file and file descriptor objects to fis
		char c=0;
		//do{
		for(int i= 0;i<60;i++){
			c = (char)fr.read();
			if(c == -1)
				break;
			System.out.print(c);
		}
		//}while(c != -1);
		// close is used to close the file after reading the file
		fr.close();
	}
}