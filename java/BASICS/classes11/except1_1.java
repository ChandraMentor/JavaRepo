import java.lang.*;

class except1_1  { 
public int Error(){
int status=0;
try{
//except2 ex = new except2();
Object o=Class.forName("except2").newInstance();
status=1;
}
catch(Exception e){
System.out.println("Sorry...Class is not found" + e);
}
return status;
}
public static void main(String args[]){
except1 e = new except1();
System.out.println("before method call");
System.out.println("after method call" + e.Error());
	}
}