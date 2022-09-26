/* Program to show a simple window on the screen using 1.02 event model
Author : Team -J
Version : 1.0 */
import java.awt.*;

class awt3 extends Frame{
	 int curx=0,cury=0;
	awt3(String title){
		super(title);
		}
	/* Process Events */
	public boolean handleEvent ( Event evobj ) {
		if (evobj.id == Event.WINDOW_DESTROY){
			System.out.println("window destoy in handle event");
			System.exit(0);
		}
		if (evobj.id==Event.MOUSE_DOWN )
			System.out.println("mouse down in handle event");
		return super.handleEvent ( evobj);
		}
	/* Process Key Down message*/
	public boolean mouseDown ( Event evtobj,int x , int y){
		System.out.println("in mouse down");
		curx=x;
		cury=y;
		System.out.println("in mouse down");
		repaint();
		return true;
		}
	/*override the paint method of parent class*/
	public void paint( Graphics g){
		System.out.println("in paint method");
		g.drawString(" Window sample by Team - J",40,40);
		super.paint(g);
		}
}

class awt3test {
public static void main(String agrs[]){
		 Button b;
		awt3 sampframe = new awt3("frame window");
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
		//sampframe.resize(500,300);
		}
}