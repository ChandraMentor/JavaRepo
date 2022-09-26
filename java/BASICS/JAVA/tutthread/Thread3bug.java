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
		Thread t = new Thread (this,"Thread3A");
		t.run();
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
		Thread t = new Thread (this,"Thread3B");
		t.run();
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
	 new MyThread3A (v);
	new MyThread3B (v);
	}
}


