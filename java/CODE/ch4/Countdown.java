class Countdown {
  public static void main(String args[]) {
    int i = Integer.valueOf(args[0]).intValue();
    for(int j = i; j > 0; j--) 
      System.out.print(j + " ");
    System.out.print("\u0007"); // Bell
  }
}