/* Program to show a simple window on the screen with check boxes
Author : Team -J
Version : 1.0 */
import java.awt.*;

class awt12 extends Frame{
	 int curx=0,cury=0;
	 Checkbox cb1,cb2,cb3;
	 Checkbox rb1,rb2,rb3;
	 CheckboxGroup cbg;
	 Panel p1,p2;
	 static public void main(String agrs[]){
		awt12 sampframe = new awt12("frame window");
		sampframe.resize(500,400);
		sampframe.show();
		sampframe.repaint();
		sampframe.resize(500,300);
		}
	awt12(String title){
		super(title);
		p1 = new Panel();//run the application without using panels
		p2 = new Panel();
		setLayout ( new FlowLayout());
		p1.add(cb1 = new Checkbox(" check box one"));
		p1.add(cb2 = new Checkbox(" check box two"));
		p1.add(cb3 = new Checkbox(" check box three"));
		cbg = new CheckboxGroup();
		p2.add(rb1= new Checkbox("Radio button one",cbg,true));
		p2.add(rb2= new Checkbox("Radio button two",cbg,false));
		p2.add(rb3= new Checkbox("Radio button three",cbg,false));
		add(p1);
		add(p2);
		}
	/* Process Events */
	public boolean handleEvent ( Event evobj ) {
		if (evobj.id == Event.WINDOW_DESTROY)
			System.exit(0);
		return super.handleEvent ( evobj);
		}
	
	public boolean action(Event e, Object arg) { 
		   Object target = e.target;
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