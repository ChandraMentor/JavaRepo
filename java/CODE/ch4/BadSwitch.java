class BadSwitch {
  public static void main(String args[]) {
    int i = 1;
    int j = 2;
    switch(Integer.parseInt(args[0])) {
      case i:
        System.out.println("1");
        break;
      case j:
        System.out.println("2");
        break;
      default:
        System.out.println("Default");
    }
  }
}