/* shows how to use enumerator interface
Author : Team - J 
Version: 1.0*/

import java.util.*;

class UseEnum{
	public static void main(String args[]){
		Hashtable  ht = new Hashtable();
		// hash table can be used to store key , value pairs
		// this speads up the process of searching for an element
		String s1= new String("keyone");
		String s2= new String("keytwo");
		String s3= new String("keythree"); 
// any java object can be used as a key, but here we are using string objects
		ht.put(s1,"value one"); // we can use any java object as value
		ht.put(s2,"value two"); 
		ht.put(s3,"value three"); 
		System.out.println(ht.get(s3));
		ht.put(s3,"new  three"); 
		System.out.println(ht.get(s3));
// let us use enumerator here
	Enumeration  e = ht.keys(); // returns an enumeration object which can
					  // be used to iterate thr'u list.
	System.out.println(e);

	while (e.hasMoreElements())
		System.out.println(e.nextElement());

	}
}
 