import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
  <applet code="FrameCounterApplet" width=200 height=200>
  </applet>
*/

class MyCounterFrame extends Frame {

  MyCounterFrame(String title, String count) {
    super(title);
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent we) {
        setVisible(false);
        dispose();
      }
    });
    Label label = new Label(count, Label.CENTER);
    add(label, "Center");
  }
}
  
public class FrameCounterApplet extends Applet 
implements ActionListener {
  int count;

  public void init() {
    Button b = new Button("Create Frame");
    b.addActionListener(this);
    add(b);
  }

  public void actionPerformed(ActionEvent ae) {  
    ++count;
    MyCounterFrame mcf = 
      new MyCounterFrame("MyCounterFrame", "" + count);
    mcf.show();
    mcf.setSize(200, 200);
  }
}