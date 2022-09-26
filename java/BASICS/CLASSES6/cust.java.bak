/* This class is a cust class
Author : Team - J 
Version: 1.0*/

class cust  { 
	String custname;
	IRatePlan rp;
	public cust ( String Name , String rateplan) throws Exception{
		custname=Name;
		// create object of appropriate rate plan
		rp = (IRatePlan) Class.forName(rateplan).newInstance();
	}
	public IRatePlan getRatePlan(){
		return (rp);
	}
	public void PrintCustDetails(){
		System.out.println(" Cust Name = " + custname);
		System.out.println(" Rate Plan = " + rp);
	}
}
 