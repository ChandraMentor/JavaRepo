/* Program to solve producer/consumer problem
Author : Team -J
Version : 1.0 */
class sharedvar{
	int i;
	boolean isvarset;
	sharedvar(){
		i=0;
		isvarset=false;
	}
	synchronized int incvar(){
		if( isvarset) //if var is set wait till the other thread reads it
			try{
				wait();
			   }catch(InterruptedException e){};
		i++;
		isvarset = true;
		notify();
		return i;
	}
	synchronized int getvar(){
		if (!isvarset)try{
			wait();
			}catch(InterruptedException e){};
		isvarset=false;
		notify(); //notify the other thread which is waiting to incerment the value
		return i; 
	}
}
//consumer
class MyThread4A  extends Thread{
	sharedvar v;
	MyThread4A(sharedvar v){
		this.v = v;
	}
 	public void run(){
		for(int i= 0;i <10; i++)
			System.out.println("Value of shared variable "+ v.getvar());
	}
	
}
//producer
class MyThread4B  extends Thread{
	sharedvar v;
	MyThread4B(sharedvar v){
		this.v = v;
	}
  	public void run(){
		for(int i= 0;i <10; i++)
			  System.out.println("value of shared variable after incrementing "+v.incvar());
		
  	}
}

class Thread4{
	static public void main(String[] args){
  	sharedvar v = new sharedvar();
	Thread  myThread4A = (Thread) new MyThread4A (v);
	myThread4A.start();
    	Thread  myThread4B = (Thread) new MyThread4B (v);
	myThread4B.start();
	}
}


