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
  private final static int SIZE = 10;
  int array[] = new int[SIZE];
  int r = 0;
  int w = 0;
  int count = 0;
  
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

    // Add data to array and adjust write pointer
    array[w++] = i;
    if(w >= SIZE)
      w = 0;

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

    // Read data from array and adjust read pointer
    int element = array[r++];
    if(r >= SIZE)
      r = 0;

    // Decrement count
    --count;

    // Notify waiting threads
    notifyAll();

    // Return element from array
    return element;
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