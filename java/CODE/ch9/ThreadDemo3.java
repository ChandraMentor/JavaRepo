class MyThread3 extends Thread {
  String str;
  long msec;

  MyThread3(String str, long msec) {
    this.str = str;
    this.msec = msec;
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

class ThreadDemo3 {

  public static void main(String args[]) {
    
    MyThread3 ta = new MyThread3("A", 1000);
    MyThread3 tb = new MyThread3("B", 3000);
    ta.start();
    tb.start();
  }
}