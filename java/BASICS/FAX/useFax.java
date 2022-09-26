/* This  Program is a simple java class which
is used to demonstrated inhetitance
Author : Team - J 
Version: 1.0*/

class useFax  { 
	public static void main(String args[]){
		faxA f1 = new faxA(11111);
		faxB f2 = new faxB(22222);
		f1.callfax(22);
		f1.receivefax(33);
		System.out.println("Now using FaxB Services");
		f2.callfax(44);
		f2.receivefax(55);
		f2.getLastCalledNo();
	}
	
}
 