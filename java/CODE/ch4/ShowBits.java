class ShowBits {
  public static void main(String args[]) {
    byte b = -5;
    for(int i = 7; i >= 0; i--) {
      if((b & 0x80) == 0) 
        System.out.println("Bit " + i + " is 0");
      else
        System.out.println("Bit " + i + " is 1");
      b <<= 1;
    }
  }
}