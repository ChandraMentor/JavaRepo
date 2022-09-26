interface Vehicle {
  void drive(); 
}

abstract class Mammal {
}

class Bear extends Mammal {
}

class Elephant extends Mammal 
implements Vehicle {
  public void drive() {
    System.out.println("Elephant: drive");
  }
}

class Horse extends Mammal 
implements Vehicle {
  public void drive() {
    System.out.println("Horse: drive");
  }
}

class Lion extends Mammal {
}

class InstanceofInterface {
  public final static int NUMMAMMALS = 4;
  
  public static void main(String args[]) {

    // Create an array of mammals
    Mammal mammals[] = new Mammal[NUMMAMMALS];
    
    // Create objects
    mammals[0] = new Bear();
    mammals[1] = new Elephant();
    mammals[2] = new Horse();
    mammals[3] = new Lion();

    // Demonstrate instanceof operator
    for(int i = 0; i < NUMMAMMALS; i++) {
      if(mammals[i] instanceof Vehicle) {
        Vehicle v = (Vehicle)mammals[i];
        v.drive();
      }
    }
  }
}