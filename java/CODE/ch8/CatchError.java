class CatchError {

  public static void main(String args[]) {
    try {
      System.out.println("Try Block");
    }
    catch(Exception e) {
      System.out.println("Exception");
    }
    catch(ArithmeticException e) {
      System.out.println("ArithmeticException");
    }
  }
}