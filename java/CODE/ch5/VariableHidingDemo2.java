class Class2 {
  int i = 1000;

  void f() {
    System.out.println(i);

    for(int i=0;i<5;i++) {
    System.out.print(i + " ");
    }
    System.out.println("");
    System.out.println(i);
  }
}

class VariableHidingDemo2 {
  public static void main(String args[]) {
    Class2 class2 = new Class2();
    class2.f();
  }
}