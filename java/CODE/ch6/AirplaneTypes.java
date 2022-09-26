abstract class Airplane {
String serial;
public Airplane(String serial) {
this.serial = serial;
 }
//abstract method
abstract int getPassengers();

public String toString() {
Class cls = getClass();
return cls.getName() + ": " +
serial + " " + getPassengers();
  }
}
class B747 extends Airplane {
final static int PASSENGERS = 500;

public B747(String serial) {
  super(serial);
  }

public int getPassengers() {
    return PASSENGERS;
  }
}
class B757 extends Airplane {
final static int PASSENGERS = 300;

public B757(String serial) {
 super(serial);
}
public int getPassengers() {
  return PASSENGERS;
  }
}

 class B767 extends Airplane {
final static int PASSENGERS = 400;

public B767(String serial) {
super(serial);
 }
public int getPassengers() {
return PASSENGERS;
 }
}

class AirplaneTypes {
static int NUMAIRPLANES = 6;

public static void main(String args[]) {
  // Declare and allocate space 
Airplane airplanes[] = new Airplane[NUMAIRPLANES];
    // Create airplanes
 airplanes[0] = new B747("UA1233");
 airplanes[1] = new B767("UA8793");
 airplanes[2] = new B757("UA6733");
 airplanes[3] = new B757("UA4523");
 airplanes[4] = new B747("UA9772");
 airplanes[5] = new B767("UA2331");

    // Display airplanes
 for(int i=0;i<NUMAIRPLANES;i++) {
      Airplane a = airplanes[i];
      System.out.println(a);
    }
  }
}