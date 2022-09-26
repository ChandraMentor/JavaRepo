/* shows some details about cloning
Author : Team - J 
Version: 1.0*/

import java.util.*;

class cloning implements Cloneable{
	int i;
	int j;
	public void set(int i,int j){
		this.i = i;
		this.j = j;
	}
	public cloning cloneme(){
			Object o=null;
		try{
			o = super.clone();
		}catch (Exception e){
			System.out.println(e);
		}
		return (cloning)o;
	}
	public void print(){
		System.out.println(i +"         "+j);
	}
}
 