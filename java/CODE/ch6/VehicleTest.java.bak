abstract class Vehicle {
  abstract int numWheels();
}

class Car extends Vehicle {
  int numWheels() {
    return 4;
  }
}

class Truck extends Vehicle {
  int numWheels() {
    return 8;
  }
}

class VehicleTest {
  public static void main(String args[]) {
    Vehicle v1 = new Car();
    System.out.println("A car has " + v1.numWheels() + " wheels");
    Vehicle v2 = new Truck();
    System.out.println("A truck has " + v2.numWheels() + " wheels");
  }
}