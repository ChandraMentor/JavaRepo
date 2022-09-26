// import the packages for swing classes
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class swing2 {
public static void main(String args[]){
JFrame frame = new JFrame("Sample SwingApplication");
//create the components to be placed into frame
swing2 swing1app = new swing2();
final JLabel label = new JLabel();
//label is declared as final inorder to make it accessible from inner
//class
JButton button = new JButton("Swing Button");
button.setMnemonic('b');//set a short cut key Alt - b
	//add action listener to capture click event and set lable
	//caption to indicate button clicked event has occured
button.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
		label.setText("button clicked");
		}
	});
	//now create a panel object to hold the two swing components
JPanel pane = new JPanel();
// set a boarder to give a great look
pane.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
pane.setLayout(new GridLayout(0, 1));
pane.add(button);
pane.add(label);
    //  frame.getContentPane().add(pane, BorderLayout.CENTER);
	//frame.getContentPane().setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
	frame.getContentPane().setLayout(new GridLayout(0, 1));
	frame.getContentPane().add(button);
	frame.getContentPane().add(label);
	//let us try to add panel which also has a button and a lable in it
	frame.getContentPane().add(pane);

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