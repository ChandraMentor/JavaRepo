import java.awt.*;
import java.awt.event.*;

public class RandomColorDialogDemo extends Frame
implements ActionListener {

  public static void main(String args[]) {
    RandomColorDialogDemo rcdd = new RandomColorDialogDemo();
    rcdd.setVisible(true);
    rcdd.setSize(200, 100);
  }

  RandomColorDialogDemo() {
    super("Random Color Dialog Demo");

    // Set layout manager
    setLayout(new FlowLayout());

    // Create button
    Button b = new Button("Random Color Dialog");
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
    RandomColorDialog rcd = 
      new RandomColorDialog(this, "Random Color Dialog", true);
    rcd.show();
  }
}

class RandomColorDialog extends Dialog 
implements ActionListener {

  RandomColorDialog(Frame parent, String title, boolean mode) {
    super(parent, title, mode);

    // Create and add "Center" panel
    Panel pc = new Panel();
    Canvas canvas = new Canvas();
    canvas.setSize(100, 100);
    int red = (int)(255 * Math.random());
    int green = (int)(255 * Math.random());
    int blue = (int)(255 * Math.random());
    Color color = new Color(red, green, blue);
    canvas.setBackground(color);
    pc.add(canvas);
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


