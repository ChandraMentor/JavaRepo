class AverageValue {
  public static void main(String args[]) {
    double da[] = new double[4];
    da[0] = 10.52;
    da[1] = 11.13;
    da[2] = 12.07;
    da[3] = 13.07;
    double total = da[0];
    total += da[1];
    total += da[2];
    total += da[3];
    System.out.println("Average = " + total/4);
  }
}