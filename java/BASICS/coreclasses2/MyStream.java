/* This  Program demonstrates how iostream classes can be developed
how to create a simple class
Author : Team - J 
Version: 1.0*/
import java.io.*;
class MyStream extends InputStream  { 
	// we have to provide implementation for read method in sub classes
	private int i =0;
	public int read(){
		i++;
		i = i % 255;
		return (i);
	}
	
}