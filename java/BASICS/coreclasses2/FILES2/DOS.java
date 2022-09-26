/* This  Program show how to use dataoutput stream to write java primitive
types to underlying stream
Version: 1.0*/
import java.io.*;

class DOS{ 
	public static void  main (String args[]) throws Exception{
		//public FileOutputStream (String name) throws FileNotFoundException
		FileOutputStream fos = new FileOutputStream ("DOS.txt");
		FileDescriptor f = fos.getFD();
		System.out.println(f);
		DataOutputStream d = new DataOutputStream(fos);
		d.writeInt(22);
		d.writeFloat(222222.22222F);
		d.writeDouble(2222222.222222);

		fos.close();
	}
}