/* Program shows how to write a sample GUI application with comboxbox using swing classes avilable
with jdk 1.2. 
Author : Team -J
version :1.0

*/
// import the packages for swing classes
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class swing8 {


public static void main(String args[]){

	JFrame frame = new JFrame("Sample SwingApplication");
        //create the components to be placed into frame
	final JLabel label = new JLabel();
	//label is declared as final inorder to make it accessible from inner
	//class
	JComboBox combo = new JComboBox();
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
	pane.add(label);
	pane.add(button);
        pane.add(combo);
	// add two strings to combo box
	combo.addItem("item one");
	combo.addItem("item two");
	// add item listener to respond to item changed event
	combo.addItemListener(new ItemListener(){
		public void itemStateChanged(ItemEvent e){
			label.setText(e.getItem().toString());
		}
	});
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