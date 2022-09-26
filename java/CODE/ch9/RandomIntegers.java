class RandomIntegers {

  public static void main(String args[]) {

    try {

      while(true) {

        int i = (int)(5 * Math.random() + 5);
        System.out.println(i);
        Thread.sleep(3000);
      }
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
}