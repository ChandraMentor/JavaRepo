/* this program shows how to use try - finally blocks
Author : Team - J 
Version: 1.0*/

class except5  { 
	public void Error() throws mychkexception{
		throw (new mychkexception(" exception my myunchkexception"));
	}
	
	public static void main(String args[]){
		
		except5 e = new except5();
		// we are not handling the error here
		System.out.println(" before method call");
		try{
		 e.Error();
		} catch (mychkexception mye){
			System.out.println(mye);
		}finally{
		System.out.println("This part of code executes irrespective of the errors that occur in try block" );
		}
	}
}
 