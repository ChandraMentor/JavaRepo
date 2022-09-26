//pojo class
package hello;

public class helloimpl implements hello {
	private String greeting;
	public helloimpl(){
	}
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