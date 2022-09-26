class RandomTotal {
  public static void main(String args[]) {
    double total = 0;
    while(true) {
      double random = 9 * Math.random() + 1;
      System.out.println(random);
      total += random;
      System.out.println("Total = " + total);
      if(total > 100)
        break;
    }
  }
}