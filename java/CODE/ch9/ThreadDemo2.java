class RunnableY implements Runnable {
 
  public void run() {
    try {
      while(true) {
        Thread.sleep(3000);
        System.out.println("Hello");
      }
    }
    catch(InterruptedException ex) {
      ex.printStackTrace();
    }
  }
}
class ThreadDemo2 {
  public static void main(String args[]) {
    
    RunnableY ry = new RunnableY(); 
    Thread t = new Thread(ry);
    t.start();
  }
}