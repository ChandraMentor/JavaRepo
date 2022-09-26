/* A simple applet
Author : Team - J
Version :1.0 */
import java.applet.Applet;
import java.awt.Graphics;

public class applet1 extends Applet { 
  	StringBuffer buffer;
	public void init(){	
		buffer = new StringBuffer();
        	addItem("initializing... ");
	}
	public void start() {
        	addItem("starting... ");
	}
	public void stop() {
        	addItem("stopping... ");
	}
	public void destroy() {
		addItem("preparing for unloading...");
	}
	void addItem(String newWord) {
	        System.out.println(newWord);
        	buffer.append(newWord);
	        repaint();
	}
	public void paint(Graphics g) {
		//Draw a Rectangle around the applet's display area.
        	g.drawRect(0, 0, size().width - 1, size().height - 1);
		//Draw the current string inside the rectangle.
        	g.drawString(buffer.toString(), 5, 15);
	}
}