interface J {
  int j = 200;
  int j1();
}

interface K {
  double k1();
}

interface L extends J, K {
  boolean l1();
}

class I implements L {
  
  public int j1() {
    return 4;
  }

  public double k1() {
    return 6.8;
  }

  public boolean l1() {
    return true;
  }
}

class InterfaceInheritance {
  
  public static void main(String args[]) {
    I i = new I();
    System.out.println(i.j);
    System.out.println(i.j1());
    System.out.println(i.k1());
    System.out.println(i.l1());
  }
}