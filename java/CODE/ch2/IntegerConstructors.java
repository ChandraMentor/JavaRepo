class IntegerConstructors {
  public static void main(String args[]) {
    Integer iobj1 = new Integer(5);
    Integer iobj2 = new Integer("6");
    int i1 = iobj1.intValue();
    int i2 = iobj2.intValue();
    int sum = i1 + i2;
    System.out.println("i1 = " + i1);
    System.out.println("i2 = " + i2);
    System.out.println("sum = " + sum);
  }
}