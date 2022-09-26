import java.awt.*;
import java.awt.event.*;

public class DialogApplication extends Frame
implements ActionListener, WindowListener {
  Button l, s;
  TextField tf;

  public static void main(String args[]) {
    DialogApplication da = new DialogApplication();
    da.setVisible(true);
    da.setSize(400, 100);
  }

  DialogApplication() {
    super("Dialog Application");
    setLayout(new FlowLayout());
    l = new Button("Load");
    l.addActionListener(this);
    add(l);
    s = new Button("Save");
    s.addActionListener(this);
    add(s);
    tf = new TextField(20);
    add(tf);
    addWindowListener(this);
  }

  public void actionPerformed(ActionEvent ae) {
    FileDialog fd;
    if(ae.getSource() == l) {
      fd = new FileDialog(this, "File Dialog", FileDialog.LOAD);
    }
    else {
      fd = new FileDialog(this, "File Dialog", FileDialog.SAVE);
    }
    fd.show();
    String filename = fd.getFile();
    if(filename != null) {
      tf.setText(filename);
    }
  }

  public void windowActivated(WindowEvent we) {
  }

  public void windowClosed(WindowEvent we) {
  }

  public void windowClosing(WindowEvent we) {
    System.exit(0);
  }

  public void windowDeactivated(WindowEvent we) {
  }

  public void windowDeiconified(WindowEvent we) {
  }

  public void windowIconified(WindowEvent we) {
  }

  public void windowOpened(WindowEvent we) {
  }
}