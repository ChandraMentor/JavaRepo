/* This  Program demonstrates the use of FilterInputStream(DataInputStream)
Author : Team - J 
Version: 1.0*/
import java.io.*;
class iostream5  { 
	public static void  main (String args[]) throws Exception{
		byte c1[] = {22,23,24,25,26,27,28,29,30,31,32};
		byte c2[] = {2,3,4,5,6,7,8,9,0,1,2};
		InputStream in = new ByteArrayInputStream(c1,0,10);
		FilterInputStream f1= new DataInputStream(in);
		f1.mark(10);
		System.out.println(f1.read());
		// we cannot use the below methods as they are not part of
		// FilterInputStream's contract
		//System.out.println(f1.readInt());
		//System.out.println(f1.readFloat());
		f1.reset();
		DataInputStream ds = (DataInputStream) f1;
		f1.mark(10);
		System.out.println(ds.readInt());
		f1.reset();
		f1.mark(10);
		System.out.println(ds.readFloat());
		f1.reset();
		System.out.println(ds.readDouble());
	}
}