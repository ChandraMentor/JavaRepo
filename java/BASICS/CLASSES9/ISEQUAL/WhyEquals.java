/* This class demonstrates what is identity and what is Equivalance
Author : Team - J 
Version: 1.0*/

class WhyEquals { 
	public static void main(String args[]) throws Exception{
		CloneA ca3,ca1,ca2 = new CloneA(20,20);
		ca1 = ca2; //both referring same objects
		System.out.println(" (ca1 == ca2)  =  " +(ca1 == ca2));
		System.out.println(" (ca1.equals(ca2))  =  " +(ca1.equals(ca2)));
		ca3 = (CloneA ) ca1.clone();
		System.out.println(" ... ca1...");
		ca1.showstate();
		System.out.println(" ... ca2...");
		ca2.showstate();
		System.out.println(" ... ca3...");
		ca3.showstate();
		System.out.println(" (ca1 == ca3)  =  " +(ca1 == ca3));
		System.out.println(" (ca1.equals(ca3))  =  " +(ca1.equals(ca3)));
	}
}
 