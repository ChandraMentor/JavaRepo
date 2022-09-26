/* Program to show a simple window on the screen with buttons
Author : Team -J
Version : 1.0 */
import java.awt.*;

class awt11 extends Frame{
	 int curx=0,cury=0;
	 Button b1,b2,b3;
	 static public void main(String agrs[]){
		awt11 sampframe = new awt11("frame window");
		sampframe.resize(500,400);
		sampframe.show();
		sampframe.repaint();
		sampframe.resize(500,300);
		}
	awt11(String title){
		super(title);
		setLayout ( new FlowLayout());
		add(b1= new Button("button one"));
		add(b2= new Button("button two"));
		add(b3= new Button("button three"));
		}
	/* Process Events */
	public boolean handleEvent ( Event evobj ) {
		if (evobj.id == Event.WINDOW_DESTROY)
			System.exit(0);
		return super.handleEvent ( evobj);
		}
	
	public boolean action(Event e, Object arg) { 
		   Object target = e.target;
             		if (target == b1) {
			        b1.setLabel("B1 clicked");
			        b2.setLabel("button two");
			        b3.setLabel("button three");
			        return true;
			    }
			if (target == b2) {
			        b2.setLabel("B2 clicked");
			        b1.setLabel("button one");
			        b3.setLabel("button three");
			        return true;
			    }
			if (target == b3) {
			        b2.setLabel("button two");
			        b1.setLabel("button one");
			        b3.setLabel("B3 clicked");
			        return true;
			    }
			return super.action(e,arg);
		}
	public boolean mouseDown ( Event evtobj,int x , int y){
		curx=x;
		cury=y;
		repaint();
		return true;
		}
	/*override the paint method of parent class*/
	public void paint( Graphics g){
		g.drawString("mouse down here",curx+20,cury+50);
	
		}
}