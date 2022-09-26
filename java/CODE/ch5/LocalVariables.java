class MyObject {
  static short s = 400;  // Static variable
  int i = 200;  // Instance variable

  void f() {
    System.out.println("s = " + s);
    System.out.println("i = " + i);
    short s = 300;  // Local variable
    int i = 100;  // Local variable
    double d = 1E100;  // Local variable
    System.out.println("s = " + s);
    System.out.println("i = " + i);
    System.out.println("d = " + d);
  }
}

class LocalVariables {
  public static void main(String args[]) {
    MyObject myObject = new MyObject();
    myObject.f();
  }
}