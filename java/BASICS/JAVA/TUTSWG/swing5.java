/* Program shows how to write a sample GUI application with one button and 
some radio buttons using swing classes avilable with jdk 1.2. This program
uses  ButtonGroup to group radio buttons 
Author : Team -J
version :1.0

todo : Prepare another example on radio buttons by using JPanel*/
// import the packages for swing classes
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class swing5 {


public static void main(String args[]){

	JFrame frame = new JFrame("Sample SwingApplication");
        //create the components to be placed into frame
	String[] RadioStrings = { "Opt1", "Opt2", "Opt3", "Opt4", "Opt5" };
	final JLabel label = new JLabel();
	//label is declared as final inorder to make it accessible from inner
	//class
	JButton button = new JButton("Exit");
	JRadioButton radbut1 = new JRadioButton(RadioStrings[0]);
	JRadioButton radbut2 = new JRadioButton(RadioStrings[1]);
	JRadioButton radbut3 = new JRadioButton(RadioStrings[2]);
	JRadioButton radbut4 = new JRadioButton(RadioStrings[3]);
	JRadioButton radbut5 = new JRadioButton(RadioStrings[4]);

	//create a button group  and add all radio buttons to it
	 ButtonGroup bgroup = new ButtonGroup();
	bgroup.add(radbut1);
	bgroup.add(radbut2);
	bgroup.add(radbut3);
	bgroup.add(radbut4);
	bgroup.add(radbut5);
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
        pane.add(label);
	//pane.add(bgroup); is this allowed ???
	pane.add(radbut1);
	pane.add(radbut2);
	pane.add(radbut3);
	pane.add(radbut4);
	pane.add(radbut5);
	
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