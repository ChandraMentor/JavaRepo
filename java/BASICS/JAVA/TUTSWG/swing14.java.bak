
/* A sample demo for JTabbedPane Component
Author : Team - J
Version : 1.0*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class swing14 extends JFrame{
	JTabbedPane tp;
	JButton b1,b2,b3,b4,b5;
	JPanel jp1,jp2,jp3,jp4,jp5;
	
	class buttonlistener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if (b1 ==e.getSource())
				tp.setSelectedIndex(1);
			else if (b2 ==e.getSource())
				tp.setSelectedIndex(2);
			else if (b3 ==e.getSource())
				tp.setSelectedIndex(3);
			else if (b4 ==e.getSource())
				tp.setSelectedIndex(4);
			else
				tp.setSelectedIndex(0);
		}
	}
		public swing14(){
		super();
		tp = new JTabbedPane();
		jp1 = new JPanel(false);
		jp2= new JPanel(false);
		jp3 = new JPanel(false);
		jp4 = new JPanel(false);
		jp5 = new JPanel(false);
		//add all panels as tabs to tabbed pane
		tp.addTab("Tab One",jp1);
		jp1.add(b1 = new JButton("Next"));
		b1.addActionListener(new buttonlistener());
		tp.addTab("Tab Two",jp2);
		jp2.add(b2 = new JButton("Next"));
		b2.addActionListener(new buttonlistener());
		tp.addTab("Tab Three",jp3);
		jp3.add(b3 = new JButton("Next"));
		b3.addActionListener(new buttonlistener());
		tp.addTab("Tab Four",jp4);
		jp4.add(b4 = new JButton("Next"));
		b4.addActionListener(new buttonlistener());
		tp.addTab("Tab Five",jp5);
		jp5.add(b5 = new JButton("Next"));
		b5.addActionListener(new buttonlistener());
		getContentPane().add("Center",tp);
		}
	
	public static void main(String[] args){
		JFrame win = new swing14();
		win.pack();
		win.setVisible(true);
	}
}