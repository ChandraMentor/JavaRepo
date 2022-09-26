class X {
}

class X1 extends X {
}

class X2 extends X {
}

class X11 extends X1 {
}

class X12 extends X1 {
}

class X21 extends X2 {
}

class X22 extends X2 {
}

class InheritanceHierarchy {
  public static void main(String args[]) {
    X x;
    System.out.println("Instantiating X");
    x = new X();
    System.out.println("Instantiating X1");
    x = new X1();
    System.out.println("Instantiating X11");
    x = new X11();
    System.out.println("Instantiating X12");
    x = new X12();
    System.out.println("Instantiating X2");
    x = new X2();
    System.out.println("Instantiating X21");
    x = new X21();
    System.out.println("Instantiating X22");
    x = new X22();
  }
}