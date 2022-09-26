/* This  Program show how to use PrintStream to write java primitive
types to underlying stream
Version: 1.0*/
import java.io.*;

class OUT1{ 
	public static void  main (String args[]) throws Exception{
// files can be open by using the pre -defined file descriptors 0,1,,2
		
		FileOutputStream fos = new FileOutputStream (FileDescriptor.out);
// In this example fos is pointing to stdout, same technique is used in system class
		DataOutputStream d = new DataOutputStream(fos);
		d.writeInt(10);
		d.writeInt(101);
		d.writeInt(10);
		d.writeFloat(222222.22222F);
		d.writeDouble(2222222.222222);

		fos.close();
	}
}