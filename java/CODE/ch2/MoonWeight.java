class MoonWeight {
  public static void main(String args[]) {
    // Get earth weight
    double ew = Double.valueOf(args[0]).doubleValue();
    // Display moon weight
    double mw = ew * .17;
    System.out.println("Moon weight: " + mw);
  }
}