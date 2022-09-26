/* This  Program demonstrates how iostream classes can be developed
how to create a simple class
Author : Team - J 
Version: 1.0*/
import java.io.*;
class UseMyStream{ 
	public static void main(String args[])  throws IOException{
		
		InputStream s = new MyStream();
		System.out.println(s.read());
		byte b[]= new byte[10];
		s.read(b,0,10);
		int i;
		for(i=0;i<10;i++)
			System.out.println(b[i]);
	}
}