import java.lang.*;

class NormPriorityThread extends Thread {

public void run() {
setPriority(NORM_PRIORITY);
try {
for(int i=0;i<20;i++)
System.out.println("Normal priority thread: " + i);
    }
catch(Exception e) {
e.printStackTrace();
    }
    }
  }
class LowPriorityThread extends Thread {
 
public void run() {
setPriority(MIN_PRIORITY);
try {
for(int i=0;i<20;i++)
System.out.println("Minimum priority thread: " + i);
    }
catch(Exception e) {
e.printStackTrace();
    }
  }
}
class PriorityDemo {
public static void main(String args[]) {
// Create and start normal priority thread
NormPriorityThread npt = new NormPriorityThread();
npt.start();
// Wait for 2000 milliseconds
try {
Thread.sleep(2500);
 }
catch(Exception e) {
e.printStackTrace();
 }
// Create and start low priority thread
LowPriorityThread lpt = new LowPriorityThread();
lpt.start();
// Wait for 2000 milliseconds
try {
Thread.sleep(2000);
}
catch(Exception e) {
e.printStackTrace();
    }
  }
}