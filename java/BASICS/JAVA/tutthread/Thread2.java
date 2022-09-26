/* Program to create thread by implementing runnable interface
Author : Team -J
Version : 1.0 */
class Thread2{
  static public void main(String[] args){
    Thread myThreadA = new Thread(new MyThread2(),"threadA");
    Thread myThreadB = new Thread(new MyThread2(),"threadB");

    //run the two threads
    myThreadA.start();
    myThreadB.start();
    
    try{
        Thread.currentThread().sleep(1000);
    }catch(InterruptedException e){}

    //Display info about the main thread    
    System.out.println(Thread.currentThread());        
	}
}

class MyThread2  extends Thread{
  public void run(){
	for(int i= 0;i <10; i++)
        System.out.println(Thread.currentThread());
  }
}
