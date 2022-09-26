import java.awt.*;
import java.awt.event.*;

public class MessageDialogDemo extends Frame
implements ActionListener {
  Button b;

  public static void main(String args[]) {
    MessageDialogDemo mdd = new MessageDialogDemo();
    mdd.setVisible(true);
    mdd.setSize(200, 100);
  }

  MessageDialogDemo() {
    super("Messager Dialog Demo");

    // Set layout manager
    setLayout(new FlowLayout());

    // Create button
    b = new Button("Message Dialog");
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
    String message = "This is the message";
    MessageDialog md = 
      new MessageDialog(this, "Message Dialog", true, message);
    md.show();
  }
}

class MessageDialog extends Dialog 
implements ActionListener {
  Button ok;

  MessageDialog(Frame parent, String title, 
  boolean mode, String message) {
    super(parent, title, mode);
    
    // Create and add "Center" panel
    Panel pc = new Panel();
    Label label = new Label(message);
    pc.add(label);
    add(pc, "Center");

    // Create and add "South" panel
    Panel ps = new Panel();
    ok = new Button("OK");
    ok.addActionListener(this);
    ps.add(ok);
    add(ps, "South");

    // Lay out components and set the initial size 
    // of this dialog box
    pack();

    // Anonymous inner class handles window events
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent we) {
        System.exit(0);
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
