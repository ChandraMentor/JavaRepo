class Multiply2Doubles {
  public static void main(String args[]) {
    // Get first double
    double d1 = Double.valueOf(args[0]).doubleValue();
    // Get second double
    double d2 = Double.valueOf(args[1]).doubleValue();
    // Display their product
    double product = d1 * d2;
    System.out.println("Product is " + product);
  }
}