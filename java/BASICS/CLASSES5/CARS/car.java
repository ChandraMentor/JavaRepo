abstract class car  { 
int regno;
public car(int rno){
regno = rno;
}
public abstract void brake(int force);
public abstract void turn(int direction,int angle);

// here let us assume that all the cars uses the same
// mechanism to open petrol/disel tank.
//concerete method
public void opentank(){
System.out.println(" Tank is opened, now you can fill the tank");
 }
public abstract void modeOfOperation();

} 