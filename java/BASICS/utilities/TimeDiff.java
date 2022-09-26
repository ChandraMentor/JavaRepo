/* This class is a utility class to find the difference between two time t1 and t2
Author : Team - J 
Version: 1.0*/
package com.inetsolv;
import java.util.*;
class TimeDiff  {
	Date d1;
	public TimeDiff(){
		start();
	}
	// this method starts the clock
	public void start(){
		d1 = new Date();
	}
	// returns time elapsed in milli seconds after the clock has last started
	// we are returning -1 to indicate error condition, Here we can throw 
	// an Exception also.
	public long timeElapsed(){
		// we need not use this condition here as the constructor
		// is calling start method
		if ( d1 == null)
			return (-1);
		return ( d1.getTime() - new Date().getTime());
	}

	// To test the utiliy method I have included the main method. This is
	// a very useful tip in debugging the classes seperately
	public  static void main(String args[]){
		TimeDiff t = new TimeDiff();
		for(int i =0; i<1000000;i++){
				int j = 0;
				j++;
			}
		
		long timediff =t.timeElapsed();
		System.out.println(" Time taken to execute = "+ timediff + " milli seconds");
	}
	
}
 