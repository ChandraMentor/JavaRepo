/* This  class behaves just like /dev/null on unix
Author : Team - J 
Version: 1.0*/
import java.io.*;
class nullop extends OutputStream  { 
	public void write(int i){}
}