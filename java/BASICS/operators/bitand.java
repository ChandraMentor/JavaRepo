/* Program using bitwise operator with int data types
Author : Team - J 
Version: 1.0*/

class bitand { 
	public static void main(String args[]){
		int i = 0xffffffff;
		int j = 0x00000000,k;
		System.out.println(" 0xffffffff & 0x00000000 " + (i&j));
		j=0xffffffff;
		System.out.println(" 0xffffffff & 0xffffffff " + (i&j));
		// to find out bit 8
		j=0x80;
		System.out.println(" 0xffffffff & 0x80 " + (i&j));
		i=0x200; //1000000000 Base 2
		System.out.println(" 0x200 & 0x80 " + (i&j));
		// We can use the above technique to find out individual
		// bit is one or zero. Where do we need this ?
		// or operator
		i = 0xffffffff;
		j = 0x80;
		System.out.println(" 0xffffffff | 0x80 " + (i|j));
		i=0x200; //1000000000 Base 2
		System.out.println(" 0x200 | 0x80 " + (i|j));
		// where do we generally use or operators ??
		System.out.println(" 0x200 | 0x80 " + (i|j));
		// exor operator
		//where do we need exor operator
		i = 0xffffffff;
		j=0x8f;
		System.out.println(" j =  " + j);
		k= i ^ j;
		System.out.println(" 0xffffffff | 0x8f " + k);
		k=i ^ k;
		// where do you genarally use or operator.
		System.out.println(" 0xffffffff | 0x8f | 0x8f " + k);
		i = 0x00000000;
		j=0x8f;
		System.out.println(" j =  " + j);
		k= i ^ j;
		System.out.println(" 0x00000000 | 0x8f " + k);
		k=i ^ k;
		System.out.println(" 0x0x00000000 | 0x8f | 0x8f " + k);
	}	
}