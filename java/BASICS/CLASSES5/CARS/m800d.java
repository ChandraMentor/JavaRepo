class Swift extends car{ 
int regno;
public m800d(int rno){
super(rno);
}
// we know that all cars will have a break and staring but different
// cars will have different breaking and stearing mechanism.

public void brake(int force){
System.out.println("Brake is applied");
System.out.println("This car uses disc breaking system");
}

public void turn(int direction,int angle){
System.out.println(" This car uses power stearing mechanism");
	}
public void modeOfOperation(){
System.out.println("Works on both the variants");
}

} 