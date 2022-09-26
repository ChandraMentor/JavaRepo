class except  { 
	
public void Error () throws Exception{
// try to create an object of type xyz for which a class
//file doesn't exist. In C language the compiler doesn't check
//whether you are handling error or not, but java checks whether
//you are handling or not
Object o = Class.forName("xyz").newInstance();
}
public static void main(String args[]) throws Exception{
except e = new except();
// we are not handling the error here
System.out.println(" before method call");
e.Error();
System.out.println(" after method call");
	}
}
 