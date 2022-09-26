import java.util.*;

class Task extends Thread {

  ResourceCoordinator rc;
  int id;

  public Task(ResourceCoordinator rc, int id) {
    this.rc = rc;
    this.id = id;
  }

  public void run() {

    try {

      // Establish an infinite loop
      while(true) {

        // Get a resource
        Resource r = rc.getResource();

        // Use the resource
        int t = (int)(10000 * Math.random() + 1000);
        Thread.sleep(t);

        // Release the resource
        rc.releaseResource(r);

        // Sleep before doing more work
        Thread.sleep(8000);
      }
    }
    catch(Exception e) {
    }
  }
}

class Resource {
  int id;

  public Resource(int id) {
    this.id = id;
  }

  public String toString() {
    return "" + id;
  }
}

class ResourceCoordinator {
  Stack resources = new Stack();

  public ResourceCoordinator() {
    for(int i = 0; i < 4; i++) {
      resources.push(new Resource(i));
    }
  }

  public synchronized Resource getResource() {

    while(true) {

      // Check if a resource is available
      if(!resources.empty()) {
        Resource r = (Resource)resources.pop();
        System.out.println("Get resource " + r);
        return r;
      }
    
      // Wait for an available resource
      try {
        wait();
      }
      catch(InterruptedException ie) {
        ie.printStackTrace();
      }
    }
  }

  public synchronized void releaseResource(Resource r) {

    // Push the resource onto the stack
    System.out.println("Release resource " + r);
    resources.push(r);

    // Notify all waiting threads
    notifyAll();
  }
}

class ResourcesTasks {

  public static void main(String args[]) {

    // Create resource coordinator
    ResourceCoordinator rc = new ResourceCoordinator();

    // Create tasks
    for(int i = 0; i < 10; i++) {
      new Task(rc, i).start();
    }
  }
}