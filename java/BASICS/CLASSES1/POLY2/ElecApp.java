/* This  is main app class where we will demonstrate ploymorphism
Author : Team - J 
Version: 1.0*/

class ElecApp  { 
	public static void main(String a[]){
		Comm c1 = new Comm(1,"commercial user");
		Dom c2 = new Dom(2,"Dommestic  user");
		senBill(c1,200);
		senBill(c2,300);

	}
// method that can prepare bills
	public static void senBill(Conn c, int nou){
		System.out.println(" Dear " + c.getName());
		System.out.println(" Total bill is");
		System.out.println(c.claculateBill(nou));
	}

}