class SumRandom {
  public static void main(String args[]) {
    double sum = 0;
    while(true) {
      sum += Math.random();
      System.out.println(sum);  
      if(sum > 20)
        break;
    }
  }
}