/* Program to demonstrate the use of JToolBar
Author : Team -J
Version : 1.0*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class swing16 extends JFrame {
	Container frame;
	JToolBar toolBar = new JToolBar();
 	String[] iconFiles = {"new.gif","open.gif","save.gif"};
	String[] buttonLabels = {"New","Open","Save"};
	ImageIcon[] icons = new ImageIcon[iconFiles.length];
	JButton[] buttons = new JButton[buttonLabels.length];
	JMenuBar menuBar = new JMenuBar();
	JMenu fileMenu = new JMenu("File");
	JMenuItem fileExit = new JMenuItem("Exit");
	public swing16() {
  		super();
  		fileMenu.add(fileExit); 
  		menuBar.add(fileMenu);
  		setJMenuBar(menuBar);
		frame = getContentPane();
  		frame.setLayout(new BorderLayout());
  			for(int i=0;i<buttonLabels.length;++i) {
   				icons[i] = new ImageIcon(iconFiles[i]);
   				buttons[i] = new JButton(icons[i]);
   				buttons[i].setToolTipText(buttonLabels[i]);
				buttons[i].setActionCommand(buttonLabels[i]);
				buttons[i].addActionListener(new ButtonHandler());
   				toolBar.add(buttons[i]);
  			}
  		frame.add("North",toolBar);
  		addWindowListener(new WindowHandler());
  		fileExit.addActionListener(new MenuItemHandler());
  		setSize(400,400);
  		show();
 	}
 
 	public static void main(String[] args) {
   		swing16 app = new swing16();
 	}
	
	public class ButtonHandler implements ActionListener{
			public void actionPerformed(ActionEvent e) {
   			System.out.println(e.getActionCommand());
  		}
	}

 	public class WindowHandler extends WindowAdapter {
  		public void windowClosing(WindowEvent e) {
   		System.exit(0);
  		}
	}

 	public class MenuItemHandler implements ActionListener {
  		public void actionPerformed(ActionEvent e) {
   		String cmd = e.getActionCommand();
   		if(cmd.equals("Exit")) System.exit(0);
  		}
	 }	
}