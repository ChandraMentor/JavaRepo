/* This  Program is a simple java class which
will be used / extended by other class
Author : Team - J 
Version: 1.0*/

class mywindow  { 
	private int width,height,state; //state can be max,min,default
	private String title;
	// constructors for window class
	public mywindow  (){
		System.out.println("mywin: In zero argument constructor");
		title=null;
		state=3;
		width=100;
		height=100;
	}
	public mywindow  (String title){
		this();
		System.out.println("my win: In one argument constructor");
		
		this.title= new String(title);
	}
	public mywindow  (String title,int width,int height,int state){
		System.out.println("mywin: In 4 arguments constructor");	
		this.title= new String(title);
		this.width= width;
		this.height= height;
		this.state= state;
	}
	public void resize(int newheight,int newwidth){
		width=newwidth;
		height=newheight;
	}
	public String getTitle(){
		return (this.title); // why to use this.title??
	}
	public void showwindow(){
		System.out.println(" Title  = " + title);
		System.out.println(" Width  = " + width);
		System.out.println(" Height  = " + height);
		System.out.println(" width  = " + width);
	}
	// like this we can have n no of functions for our window class.
}
 