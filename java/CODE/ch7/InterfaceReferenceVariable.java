interface A {
  void display(String s);
}
  
class C1 implements A {
  public void display(String s) {
    System.out.println("C1: " + s);
  }
}

class C2 implements A {
  public void display(String s) {
    System.out.println("C2: " + s);
  }
}

class C3 implements A {
  public void display(String s) {
    System.out.println("C3: " + s);
  }
}

class InterfaceReferenceVariable {
  public static void main(String args[]) {
    A a;
    a = new C1();
    a.display("String 1");
    a = new C2();
    a.display("String 2");
    a = new C3();
    a.display("String 3");
  }
}
