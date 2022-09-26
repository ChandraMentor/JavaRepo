/* Program to show a simple window on the screen using 1.1 event model
This program demonstrates how to add a menu to  main window
Author : Team -J
Version : 1.0 
*/
import java.awt.*;
import java.awt.event.*;

class awt8 extends Frame{
	 int curx=0,cury=0;
	awt8(String title){
		super(title);
		}
	
	public static void main(String agrs[]){
		 Button b1,b2;
		//declare main menu and menu items to be added to menu
		MenuBar MainBar = new MenuBar();
		 Menu Mainmenu = new Menu("Test Menu");
		 MenuItem[] MenuItems = new MenuItem[5];
		MenuItems[0] = new MenuItem("one");
		Mainmenu.add(MenuItems[0]);
		MenuItems[1] = new MenuItem("two");
		Mainmenu.add(MenuItems[1]);
		MenuItems[2] = new MenuItem("three");
		Mainmenu.add(MenuItems[2]);
		MenuItems[3] = new MenuItem("four");
		Mainmenu.add(MenuItems[3]);
		MenuItems[4] = new MenuItem("five");
		Mainmenu.add(MenuItems[4]);
		MainBar.add(Mainmenu);
		awt8 sampframe = new awt8("frame window");
		//sampframe.setLayout( new FlowLayout());
		sampframe.setLayout( new FlowLayout());
		sampframe.setMenuBar(MainBar);
		b1= new Button("one");
		b2= new Button("two");
		sampframe.resize(500,400);
		System.out.println("before button size");
		//b.resize(new Dimension(10,20));
		b1.setSize(new Dimension(10,20));
		b2.setSize(new Dimension(10,20));
		sampframe.add(b1);
		sampframe.add(b2);
		System.out.println("after button size");
		// try to resize and see what happens
		sampframe.resize(500,400);
		sampframe.show();
		//System.out.println("before repaint");
		//sampframe.repaint();
		//sampframe.repaint();
		//System.out.println("before adding listener");
		// This following statement adds the mouse listener
		sampframe.addMouseListener(new awt8listener());
		System.out.println("after adding listener");
		//let us do something intresting here
		b1.addMouseListener(new awt8listener());
		//let us add a listener to b2 button also
		b2.addMouseListener(new awt8listener());
		//sampframe.resize(500,300);
		}

	
	
}


/*  class implementing event listener*/
class awt8listener implements MouseListener{
/* following mouseXXX implements MouseListener interface*/
	public void mouseClicked(MouseEvent e){
		
		System.out.println("mouse clicked" + e.getSource().toString());
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

}
