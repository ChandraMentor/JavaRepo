import java.awt.*;
import java.awt.event.*;
/* A sample demo for JSplitPane Component
Author : Team - J
Version : 1.0*/
import javax.swing.*;
import javax.swing.event.*;
public class swing13 extends JFrame{
	
	JButton b;
	protected JLabel l;
	
	public class buttonlistener implements ActionListener{
	public void actionPerformed(ActionEvent evt) {
		System.exit(0);
		}
	}
	public class sliderlistener implements ChangeListener{
		public void stateChanged(ChangeEvent e){
			Integer value = new Integer (((JSlider)e.getSource()).getValue());
			l.setText(value.toString());
		}
	}

	
	
	public swing13(){
		super();
		b= new JButton("Close");
		b.addActionListener(new buttonlistener());
		l = new JLabel("...................");
		slider = new JSlider(0,100); //creates slider with 0, 100 as min , max values
		slider.setMinorTickSpacing(1) ;
		slider.setMajorTickSpacing(10) ;
		slider.addChangeListener(new sliderlistener());
		JPanel contentpane = new JPanel();
		contentpane.add(b);
		contentpane.add(slider);
		contentpane.add(l);
		setContentPane(contentpane);
	}
	
	public static void main(String[] args){
		JFrame win = new swing13();
		win.pack();
		win.setVisible(true);
	}
}