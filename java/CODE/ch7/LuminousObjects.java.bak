interface LuminousObject {
  void lightOff();
  void lightOn();
}

class SolidObject {
}

class Cone extends SolidObject {
}

class LuminousCone extends Cone
implements LuminousObject {

  public void lightOff() {
    System.out.println("LuminousCone: lightOff");
  }

  public void lightOn() {
    System.out.println("LuminousCone: lightOn");
  }
}

class Cube extends SolidObject {
}

class LuminousCube extends Cube 
implements LuminousObject {

  public void lightOff() {
    System.out.println("LuminousCube: lightOff");
  }

  public void lightOn() {
    System.out.println("LuminousCube: lightOn");
  }
}

class LuminousObjects {
  private final static int NUMOBJECTS = 2;

  public static void main(String args[]) {

    LuminousObject luminousObjects[];
    luminousObjects = new LuminousObject[NUMOBJECTS];

    luminousObjects[0] = new LuminousCone();
    luminousObjects[1] = new LuminousCube();
  
    for(int i = 0; i < NUMOBJECTS; i++) 
      luminousObjects[i].lightOn();

    for(int i = 0; i < NUMOBJECTS; i++)
      luminousObjects[i].lightOff();
  }
}
    