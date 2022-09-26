import java.io.*;

class Bistream{
	 static void main (String args[]){
	try{
	BufferedInputStream in =new BufferedInputStream(new FileInputStream("test.txt")); 
	int  i,j=1;
	while((i = in.read ())!= -1){
	System.out.print((char)i);
	if (j==10) 
		in.skip(10);
	if (j==20)
		in.mark(199); //mark at 20th byte so that we can come back
	if(j==30)
		in.reset();
		j++;
	}
	in.close();
	} catch (Exception e){};
	}
}
