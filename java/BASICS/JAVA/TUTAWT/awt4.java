/* Program to show a simple window on the screen using 1.1 event model
This program demonstrates how to use a mouse listener interface to listen
to mouse events.
Author : Team -J
Version : 1.0 
Note : two tutoials to be included to show how the event handling can
be done using inner class and event handling classes jan 28 -posani*/
import java.awt.*;
import java.awt.event.*;

class awt4 extends Frame implements MouseListener{
	 int curx=0,cury=0;
	awt4(String title){
		super(title);
		}
	/* following mouseXXX implements MouseListener interface*/
	public void mouseClicked(MouseEvent e){
		System.out.println("mouse clicked");
		}
	public void mouseEntered(MouseEvent e){
		System.out.println("mouse enetered");
		} 
	public void mouseExited(MouseEvent e) {
		System.out.println("mouse exited");
		} 
	public void mousePressed(MouseEvent e) {
		System.out.println("mouse pressed");
		} 
	public void mouseReleased(MouseEvent e) {
		System.out.println("mouse released");
		} 
	public static void main(String agrs[]){
		 Button b;
		awt4 sampframe = new awt4("frame window");
		b= new Button("one");
		//sampframe.add(b);
		System.out.println("before button size");
		b.resize(10,20);
		System.out.println("after button size");
		sampframe.resize(500,400);
		sampframe.show();
		System.out.println("before repaint");
		sampframe.repaint();
		sampframe.repaint();
		System.out.println("before adding listener");
		// This following statement adds the mouse listener
		sampframe.addMouseListener((java.awt.event.MouseListener)sampframe);
		System.out.println("after adding listener");
		//sampframe.resize(500,300);
		}
	
}



