class MyThread extends Thread {
  
  public void run() {
    try {
      for(int i = 0; i < 10; i++) {
        int msec = (int)(300 + 500 * Math.random());
        Thread.sleep(msec);
        System.out.print('x');
      }
    }
    catch(InterruptedException ex) {
      ex.printStackTrace();
    }
  }
}

class FiveThreads {
  private static int NUMTHREADS = 5;

  public static void main(String args[]) {

    // Create threads
    MyThread threads[] = new MyThread[NUMTHREADS];
    for(int i = 0; i < NUMTHREADS; i++) {
      threads[i] = new MyThread();
    }

    // Start threads
    for(int i = 0; i < NUMTHREADS; i++) {
      threads[i].start();
    }

    // Wait for these threads to complete
    for(int i = 0; i < NUMTHREADS; i++) {
      try {
        threads[i].join();
      }
      catch(Exception e) {
        e.printStackTrace();
      }
    }

    // Display a message
    System.out.println("\nAll threads have completed");
  }
}