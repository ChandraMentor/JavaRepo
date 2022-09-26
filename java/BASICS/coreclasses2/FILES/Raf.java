/* This  Program show how to read/write to a random access file
Author : Team - J 
Version: 1.0*/
import java.io.*;

class Raf{ 
	public static void  main (String args[]) throws Exception{
		RandomAccessFile ras = new RandomAccessFile("ras.txt","rw");
		// we can also pass file and file descriptor objects to fis
		byte b[] = {1,2,3,4,5,65,6,3,33,52,32,2,2,33,4,4}; //photo
		writeRecord(ras,"x",100,10000F,b);
	System.out.println(" record pointer is at " + ras.getFilePointer());
		writeRecord(ras,"y",101,10000F,b);
	System.out.println(" record pointer is at " + ras.getFilePointer());
		writeRecord(ras,"a",102,10000F,b);
		writeRecord(ras,"b",103,10000F,b);
		writeRecord(ras,"c",104,10000F,b);
		printRecords(ras,1);
		printRecords(ras,2);
			printRecords(ras,20);
		ras.close();
	}
	private static void writeRecord(RandomAccessFile r,String name,int eno,
			float sal,byte photo[]) throws Exception{
		r.writeUTF(name);
		r.writeInt(eno);
		r.writeFloat(sal);
		r.write(photo,0,photo.length);
		r.writeUTF("\n");
	}
	private static void printRecords(RandomAccessFile r,int recno) 
						throws Exception{
		long curpos = r.getFilePointer();
		//set the file pointer to approptiate position 
		long newpos = (recno-1) * 30;
		r.seek(newpos);
		System.out.print(r.readUTF()+"  ");
		System.out.print(r.readInt()+"  ");
		System.out.println(r.readFloat());
		//System.out.println(ras.readBytes(photo,0,photo.length);
		//ras.writeString("\n");
		r.seek(curpos);
	}
}