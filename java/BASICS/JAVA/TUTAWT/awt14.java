import java.awt.*;

class awt14 extends Frame{
	  List lst;
	  static public void main(String agrs[]){
		awt14 sampframe = new awt14("frame window");
		sampframe.show();
		sampframe.repaint();
		sampframe.resize(500,300);
		}
	awt14(String title){
		super(title);
		setLayout(new FlowLayout());
		lst = new List(3,true); //allow multiselect 
		lst.add("one");
		lst.add("two");
		lst.add("three");
		add(lst);
		}
	/* Process Events */
	public boolean handleEvent ( Event evobj ) {
		if (evobj.id == Event.WINDOW_DESTROY)
			System.exit(0);
		return super.handleEvent ( evobj);
		}
	
	public boolean action(Event e, Object arg) { 
		   Object target = e.target;
			if (target == lst) 
				{
				String s1[]=lst.getSelectedItems();
					Graphics g = getGraphics();
               				g.clearRect(40,30,40,200);
					for (int i =0; i<s1.length;i++)
				                System.out.println(s1[i]);
						g.drawString(s1[i],50,40 + (i*20));
					return true;
				}
             		return super.action(e,arg);
		}
	
	/*override the paint method of parent class*/
	public void paint( Graphics g){
				g.drawString("List box demo",50,50);
	
		}
}
