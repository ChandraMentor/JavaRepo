class NestedTryBlocks {

public static void main(String args[]) {
    a();
  }
  static void a() {
 try {
      try {
        System.out.println("Before " + 
          "integer division-by-zero");
        int i = 1;
        int j = 0;
        System.out.println(i/j);
        System.out.println("After " + 
          "integer division-by-zero");
      }
      catch(Exception e) {
        System.out.println("Inner catch block");
        throw e;
      }
      finally {
        System.out.println("Inner finally block");
      }
    }
    catch(Exception e) {
      System.out.println("Outer catch block");
    }
    finally {
      System.out.println("Outer finally block");
    }
  }
}