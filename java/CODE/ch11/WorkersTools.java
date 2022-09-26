import java.util.*;

class Worker extends Thread {
  final static int NUMWORKERS = 10;

  Toolbox toolbox;
  int id;

  public Worker(Toolbox toolbox, int id) {
    this.toolbox = toolbox;
    this.id = id;
  }

  public void run() {

    try {

      // Establish an infinite loop
      while(true) {

        // Get two of the tools
        Tool tools[] = toolbox.getTools();

        // Use the tools
        int t = (int)(10000 * Math.random() + 10000);
        Thread.sleep(t);

        // Release the tools
        toolbox.releaseTools(tools);

        // Sleep before doing more work
        Thread.sleep(20000);
      }
    }
    catch(Exception e) {
    }
  }
}

class Tool {
  final static int NUMTOOLS = 4;
  int id;

  public Tool(int id) {
    this.id = id;
  }

  public String toString() {
    return "" + id;
  }
}

class Toolbox {
  private Stack tools = new Stack();

  public Toolbox() {
    for(int i = 0; i < Tool.NUMTOOLS; i++) {
      tools.push(new Tool(i));
    }
  }

  public synchronized Tool[] getTools() {

    while(true) {

      // Check if two tools are available
      if(tools.size() >= 2) {
        Tool tool0 = (Tool)tools.pop();
        Tool tool1 = (Tool)tools.pop();
        System.out.println("Get tools " + tool0 + " " + tool1);
        Tool a[] = new Tool[2];
        a[0] = tool0;
        a[1] = tool1;
        return a;
      }
    
      // Wait for two tools to become available
      try {
        wait();
      }
      catch(InterruptedException ie) {
        ie.printStackTrace();
      }
    }
  }

  public synchronized void releaseTools(Tool a[]) {

    // Put the tools back in the toolbox
    System.out.println("Release tools " + a[0] + " " + a[1]);
    tools.push(a[0]);
    tools.push(a[1]);

    // Notify all waiting threads
    notifyAll();
  }
}

class WorkersTools {

  public static void main(String args[]) {

    // Create Toolbox
    Toolbox toolbox = new Toolbox();

    // Create workers
    for(int i = 0; i < Worker.NUMWORKERS; i++) {
      new Worker(toolbox, i).start();
    }
  }
}