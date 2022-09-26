/* This  Program show how to use PrintStream to write java primitive
types to underlying stream
Version: 1.0*/
import java.io.*;

class PS{ 
	public static void  main (String args[]) throws Exception{
		//public FileOutputStream (String name) throws FileNotFoundException
		FileOutputStream fos = new FileOutputStream ("PS.txt");
		PrintStream d = new PrintStream (fos);
		d.print(22);
		d.print(222222.22222F);
		d.print(2222222.222222);

		fos.close();
	}
}