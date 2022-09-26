import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*
  <applet code="FrameApplet" width=250 height=200>
  </applet>
*/

class Frame2 extends Frame {

  Frame2(String title) {
    super(title);
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent we) {
        dispose();
      }
    });
  }
}
  
public class FrameApplet extends Applet 
implements ActionListener {

  public void init() {
    Button b = new Button("Create Frame");
    b.addActionListener(this);
    add(b);
  }

  public void actionPerformed(ActionEvent ae) {  
    Frame2 f2 = new Frame2("Frame2");
    f2.show();
    f2.setSize(200, 200);
  }
}