/* This  Program show how to use PrintStream to write java primitive
types to underlying stream
Version: 1.0*/
import java.io.*;

class OUT{ 
	public static void  main (String args[]) throws Exception{
// files can be open by using the pre -defined file descriptors 0,1,,2
		
		FileOutputStream fos = new FileOutputStream (FileDescriptor.out);
// In this example fos is pointing to stdout, same technique is used in system class
		PrintStream d = new PrintStream (fos);
		d.print(22);
		d.print(222222.22222F);
		d.print(2222222.222222);

		fos.close();
	}
}