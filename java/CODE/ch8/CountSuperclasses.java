class CountSuperclasses {

  public static void main(String args[]) {
    try {
      int count = countSuperclasses(args[0]);
      System.out.println(count);
    }
    catch(ClassNotFoundException e) {
      System.out.println("Class was not found");
    }
    catch(Exception e) {
      System.out.println("Specify class name as argument");
    }
  }

  static int countSuperclasses(String classname) 
  throws ClassNotFoundException {
    Class cls = Class.forName(classname);
    int count = 0;
    while((cls = cls.getSuperclass()) != null) {
      ++count;
    }
    return count;
  }
}