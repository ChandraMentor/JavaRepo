/* A simple applet to show how to add GUI components to Applet
Author : Team - J
Version :1.0 */
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class applet2 extends Applet implements ActionListener { 
  	Button b1;
	Label l1;
	//always executed first 
	public void init(){	
		b1 = new Button("Button");
		l1 = new Label("Label                ");
		add(b1);
		b1.addActionListener(this);
		add(l1);
	}
	public void actionPerformed(ActionEvent e){
		l1.setText("Button Pressed");
	}

	public void paint(Graphics g) {
		g.drawString("Applet with Button and Label", 10, 100);
	}
}