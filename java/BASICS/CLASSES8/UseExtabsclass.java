/* This class is an concrete class derived from absclass which implements another interface
Author : Team - J 
Version: 1.0*/

class UseExtabsclass{
	public static void main(String args[]){
		Extabsclass eac;
		absclass  ac;
		myinterface mi;
		eac = new Extabsclass();
		eac.aaa();
		eac.CalculateBill111();
		ac = eac;
		ac.aaa();
		ac.CalculateBill111();
		mi = eac;
		mi.aaa();
		mi.CalculateBill111();
	} 
	
}
 