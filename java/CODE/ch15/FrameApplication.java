import java.awt.*;
import java.awt.event.*;

class Frame1 extends Frame {

Frame1(String title) {
super(title);
addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent we) {
System.exit(0);
      }
    });
  }
}
public class FrameApplication {
public static void main(String args[]) { 
Frame1 f1 = new Frame1("Frame1");
f1.show();
f1.setSize(200, 200);
  }
}