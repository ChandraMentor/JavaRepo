/* A simple applet
Author : Team - J
Version :1.0 */
import java.applet.Applet;
import java.awt.Graphics;

public class applet1 extends Applet { 
  	StringBuffer buffer;
	//always executed first 
	public void init(){	
		buffer = new StringBuffer();
        	addcurrentmethod("In init method   ");
	}
	public void start() {
        	addcurrentmethod("In Start Method   ");
	}
	public void stop() {
        	addcurrentmethod("In stop method   ");
	}
	public void destroy() {
		addcurrentmethod("In destroy method   ");
	}
	void addcurrentmethod(String newitem) {
	        System.out.println(newitem);
        	buffer.append(newitem);
	        repaint();
	}
	public void paint(Graphics g) {
		g.drawString(buffer.toString(), 10, 10);
	}
}