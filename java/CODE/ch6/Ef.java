class E {
  int x;
}

class F extends E {
  String x;
}

class Ef {
  public static void main(String args[]) {
    F f = new F();
    f.x = "This is a string";
    System.out.println("f.x = " + f.x);
    E e = new E();
    e.x = 45;
    System.out.println("e.x = " + e.x);
  }
}