import java.io.*; 
import org.springframework.beans.factory.*; 
import org.springframework.beans.factory.xml.*; 
import org.springframework.core.io.*; 

public class HelloClient {
	public static void main(String args[])  throws Exception{ 
		try { 
		System.out.println("please Wait."); 
		Resource res = new  ClassPathResource("hello.xml"); 
		BeanFactory  factory = new  XmlBeanFactory(res); 
		Hello bean1 = (Hello)factory.getBean("hello"); 
		String s = bean1.sayhello(args[0]); 
		System.out.println(s); 
		 } 
		catch(Exception e1) { 
		System.out.println(""+e1); } 
		   } 

}
