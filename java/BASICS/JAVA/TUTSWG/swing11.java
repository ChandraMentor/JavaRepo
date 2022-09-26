import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class swing11 extends JFrame implements ActionListener{
	JProgressBar pbar;
	Timer t1;
	JButton b;
	JLabel l;
	
	
	public swing11(){
		super();
		b= new JButton("Start Filling");
		b.addActionListener(this);
		l = new JLabel("Keep Clicking button to fill progress bar");
		pbar= new JProgressBar();
		pbar.setMinimum(0);
		pbar.setMaximum(100);
		pbar.setValue(0);
		JPanel contentpane = new JPanel();
		contentpane.add(b);
		contentpane.add(pbar);
		contentpane.add(l);
		setContentPane(contentpane);
	}
	public void actionPerformed(ActionEvent evt) {
		//exit when progress bar is filled
		if (pbar.getValue() ==  pbar.getMaximum())
			System.exit(0);
		pbar.setValue(pbar.getValue()+5);
	}
	public static void main(String[] args){
		JFrame win = new swing11();
		win.pack();
		win.setVisible(true);
	}
}