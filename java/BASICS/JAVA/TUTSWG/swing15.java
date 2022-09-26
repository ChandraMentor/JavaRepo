
/* A sample demo for JToolBar and JToolTip Component
Author : Team - J
Version : 1.0*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class swing15 extends JFrame implements ActionListener{
	JToolBar tb;
	JButton[]  b = new JButton[5];
	public swing15(){
		super();
		tb = new JToolBar();
		int i;
			getContentPane().setLayout(new BorderLayout());
			for ( i = 1; i < 5; i++) {
			System.out.println("before adding button ");
				b[i] = new JButton("but1.gif");
				b[i].setToolTipText("Button " + i);
				b[i].setActionCommand("Button" + i);
				b[i].setToolTipText("Button " + i);
				b[i].addActionListener(this);
				}
		System.out.println("before adding tpane ");
		tb.setFloatable(true);
		getContentPane().add(tb,BorderLayout.NORTH);
	}
	
	public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand().equals("Button1"))
				System.out.println("Button 1 clicked");
			else if (e.getActionCommand().equals("Button2"))
				System.out.println("Button 2 clicked");
			else if (e.getActionCommand().equals("Button3"))
				System.out.println("Button 3 clicked");
			else
				System.out.println("Button 4 clicked");
	}
	public static void main(String[] args){
		JFrame win = new swing15();
		win.pack();
		win.setSize(200,200);
		win.setVisible(true);
		win.show();
	}
}