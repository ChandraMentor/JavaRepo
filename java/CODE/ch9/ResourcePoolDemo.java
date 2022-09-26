class Resource {
  boolean allocated;
  int rid;

  Resource(int rid) {
    allocated = false;
    this.rid = rid;
  }

  void use(int uid) {
    try {
      System.out.println("User " + uid + " uses resource " + rid);
      Thread.sleep((int)(5000 + 5000 * Math.random()));
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
}

class ResourceCoordinator {
  private final static int NUMRESOURCES = 3;
  private int totalAllocated;
  private Resource resources[];

  ResourceCoordinator() {

    // Initialize totalAllocated
    totalAllocated = 0;

    // Create resources
    resources = new Resource[NUMRESOURCES];
    for(int rid = 0; rid < NUMRESOURCES; rid++) {
      resources[rid] = new Resource(rid);
    }
  } 

  synchronized Resource get() {

    // Wait for an available resource
    while(totalAllocated == NUMRESOURCES) {
      try {
        wait();
      }
      catch(InterruptedException ie) {
        ie.printStackTrace();
        System.exit(0);
      }
    }

    // Allocate an available resource
    Resource r = null;
    for(int i = 0; i < NUMRESOURCES; i++) {
      if(resources[i].allocated == false) {
        resources[i].allocated = true;
        r = resources[i];
        break;
      }
    }

    // Increment totalAllocated
    ++totalAllocated;

    // Notify waiting threads
    notifyAll();

    // Return the resource
    return r;
  }

  synchronized void put(Resource r) {

    // Mark resource as available
    r.allocated = false;

    // Decrement totalAllocated
    --totalAllocated;

    // Notify waiting threads
    notifyAll();
  }
}

class User extends Thread {
  ResourceCoordinator rc;
  int uid;

  User(ResourceCoordinator rc, int uid) {
    this.rc = rc;
    this.uid = uid;
  }

  public void run() {
    try {
      while(true) {
        Resource r = rc.get();
        r.use(uid);
        rc.put(r);
        sleep(3000);
      }
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }        
}

class ResourcePoolDemo {
  private final static int NUMUSERS = 10;

  public static void main(String args[]) {

    // Create a resource coordinator
    ResourceCoordinator rc = new ResourceCoordinator();

    // Create and start user threads
    for(int uid = 0; uid < NUMUSERS; uid++) {
      new User(rc, uid).start();
    }
  }
}