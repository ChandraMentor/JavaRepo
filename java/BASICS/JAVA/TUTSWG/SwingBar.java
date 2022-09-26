/* Program to demonstrate the use of JToolBar
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class swing16 extends JFrame {
	Container frameContainer;
	JToolBar toolBar = new JToolBar();
 	String[] iconFiles = {"new.gif","open.gif","save.gif","cut.gif","copy.gif","paste.gif"};
	String[] buttonLabels = {"New","Open","Save","Cut","Copy","Paste"};
	ImageIcon[] icons = new ImageIcon[iconFiles.length];
	JButton[] buttons = new JButton[buttonLabels.length];
	JMenuBar menuBar = new JMenuBar();
	JMenu fileMenu = new JMenu("File");
	JMenuItem fileExit = new JMenuItem("Exit");
 
	public SwingBar() {
  		super(TITLE);
  		buildGUI();
  		setupEventHandlers();
  		setSize(400,400);
  		show();
 	}
 
 	void buildGUI() {
  		setupMenuBar();
  		layoutComponents();
 	}

 	void setupMenuBar() {
  		fileMenu.add(fileExit); 
  		menuBar.add(fileMenu);
  		setJMenuBar(menuBar);
 	}	

 	public void layoutComponents() {
  		frameContainer = getContentPane();
  		frameContainer.setLayout(new BorderLayout());
  			for(int i=0;i<buttonLabels.length;++i) {
   				icons[i] = new ImageIcon(iconFiles[i]);
   				buttons[i] = new JButton(icons[i]);
   				buttons[i].setToolTipText(buttonLabels[i]);
   				toolBar.add(buttons[i]);
  			}
  		frameContainer.add("North",toolBar);
 	}

	void setupEventHandlers() {
  		addWindowListener(new WindowHandler());
  		fileExit.addActionListener(new MenuItemHandler());
 	}

 	public static void main(String[] args) {
   		SwingBar app = new swing16();
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