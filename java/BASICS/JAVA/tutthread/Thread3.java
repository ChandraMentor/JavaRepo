/* Program to demonstrate producer/consumer problem
Author : Team -J
Version : 1.0 */
class sharedvar{
	int i;
	sharedvar(){
		i=0;
	}
	int incvar(){
		return i++;
	}
	int getvar(){
		return i;
	}
}
class MyThread3A  extends Thread{
	sharedvar v;
	MyThread3A(sharedvar v){
		this.v = v;
	}
 	public void run(){
	for(int i= 0;i <10; i++)
	       System.out.println("Value of shared variable "+ v.getvar());
  	}
	
}
class MyThread3B  extends Thread{
	sharedvar v;
	MyThread3B(sharedvar v){
		this.v = v;
	}
  	public void run(){
		for(int i= 0;i <10; i++){
		        System.out.println("value of shared variable after incrimenting "+v.incvar());
		}
  	}
}

class Thread3{
	static public void main(String[] args){
  	sharedvar v = new sharedvar();
	Thread  myThread3A = (Thread) new MyThread3A (v);
	myThread3A.start();
    	Thread  myThread3B = (Thread) new MyThread3B (v);
	myThread3B.start();
	}
}


