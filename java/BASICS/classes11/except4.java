/* this program throws myunchkexception 
Author : Team - J 
Version: 1.0*/

class except4  { 
	public void Error(){
		throw (new myunchkexception(" exception my myunchkexception"));
	}
	
	public static void main(String args[]){
		
		except4 e = new except4();
		// we are not handling the error here
		System.out.println(" before method call");
		//try{
		e.Error();
		//} catch (mychkexception mye){
		//	System.out.println(mye);
		//}
		System.out.println(" after method call  " );
	}
}
 