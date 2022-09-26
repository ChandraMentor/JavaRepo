/* Program to show a simple window on the screen with choice
Author : Team -J
Version : 1.0 */
import java.awt.*;

class awt13 extends Frame{
	 int curx=0,cury=0;
	 Choice c;
	 String s1;
	 Button b1;
	 static public void main(String agrs[]){
		awt13 sampframe = new awt13("frame window");
		sampframe.show();
		sampframe.repaint();
		sampframe.resize(500,300);
		}
	awt13(String title){
		super(title);
		setLayout(new FlowLayout());
		b1= new Button("Click Here");
		c = new Choice();
		c.add("one");
		c.add("two");
		c.add("three");
		add(b1);
		add(c);
		}
	/* Process Events */
	public boolean handleEvent ( Event evobj ) {
		if (evobj.id == Event.WINDOW_DESTROY)
			System.exit(0);
		return super.handleEvent ( evobj);
		}
	
	public boolean action(Event e, Object arg) { 
		   Object target = e.target;
			if (target == b1) 
				{
				System.out.print("in kkkgg");
					s1=c.getSelectedItem();
					repaint();
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
		/*Shape s = g.getClip();
		Rectangle r = s.getBounds();
		System.out.print("in paint" + r.x+r.y+r.height+r.width);*/
		g.drawString("Current Choice is " + s1 ,50,50);
	
		}
}