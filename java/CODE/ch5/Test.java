class AnotherObject {
  int i;
  String s;
  double d;

  AnotherObject(int i, String s, double d) {
    this.i = i;
    this.s = s;
    this.d = d;
  }

  void display() {
    System.out.println("i = " + i + "; s = " + s + "; d = " + d);
  }
}

class Test {
  public static void main(String args[]) {
    AnotherObject ao1 = new AnotherObject(5, "Hello", 3.4E100);
    AnotherObject ao2 = ao1;
    ao1.i = 3;
    ao1.s = "New string";
    ao1.d = 6.02E23;
    ao2.display();
  }
}