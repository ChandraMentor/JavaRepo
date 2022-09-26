class DivideByZero {

  public static void main(String args[]) {
    a();
  }

  static void a() {
    b();
  }
  
  static void b() {
    c();
  }

  static void c() {
    d();
  }

  static void d() {
    int i = 1;
    int j = 0;
    System.out.println(i/j);
  }
}