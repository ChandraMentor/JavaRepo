/* This  Program show how to use File Class
Author : Team - J 
Version: 1.0*/
import java.io.*;

class UseFile{ 
	public static void  main (String args[]) throws Exception{
	File myfile = new File("xyz.txt");
	System.out.println(" File Seperator = "+ File.separatorChar);
	System.out.println(" File Seperator = "+ File.separator);
	System.out.println(" Path Seperator = "+ File.pathSeparatorChar);
	System.out.println(" Is xyz.txt existing " + myfile.exists());
	System.out.println(" get absolute path " +myfile.getAbsoluteFile());
	System.out.println(" isDirectory " + myfile.isDirectory());
	File f[] = File.listRoots(); 
	for(int i =0 ;i < f.length;i++)
		System.out.println("root " + (i+1) +"  "+ f[i].getAbsoluteFile());
	
	}
	
}