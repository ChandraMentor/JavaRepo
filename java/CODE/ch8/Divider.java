class Divider {

  public static void main(String args[]) {
    
    try {

      System.out.println("Before Division");
      int i = Integer.parseInt(args[0]);
      int j = Integer.parseInt(args[1]);
      System.out.println(i/j);
      System.out.println("After Division");
    }
    catch(ArithmeticException e) {
      System.out.println("ArithmeticException");
    }
    catch(ArrayIndexOutOfBoundsException e) {
      System.out.println("ArrayIndex" + 
        "OutOfBoundsException");
    }
    catch(NumberFormatException e) {
      System.out.println("NumberFormatException");
    }
    finally {
      System.out.println("Finally block");
    }
  }
}
