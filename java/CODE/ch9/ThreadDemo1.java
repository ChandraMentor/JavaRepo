import static java.lang.Thread.*;

class ThreadX extends Thread {
  
  public void run() {
    try {
      while(true) {
      sleep(2000);
   System.out.println("Hello");
      }
    }
 catch(InterruptedException ex) {
 ex.printStackTrace();
    }
  }
}

class ThreadDemo1 {

public static void main(String args[]) {
    
    ThreadX tx = new ThreadX();
    tx.start();
  }
}