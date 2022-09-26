/* This  Program is a simple java textbox class
which inherits from window class
Author : Team - J 
Version: 1.0*/

class mytextbox extends mywindow  { 
	//private int width,height,state;
	//private String title;
	String text;
	// constructors for text box
	public mytextbox(){
		text=null;
	}
	public mytextbox(String text){
		this.text= new String(text);
	}
	public mytextbox( String title,int width,int height,int state, String text){
		super(title,width,height,state); // call the constructor in window
		this.text= text;
	}
	public String getTitle(){
		System.out.println("in textbox class");
		return null;
	}
	public void showwindow(){
		//super();//can we call showwindow of super class like this??
		super.showwindow();
		System.out.println (" Text  = "  + text );
	}
	public String getText(){
		return text ;
	}
}
 