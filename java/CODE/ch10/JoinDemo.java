class MyThread extends Thread {
  String name;

  public MyThread(String name) {
    this.name = name;
  }

  public void run() {
    try {
      System.out.println("Thread " + name + " starting");
      int t = (int)(20000 * Math.random() + 10000);
      Thread.sleep(t);
      System.out.println("Thread " + name + " terminating");
    }
    catch(Exception e) {
    }
  }
}

class JoinDemo {

  public static void main(String args[]) {
    
    // Create threads
    MyThread a1 = new MyThread("A1");
    MyThread a2 = new MyThread("A2");
    MyThread a3 = new MyThread("A3");

    // Start the threads
    a1.start();
    a2.start();
    a3.start();

    // Wait for the threads to finish
    try {
      a1.join();
      a2.join();
      a3.join();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
    
    // Create threads
    MyThread b1 = new MyThread("B1");
    MyThread b2 = new MyThread("B2");

    // Start the threads
    b1.start();
    b2.start();

    // Wait for the threads to finish
    try {
      b1.join();
      b2.join();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
}