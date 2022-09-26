import java.util.*;

class Producer extends Thread {
  Queue queue;

  Producer(Queue queue) {
    this.queue = queue;
  }

  public void run() {
    int i = 0;
    while(true) {
      queue.add(i++);
    }
  }
}

class Consumer extends Thread {
  String str;
  Queue queue;

  Consumer(String str, Queue queue) {
    this.str = str;
    this.queue = queue;
  }

  public void run() {
    while(true) {
      System.out.println(str + ": " + queue.remove());
    }
  }
}

class Queue {
  private final static int SIZE = 5;
  private Vector queue = new Vector();
  private int count = 0;
  
  synchronized void add(int i) {

    // Wait while the queue is full
    while(count == SIZE) {
      try {
        wait();
      }
      catch(InterruptedException ie) {
        ie.printStackTrace();
        System.exit(0);
      }
    }

    // Add data to queue 
    queue.addElement(new Integer(i));

    // Increment count
    ++count;

    // Notify waiting threads
    notifyAll();
  }

  synchronized int remove() {

    // Wait while the queue is empty
    while(count == 0) {
      try {
        wait();
      }
      catch(InterruptedException ie) {
        ie.printStackTrace();
        System.exit(0);
      }
    }

    // Read data from queue
    Integer iobj = (Integer)queue.firstElement();
    queue.removeElement(iobj);

    // Decrement count
    --count;

    // Notify waiting threads
    notifyAll();

    // Return element from queue
    return iobj.intValue();
  }
}

class ProducerConsumers {

  public static void main(String args[]) {
    Queue queue = new Queue();
    new Producer(queue).start();
    new Consumer("ConsumerA", queue).start();
    new Consumer("ConsumerB", queue).start();
    new Consumer("ConsumerC", queue).start();
  }
}