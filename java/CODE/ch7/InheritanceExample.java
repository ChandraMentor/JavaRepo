interface P {
  int p = 0;
  void fp();
}

interface P1 extends P {
  int p1 = 1;
  void fp1();
}

interface P2 extends P {
  int p2 = 2;
  void fp2();
}

interface P12 extends P1, P2 {
  int p12 = 12;
  void fp12();
}

class Q implements P12 {
  public void fp() {
    System.out.println("fp: " + p);
  }
  public void fp1() {
    System.out.println("fp1: " + p1);
  }
  public void fp2() {
    System.out.println("fp2: " + p2);
  }
  public void fp12() {
    System.out.println("fp12: " + p12);
  }
}

class InheritanceExample {
  public static void main(String args[]) {
    Q q = new Q();
    q.fp();
    q.fp1();
    q.fp2();
    q.fp12();
  }
}

