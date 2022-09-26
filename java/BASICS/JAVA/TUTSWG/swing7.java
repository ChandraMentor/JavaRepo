import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class swing7 {
public static void main(String args[]){
	JFrame frame = new JFrame("Sample SwingApplication");
        //create the components to be placed into frame
	final JLabel label = new JLabel();
	//label is declared as final inorder to make it accessible from inner
	//class
	JTextField txtfld = new JTextField("Text Field");
	JPasswordField passfld = new JPasswordField("Password Field");
	JButton button = new JButton("Exit");
	button.setMnemonic('E');//set a short cut key Alt - e
	//add action listener to capture click event and set lable
	//caption to indicate button clicked event has occured
	button.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
		System.exit(0);
		}
	});
	//now create a panel object to hold the  swing components
	JPanel pane = new JPanel();
	// set a boarder to give a great look
	pane.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
	pane.setLayout(new GridLayout(0, 1));
	pane.add(button);
        pane.add(txtfld);
	pane.add(passfld);
	frame.getContentPane().add(pane, BorderLayout.CENTER);
	
	
	        //add window listener class to handle window events
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.pack();
        frame.setVisible(true);
    }
}