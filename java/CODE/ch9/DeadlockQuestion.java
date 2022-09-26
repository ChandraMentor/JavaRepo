class X {

  synchronized void x1() {
    x2();
  }

  synchronized void x2() {
  }
}

class ThreadX extends Thread {
  X x;

  ThreadX(X x) {
    this.x = x;
  }
  
  public void run() {
    for(int i = 0; i < 100000; i++)
      x.x1();
  }
}

class DeadlockQuestion {
  private final static int NUMTHREADS = 10;

  public static void main(String args[]) {

    // Create object
    X x = new X();

    // Create and start threads
    ThreadX threads[] = new ThreadX[NUMTHREADS];
    for(int i = 0; i < NUMTHREADS; i++) {
      threads[i] = new ThreadX(x);
      threads[i].start();
    }
 
    // Wait for threads to complete
    for(int i = 0; i < NUMTHREADS; i++) 
      try {
        threads[i].join();
      }
      catch(Exception e) {
        e.printStackTrace();
      }

    // Display message
    System.out.println("Done!");
  }
}
    