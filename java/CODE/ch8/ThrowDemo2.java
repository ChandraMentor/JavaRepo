class ThrowDemo2 {

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
      System.out.println("Before throw statement");
      throw new ArithmeticException();
    }
    catch(Exception e) {
      System.out.println("a: " + e);
    }
    finally {
      System.out.println("a: finally");
    }
  }
}