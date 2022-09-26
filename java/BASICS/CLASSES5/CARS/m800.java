class Alto800 extends car{ 
int regno;
public m800(int rno){
super(rno);
	}
// we know that all cars will have a break and staring but different
// cars will have different breaking and stearing mechanism.
//abstract method defined
public void brake(int force){
System.out.println(" Brake is applied");
System.out.println(" This car uses air break system");
}

public void turn(int direction,int angle){
System.out.println(" This car uses manual stearing mechanism");
	}
public void modeOfOperation() {
System.out.println("It is run on pertrol");
}

} 