class X {
  void f() {
    for(int j = 0; j < 5; j++) {
      int k = 100;
      System.out.println("j = " + j + "; k = " + k);
    }
  }
}

class VariableScope {
  public static void main(String args[]) {
    X x = new X();
    x.f();
  }
}