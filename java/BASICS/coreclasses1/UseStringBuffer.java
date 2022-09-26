import java.util.*;
class UseStringBuffer { 
	
public static void main ( String args[]){
StringBuffer s1= new StringBuffer(" String 1");
// set initial capacity of stringbuffer to 22/ default capacity is 16
StringBuffer s2= new StringBuffer(22);	
StringBuffer s3= new StringBuffer(" String 2");	

StringBuffer s11,s21=new StringBuffer();

System.out.println(" capacity of s2 = "+ s2.capacity());

System.out.println(" capacity of s21 = "+ s21.capacity());

char c[] = {'a','b','c'};

//append(char[]) we can also append allprimitive data types
StringBuffer a = s1.append(c);

System.out.println(" s1.append(c) = "+ s1);

s21.append("aaaabbbbbbbbaaaa");

System.out.println(" capacity of s21 = "+ s21.capacity());

s21.ensureCapacity(100);

System.out.println(" capacity of s21 = "+ s21.capacity());
//delete(start,end)
System.out.println(" s21.delete(4,12) = "+ s21.delete(4,12));
}
}
 