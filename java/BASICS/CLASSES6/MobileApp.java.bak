/* This class is a Application class
Author : Team - J 
Version: 1.0*/

class MobileApp  { 
	
	public static void main( String args[]) throws Exception{
		int i;
		IRatePlan r;
		cust c1 = new cust ( "suresh","HappyHourPlan");
		cust c2 = new cust ( "raghu","RegularPlan");
		RegularPlan rp;
		r= c1.getRatePlan();
		System.out.println(" Cust one bill ");
		c1.PrintCustDetails();
		r.CalculateBill();
		r= c2.getRatePlan();
		System.out.println(" Cust two bill ");
		c2.PrintCustDetails();
		r.CalculateBill();
		rp = (RegularPlan ) r;
		System.out.println(" IRatePlan.CONST = " + IRatePlan.CONST);
		System.out.println(" IRatePlan.x = " + IRatePlan.x);
		System.out.println(" r.CONST = " + r.CONST);
		System.out.println(" r.x = " + r.x);
		System.out.println(" rp.CONST = " + rp.CONST);
		System.out.println(" rp.x = " + rp.x);
	}
}
 