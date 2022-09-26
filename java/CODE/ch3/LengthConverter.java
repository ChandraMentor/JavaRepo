class LengthConverter {
  public static void main(String args[]) {
    double d = Double.valueOf(args[0]).doubleValue();
    if(args[1].equalsIgnoreCase("Feet"))
      System.out.print(d/3.28 + " Meters");
    if(args[1].equalsIgnoreCase("Meters"))
      System.out.print(d * 3.28 + " Feet");
  }
}
    