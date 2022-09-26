class Foo {
  static int i = 7;
  int j;

  Foo(int j) {
    this.j = j;
  }

  public String toString() {
    return "Foo: i = " + i + "; j = " + j;
  }
}

class ToString {

  public static void main(String args[]) {
    Foo foo = new Foo(23);
    System.out.println(foo);
  }
}