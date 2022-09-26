class I2 {
  String getDescription() {
    return "I2";
  }
}

class J2 extends I2 {
  String getDescription() {
    return "J2 " + super.getDescription();
  }
}

class K2 extends J2 {
  String getDescription() {
    return "K2 " + super.getDescription();
  }
}

class SuperForMethods2 {

  public static void main(String args[]) {

    System.out.println("Instantiating I2");
    I2 obj = new I2();
    System.out.println(obj.getDescription());

    System.out.println("Instantiating J2");
    obj = new J2();
    System.out.println(obj.getDescription());

    System.out.println("Instantiating K2");
    obj = new K2();
    System.out.println(obj.getDescription());
  }
}