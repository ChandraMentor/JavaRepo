class ClassDemo2 {

  public static void main(String args[]) {
    
    Integer obj = new Integer("7");
    Class cls = obj.getClass();
    Class supercls = cls.getSuperclass();
    System.out.println(supercls.getName());
  }
}