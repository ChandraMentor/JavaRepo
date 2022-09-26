interface AntiLockBrakes {
  void antiLockBrakes();
}

interface CruiseControl {
  void cruiseControl();
}

interface PowerSteering {
  void powerSteering();
}

abstract class Auto {
}

class Model1 extends Auto 
implements PowerSteering {
  public void powerSteering() {
    System.out.println("Model1: powerSteering");
  }
}

class Model2 extends Auto
implements AntiLockBrakes, CruiseControl {
  public void antiLockBrakes() {
    System.out.println("Model2: antiLockBrakes");
  }
  public void cruiseControl() {
    System.out.println("Model2: cruiseControl");
  }
}

class Model3 extends Auto 
implements CruiseControl {
  public void cruiseControl() {
    System.out.println("Model3: cruiseControl");
  }
}

class Autos {
  public static void main(String args[]) {

    Model1 model1 = new Model1();
    model1.powerSteering();

    Model2 model2 = new Model2();
    model2.antiLockBrakes();
    model2.cruiseControl();

    Model3 model3 = new Model3();
    model3.cruiseControl();
  }
}
  
