class MyThread4 implements Runnable {
  String str;
  long msec;

  MyThread4(String str, long msec) {
    this.str = str;
    this.msec = msec;
    new Thread(this).start();
  }
 
  public void run() {
    try {
      while(true) {
        Thread.sleep(msec);
        System.out.println(str);
      }
    }
    catch(InterruptedException ex) {
      ex.printStackTrace();
    }
  }
}

class ThreadDemo4 {

  public static void main(String args[]) {
    
    MyThread4 ta = new MyThread4("A", 1000);
    MyThread4 tb = new MyThread4("B", 3000);
  }
}