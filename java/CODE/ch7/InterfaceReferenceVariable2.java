interface B {
  void display();
}
  
class D1 {
}

class D2 implements B {
  public void display() {
    System.out.println("D2");
  }
}

class D3 implements B {
  public void display() {
    System.out.println("D3");
  }
}

class InterfaceReferenceVariable2 {
  public static void main(String args[]) {
    B b;
    b = new D1();
    b.display();
    b = new D2();
    b.display();
    b = new D3();
    b.display();
  }
}
    