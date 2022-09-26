class Mouse extends Thread {
  Box box;

  Mouse(Box box) {
    this.box = box;
  }

  public void run() {

    try {

      while(true) {
       
        // Stay out of the box for 10-20 sec
        long out = (long)(10000 * Math.random() + 10000);
        Thread.sleep(out);

        // Enter the box
        box.enter(this);

        // Stay in the box for 5-8 sec
        long in = (long)(5000 * Math.random() + 3000);
        Thread.sleep(in);

        // Exit the box
        box.exit(this);
      }
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
}

class Box {
  private static int CAPACITY = 4;
  int count;

  synchronized void enter(Mouse mouse) {

    // Wait while the box is full
    try {
      while(count == CAPACITY) {
        wait();
      }
    }
    catch(InterruptedException ie) {
      ie.printStackTrace();
      System.exit(0);
    }

    //Increment count
    ++count;

    // Display count
    System.out.println(count);
  }

  synchronized void exit(Mouse mouse) {

    // Decrement count
    --count;

    // Display count
    System.out.println(count);

    // Notify a waiting thread
    notify();
  }
}

class BoxAndMice {

  public static void main(String args[]) {
  
    Box box = new Box();

    for(int i = 0; i < 10; i++) 
      new Mouse(box).start();
  }
}
