// import the packages for swing classes
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class swing1 {
public static void main(String args[]){
JFrame frame = new JFrame("Sample SwingApplication");
        //create the components to be placed into frame
	swing1 swing1app = new swing1();
	//Component contents = swing1app.createComponents();
	final JLabel label = new JLabel();
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