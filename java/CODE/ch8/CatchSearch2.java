class CatchSearch2 {

  public static void main(String args[]) {
    try {
      System.out.println("Before a");
      a();
      System.out.println("After a");
    }
    catch(Exception e) {
      System.out.println("main: " + e);
    }
    finally {
      System.out.println("main: finally");
    }
  }

  public static void a() {
    try {
      System.out.println("Before b");
      b();
      System.out.println("After b");
    }
    catch(ArithmeticException e) {
      System.out.println("a: " + e);
    }
    finally {
      System.out.println("a: finally");
    }
  }

  public static void b() {
    try {
      System.out.println("Before c");
      c();
      System.out.println("After c");
    }
    catch(ArrayIndexOutOfBoundsException e) {
      System.out.println("b: " + e);
    }
    finally {
      System.out.println("b: finally");
    }
  }

  public static void c() {
    try {
      System.out.println("Before d");
      d();
      System.out.println("After d");
    }
    catch(NumberFormatException e) {
      System.out.println("c: " + e);
    }
    finally {
      System.out.println("c: finally");
    }
  }

  public static void d() {
    try {
      Object obj = new Float("85.56");
      System.out.println("Before cast");
      Double dobj = (Double)obj;
      System.out.println("After cast");
    }
    catch(ClassCastException e) {
      System.out.println("d: " + e);
      int i = 1;
      int j = 0;
      System.out.println("Before division");
      int k = i/j;
      System.out.println("After division");
      System.out.println(k);
    }
    finally {
      System.out.println("d: finally");
    }
  }
}