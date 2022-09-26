class ThrowExercise {

  public static void main(String args[]) {
    try {
      System.out.println("Before a");
      a();
      System.out.println("After a");
    }
    catch(ArrayIndexOutOfBoundsException e) {
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
    catch(ArrayIndexOutOfBoundsException e) {
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
    catch(ArrayIndexOutOfBoundsException e) {
      System.out.println("c: " + e);
      throw e;
    }
    finally {
      System.out.println("c: finally");
    }
  }

  public static void d() {
    try {
      int array[] = new int[10];
      System.out.println("Before assignment");
      array[20] = 1;
      System.out.println("After assignment");
    }
    catch(ArrayIndexOutOfBoundsException e) {
      System.out.println("d: " + e);
      throw e;
    }
    finally {
      System.out.println("d: finally");
    }
  }
}
