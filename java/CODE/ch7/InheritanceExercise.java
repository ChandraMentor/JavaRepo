interface K1 {
  int intK = 1;
  void methodK();
}

interface K2 extends K1 {
  void methodK();
}

interface K3 extends K2 {
  void methodK();
}

class U implements K3 {
  public void methodK() {
    System.out.println(intK);
  }
}

class InheritanceExercise {
  public static void main(String args[]) {
    U u = new U();
    u.methodK();
  }
}