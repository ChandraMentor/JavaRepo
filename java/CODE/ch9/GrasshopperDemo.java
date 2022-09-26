class Grasshopper extends Thread {

  public final static int NUMGRASSHOPPERS = 6;

  int x, y;  // position of grasshopper

  public Grasshopper() {
    x = (int)(100 * Math.random());
    y = (int)(100 * Math.random());
  }

  public void run() {
    try {
      while(true) {
        int msec = (int)(10000 * Math.random() + 2000);
        Thread.sleep(msec);
        x = (int)(100 * Math.random());
        y = (int)(100 * Math.random());
        System.out.println("Grasshopper at x = " + x + 
          " y = " + y);
      }
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
}

class GrasshopperDemo {

  public static void main(String args[]) {
    for(int i = 0; i < Grasshopper.NUMGRASSHOPPERS; i++) 
      new Grasshopper().start();
  }
}

