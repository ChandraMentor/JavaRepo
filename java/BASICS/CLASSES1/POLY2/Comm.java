/* This  class is to represent commercial connection
Author : Team - J 
Version: 1.0*/

class Comm extends Conn { 

	Comm(int connid,String custname){
			super(connid,custname);
	}

// try to remove this method and compile and u will be knowing the real advt of going to 
// abstract method.
	float claculateBill(int noofunits){
		System.out.println(" u'r bill is calculated according to comm connection billing policy");
		return (noofunits * 5);
	}
		
}