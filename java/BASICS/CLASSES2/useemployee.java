/* This  Program is a simple java Application which
uses employee data type
Author : Team - J 
Version: 1.0*/

class useemployee  { 
	public static void main(String args[]){
		System.out.println(" no of emps = " + employee.getnoemps());
		employee e1 = new employee("x","addr1",2000.0f,1);
		System.out.println(" no of emps = " + employee.getnoemps());
		employee e2 = new employee("y","addr1",2000.0f,2);
		System.out.println(" salary of e1 =" + e1.incsalary(12.2f));
		System.out.println(" salary of e2 =" + e2.incsalary(12.2f));
		System.out.println(" no of emps = " + employee.getnoemps());
	}
} 