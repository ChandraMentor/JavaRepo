class CountOnes {
  public static void main(String args[]) {
    byte count = 0;
    int number = Integer.parseInt(args[0]);
    for(int i = 31; i >= 0; i--) {
      if((number & 0x80000000) != 0) 
        ++count;
      number <<= 1;
    }
    System.out.println(count + " bits are set");
  }
}