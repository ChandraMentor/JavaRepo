class MobileApp  { 
	
public static void main( String args[]) throws Exception{
		int i;
		RatePlan r;
		cust c1 = new cust ( "suresh","HappyHourPlan");
		cust c2 = new cust ( "raghu","RegularPlan");

		RegularPlan rp;
		HappyHourPlan hhp;

		r= c1.getRatePlan();
		System.out.println(" Suresh  bill ");
		c1.PrintCustDetails();
		r.CalculateBill();

		r= c2.getRatePlan();
		System.out.println(" Cust two bill ");
		c2.PrintCustDetails();
		r.CalculateBill();

		System.out.println(" before calculate bill 2 ");
		//r.CalculateBill2();
	}
} 