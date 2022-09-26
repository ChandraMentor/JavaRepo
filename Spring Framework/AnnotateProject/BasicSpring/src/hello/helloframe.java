package hello;

import java.io.*; 
import java.awt.*; 
import org.springframework.beans.factory.*; 
import org.springframework.beans.factory.xml.*; 
import org.springframework.core.io.*; 

public class helloframe extends Frame {

	TextField     text1; 
	TextArea     area1; 
	Label         label1; 
	Button        button1; 

	public static void main(String args[]) { 
	helloframe  app = new helloframe(); 
	app.setSize(500,500); 
	app.setVisible(true); 
	} 

	 helloframe()    { 
	 setLayout(new FlowLayout()); 
	   setBackground(Color.green); 
	   label1=new Label("Type Name: "); 
	   text1=new TextField(25); 
	   area1=new TextArea(10,50); 

	   button1=new Button("Exit"); 
	   button1.setBackground(Color.red); 
	   add(label1); 
	   add(text1);          
	   add(area1);          
	   add(button1); 
	   } 

	 public boolean action (Event e,Object c)    { 
	  if(e.target==text1)   { 
	  try   { 
	 area1.append("Please Wait..\n"); 
	 Resource  res = new  ClassPathResource("hello.xml");                 
	 BeanFactory  factory = new  XmlBeanFactory(res); 
	 hello bean1 = (hello)factory.getBean("hello"); 
	 String s = bean1.sayhello(text1.getText()); 
	 area1.append(s); 
	  } 
	 catch(Exception e1) 
	 {
		 area1.append(""+e1);} 
	 } 

	 if(e.target==button1) 
	 { 
	 System.exit(0); 
	 } 
	return true; 
	  }     	
}