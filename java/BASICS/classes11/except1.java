import java.lang.*;

class except1  { 
public int Error(){
int status=0;
try{
//except2 ex = new except2();
Object o=Class.forName("excep2").newInstance();
status=1;
}
catch(ClassNotFoundException e){
System.out.println("Sorry...Class is not found" + e);
}
catch(IllegalAccessException e){
System.out.println("Sorry...U r accessing class from a different package" + e);
}
catch(InstantiationException e){
System.out.println("Sorry...Cannot create an instance"+ e);
}
return status;
}
public static void main(String args[]){
except1 e = new except1();
System.out.println("before method call");
System.out.println("after method call" + e.Error());
	}
}