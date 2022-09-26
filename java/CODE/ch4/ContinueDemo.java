class ContinueDemo {
  public static void main(String args[]) {
    for(int x = 0; x < 100; x++) {
      if(x < 95) continue;
      System.out.println(x);
    }
  }
}
