//pojo class
public class helloimpl implements hello {
	private String greeting;
    //default constructor
	public helloimpl(){
	}
	//parameterized constructor
	public helloimpl(String a) {
	greeting=a;
	}
	public String sayhello(String s){
	return greeting+s;
	}
	public void setgreeting(String a){
	greeting=a;
	}
}