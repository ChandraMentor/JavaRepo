/* shows some details about cloning
Author : Team - J 
Version: 1.0*/

import java.util.*;

class Usec{
	public static void main(String a[]){
		cloning n = new cloning();
		n.set(10,10);
		cloning n1 = n.cloneme();
		System.out.println(n1);
		System.out.println(n);
		System.out.println("-----------------");
		n.print();
		n1.print();

// we have a side effect in clone method of object  !!!!!
	}
}
 