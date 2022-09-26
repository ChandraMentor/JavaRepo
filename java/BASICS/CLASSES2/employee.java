/* This  Program is a simple java Application which
models an employee data type
Author : Team - J 
Version: 1.0*/

class employee  { 
	private static int nextempno;
	private float sal;
	private String name;
	private String address;
	private int empno;
	private int grade;
	/* static initializer to initialize the nextemp no to 1*/
	static {
		nextempno = 1;
	}
	/* methid returns no of employees*/
	public static int getnoemps(){
		return (nextempno -1 );
	}
	/* constructors*/
	public employee(String name, String address, float sal,int grade){
		this.sal= sal;
		this.name=name;
		this.sal=sal;
		this.grade=grade;
		empno=nextempno;
		nextempno++;
	}

	public float incsalary(float percent){
		sal = sal + (sal * (percent/100.0f));
		// give additional hike depending on grade
		switch(grade){
			case 1:
				sal = sal + 500;
				break;
			case 2:
				sal = sal + 400;
				break;
			case 3:
				sal = sal + 300;
				break;
			case 4:
				sal = sal + 200;
				break;
		}
		return(sal);
	}
	
} 