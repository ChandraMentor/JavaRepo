/* This is to demonstrate when jvm throws error object
Author : Team - J 
Version: 1.0*/
import java.util.Date;
class err1  { 
	private static void rethrowexception() throws Exception{
		int i=20,j=0;
		try{
			i/=j;
		}catch( Exception e){
			//e.fillInStackTrace();
			throw(new Exception("safdas"));
		}
	}
	
	public static void main(String args[]) throws Exception{
		Date d1 = new Date();
		int i =0;
		try{
		rethrowexception();		
		} catch (Exception e){
			e.printStackTrace();
		}
		
	}
}
 