import java.io.*; 
import org.springframework.beans.factory.*; 
import org.springframework.beans.factory.xml.*; 
import org.springframework.core.io.*; 

public class helloclient {
	public static void main(String args[])  throws Exception{
		try { 
			System.out.println("please Wait."); 
			Resource res = new  ClassPathResource("hello.xml"); 
			BeanFactory  factory = new  XmlBeanFactory(res);
			hello bean1 = (hello)factory.getBean("sneha"); 
			//calling the bean method
			String s = bean1.sayhello(args[0]);
			System.out.println(s);
			}
	 
	catch(Exception e1)
		{ 
	System.out.println(""+e1);
	   }//end of catch 
	   } //end of main
}//end of class
