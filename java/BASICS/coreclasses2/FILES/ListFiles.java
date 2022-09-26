/*this program is used to display the list
of files in our drive*/
import java.io.*;

class ListFiles{ 
	static int nof;
public static void  main (String args[]) throws Exception{
		listFiles("f:\\Windows");
		System.out.println(" No of Files = " + nof);
	}
	private static void listFiles(String dirname){
	File myfile = new File(dirname);
	// check whether the file exists or not and also check
	// whether the user has permission to read in directory or not ??
	int i;
	File fList[];
		fList = myfile.listFiles();
		for(i=0;i<fList.length;i++){
		// if the file is a dierctory call listfiles again
			if(fList[i].isDirectory()){
				System.out.println("D**" +fList[i].getAbsolutePath());
				listFiles(fList[i].getAbsolutePath());
			}
			else
				System.out.println(fList[i].getAbsolutePath());
		nof++;
		}
			
	}
	
}