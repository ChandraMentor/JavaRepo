import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class DateDialogDemo extends Frame
implements ActionListener {

  public static void main(String args[]) {
    DateDialogDemo ddd = new DateDialogDemo();
    ddd.setVisible(true);
    ddd.setSize(200, 100);
  }

  DateDialogDemo() {
    super("Date Dialog Demo");

    // Set layout manager
    setLayout(new FlowLayout());

    // Create button
    Button b = new Button("Date Dialog");
    b.addActionListener(this);
    add(b);

    // Anonymous inner class handles window events
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent we) {
        System.exit(0);
      } 
    });
  }

  public void actionPerformed(ActionEvent ae) {
    DateDialog dd = 
      new DateDialog(this, "Date Dialog", true);
    dd.show();
  }
}

class DateDialog extends Dialog 
implements ActionListener {
  static String monthNames[] = { "January", 
    "February", "March", "April", "May",
    "June", "July", "August", "September",
    "October", "November", "December" };

  DateDialog(Frame parent, String title, boolean mode) {
    super(parent, title, mode);
    
    // Create string with date information
    Calendar calendar = Calendar.getInstance();
    int month = calendar.get(Calendar.MONTH);
    int date = calendar.get(Calendar.DAY_OF_MONTH);
    int year = calendar.get(Calendar.YEAR);
    String str = monthNames[month] + " ";
    str += date + " ";
    str += year;

    // Create and add "Center" panel
    Panel pc = new Panel();
    Label label = new Label(str, Label.CENTER);
    pc.add(label);
    add(pc, "Center");

    // Create and add "South" panel
    Panel ps = new Panel();
    Button ok = new Button("OK");
    ok.addActionListener(this);
    ps.add(ok);
    add(ps, "South");

    // Lay out components and set the initial size 
    // of this dialog box
    pack();

    // Anonymous inner class handles window events
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent we) {
        dispose();
      } 
    });
  }

  public Insets getInsets() {
    return new Insets(40, 20, 20, 20);   
  }

  public void actionPerformed(ActionEvent ae) {
    dispose();
  }
}


