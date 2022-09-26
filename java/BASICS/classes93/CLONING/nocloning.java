/* shows some details about cloning
Author : Team - J 
Version: 1.0*/

import java.util.*;

class nocloning{
	int i;
	int j;
	public void set(int i,int j){
		this.i = i;
		this.j = j;
	}
	public nocloning cloneme(){
	// we know that we will fail here
		try{
			Object o = super.clone();
		}catch (Exception e){
			System.out.println(e);
		}
		return null;
	}
}
 