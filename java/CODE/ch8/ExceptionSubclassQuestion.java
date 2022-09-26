class ExceptionSubclassQuestion {

  public static void main(String args[]) {
    a();
  }

  static void a() {

    try {
      try {
        throw new ExceptionM("M");
      }
      catch(ExceptionN e) {
        System.out.println("Inner catch");
        e.printStackTrace();
      }
    }
    catch(ExceptionM e) {
      System.out.println("Outer catch");
      e.printStackTrace();
    }
  }
}

class ExceptionM extends Exception {
  public ExceptionM(String message) {
    super(message);
  }
}


class ExceptionN extends Exception {
  public ExceptionN(String message) {
    super(message);
  }
}
