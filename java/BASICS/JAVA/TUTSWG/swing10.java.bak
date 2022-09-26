
import com.sun.java.swing.*;
import com.sun.java.swing.border.*;
import com.sun.java.accessibility.*;
import java.awt.*;
import java.awt.event.*;

public class swing10 extends JFrame implements ActionListener     {
    JComboBox layers;
    JButton makeButton;
    JLayeredPane layeredPane;
    int num = 0;
    String[] layernames = { "Layer one","Layer Two","Layer Three","Layer Four","Layer Five"};
    Integer[] layertypes = { JLayeredPane.DEFAULT_LAYER,JLayeredPane.PALETTE_LAYER,JLayeredPane.MODAL_LAYER,
	JLayeredPane.POPUP_LAYER,JLayeredPane.DRAG_LAYER };
    static ImageIcon[] icon = new ImageIcon[5];
    public swing10()    {
	super("LayeredPaneDemo");
	 if(icon[0] == null) {
	         icon[0] = new ImageIcon("images/Bird.gif", layernames[0]);
		 icon[1] = new ImageIcon("images/Cat.gif", layernames[1]);
		 icon[2] = new ImageIcon("images/Dog.gif", layernames[2]);
		 icon[3] = new ImageIcon("images/Rabbit.gif",layernames[3]);
		 icon[4] = new ImageIcon("images/Teddy.gif",  layernames[4]);
		}
	layers = new JComboBox(layernames);
	layers.setSelectedIndex(0);
	makeButton = new JButton("Create a Frame");
	makeButton.addActionListener(this);
	layeredPane = getLayeredPane();
	JPanel controls = new JPanel();
	controls.add(layers);
	controls.add(makeButton);
	controls.setBorder(BorderFactory.createTitledBorder("Add Frames to Specified Layer"));
	JPanel emptyArea = new JPanel();
	emptyArea.setPreferredSize(new Dimension(600, 400));
	Container contentPane = getContentPane();// use a layout manager that respects preferred sizes
	contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
	contentPane.add(Box.createVerticalStrut(10));
	contentPane.add(controls);
	contentPane.add(Box.createVerticalStrut(10));
	contentPane.add(emptyArea);
	for (int i = 0 ; i < icon.length; i++)
	 addNewInternalFrame(i);  
	} 
public void actionPerformed(ActionEvent e) {
        if(e.getSource() == makeButton) {
	    int index = layers.getSelectedIndex();
            addNewInternalFrame(index);
	}
 }
private void addNewInternalFrame(int index) {
	JInternalFrame newFrame = new JInternalFrame();
	newFrame.setTitle(layerStrings[index]);
	JPanel contentPane = new JPanel();
	contentPane.setLayout(new BorderLayout());
	contentPane.add(new JLabel(icon[index]), "Center");
	contentPane.setBackground(Color.white);
	contentPane.setMinimumSize(new Dimension(25, 25));
	numFrames++;
	newFrame.setBounds(30*(numFrames%10), 30*(numFrames%10)+55, 200, 160);
	newFrame.setContentPane(contentPane);
	Integer layer = layerValues[index];
        layeredPane.add(newFrame, layer); 
	  try { newFrame.setSelected(true); }
		 catch (java.beans.PropertyVetoException e2) {} 
}
 public static void main(String[] args) {
     JFrame frame = new LayeredPaneDemo();
     WindowListener l = new WindowAdapter() {
       public void windowClosing(WindowEvent e) {
            System.exit(0);}
	 };
     	frame.addWindowListener(l);
     	frame.pack();
     	frame.setVisible(true);
      }
}