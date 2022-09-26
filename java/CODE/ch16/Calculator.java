import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
/*
  <applet code=Calculator width=250 height=250>
  </applet>
*/

public class Calculator extends Applet 
implements ActionListener {
  private final static int NBUTTONS = 18;
  String buttonLabels[] = { "0", "1", "2", "3", "4", "5",
    "6", "7", "8", "9", ".", "+/-", "+", "-", "=", "*", "/", "C" };
  Button buttons[];
  TextField tf;
  String operator;
  double register1, register2;
  boolean overwriteDisplay;

  public void init() {

    // Initialize operator
    operator = "";

    // Set Layout manager for the applet
    setLayout(new BorderLayout());

    // Create panel to hold the text field
    Panel pn = new Panel();
    tf = new TextField(20);
    tf.setEditable(false);
    pn.add(tf);
    add("North", pn);

    // Create buttons
    buttons = new Button[NBUTTONS];
    for(int i = 0; i < NBUTTONS; i++) {
      buttons[i] = new Button(buttonLabels[i]);
      buttons[i].addActionListener(this);
    }

    // Create panel to hold the buttons
    // Use a grid layout manager for that panel
    Panel pc = new Panel();
    pc.setLayout(new GridLayout(6, 3));

    // Add buttons to the grid
    for(int i = 0; i < NBUTTONS; i++) {
      pc.add(buttons[i]);
    } 

    // Add the grid to the applet
    add("Center", pc);  
  }

  public void actionPerformed(ActionEvent ae) {
    
    // Determine which button was pressed
    String ac = ae.getActionCommand();

    // Check if the "C" key was pressed
    if(ac.equals("C")) {
      tf.setText("");
      operator = "";
      register1 = 0;
      register2 = 0;
      return;
    }

    // Check if the "+/-" key was pressed
    if(ac.equals("+/-")) {
      String s = tf.getText();
      if(s.startsWith("-")) {
        tf.setText(s.substring(1));
      }
      else {
        tf.setText("-" + s);
      }
      return;
    }

    // Process decimal point.  
    if(ac.equals(".")) {
      if(overwriteDisplay) {
        tf.setText(ac);
        overwriteDisplay = false;
        return;
      }
      String s = tf.getText();
      if(s.indexOf('.') != -1) 
        return;  
      s += '.';
      tf.setText(s);
      return;
    }

    // Process digits
    if(ac.equals("0") || ac.equals("1") || ac.equals("2") || 
    ac.equals("3") || ac.equals("4") || ac.equals("5") ||
    ac.equals("6") || ac.equals("7") || ac.equals("8") ||
    ac.equals("9")) {
      if(overwriteDisplay) 
        tf.setText(ac);
      else
        tf.setText(tf.getText() + ac);
      overwriteDisplay = false;
    }

    // Process operators
    if(ac.equals("+") || ac.equals("-") || 
    ac.equals("*") || ac.equals("/") ||
    ac.equals("=")) {
      register2 = Double.valueOf(tf.getText()).doubleValue();
      register1 = calculate(operator, register1, register2);
      tf.setText("" + register1);
      operator = ac;
      overwriteDisplay = true;
    }
  }

  public double calculate(String operator, double r1, double r2) {
    if(operator.equals("+")) r1 += r2;
    else if(operator.equals("-")) r1 -= r2;
    else if(operator.equals("*")) r1 *= r2;
    else if(operator.equals("/")) r1 /= r2;
    else r1 = r2;
    return r1;
  }

  public Insets getInsets() {
    return new Insets(10, 10, 20, 10);
  }
}
