import java.awt.*;
import java.awt.event.*;

public class ColorDialogDemo extends Frame
implements ActionListener {
Canvas canvas;

public static void main(String args[]) {
ColorDialogDemo cdd = new ColorDialogDemo();
cdd.setVisible(true);
cdd.setSize(200, 100);
}
 ColorDialogDemo() {
super("Color Dialog Demo");

    // Set layout manager for dialog
    setLayout(new FlowLayout());

    // Add button
    Button b = new Button("Color Dialog");
    b.addActionListener(this);
    add(b);

    // Add canvas
    canvas = new Canvas();
    canvas.setSize(50, 50);
    canvas.setBackground(Color.red);
    add(canvas);

    // Handle window events
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent we) {
        System.exit(0);
      }
    });
  }

  public void actionPerformed(ActionEvent ae) {

    // Create and show color dialog
    ColorDialog cd = 
      new ColorDialog(this, "Color Dialog", true);
    cd.show();
  }
}

class ColorDialog extends Dialog 
implements ActionListener, AdjustmentListener {
  ColorDialogDemo parent;
  Scrollbar sr, sg, sb;

  ColorDialog(ColorDialogDemo parent, String title, boolean mode) {
    super(parent, title, mode);
    this.parent = parent;
    
    // Get red, green, and blue components of canvas color
    Color color = parent.canvas.getBackground();
    int r = color.getRed();
    int g = color.getGreen();
    int b = color.getBlue();

    // Create and add "Center" panel
    Panel pc = new Panel();
    pc.setLayout(new GridLayout(3, 2, 5, 5));
    Label lr = new Label("Red");
    lr.setAlignment(Label.RIGHT);
    pc.add(lr);
    sr = new Scrollbar(Scrollbar.HORIZONTAL, r, 10, 0, 255);
    pc.add(sr);
    sr.addAdjustmentListener(this);
    Label lg = new Label("Green");
    lg.setAlignment(Label.RIGHT);
    pc.add(lg);
    sg = new Scrollbar(Scrollbar.HORIZONTAL, g, 10, 0, 255);
    pc.add(sg);
    sg.addAdjustmentListener(this);
    Label lb = new Label("Blue");
    lb.setAlignment(Label.RIGHT);
    pc.add(lb);
    sb = new Scrollbar(Scrollbar.HORIZONTAL, b, 10, 0, 255);
    pc.add(sb);
    sb.addAdjustmentListener(this);
    add(pc, "Center");

    // Create and add "South" panel
    Panel ps = new Panel();
    Button ok = new Button("OK");
    ok.addActionListener(this);
    ps.add(ok);
    add(ps, "South");

    // Handle window events
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent we) {
        System.exit(0);
      }
    });

    // Lay out components and set the initial size 
    // of this dialog box
    pack();
  }

  public Insets getInsets() {
    return new Insets(40, 20, 20, 20);   
  }

  public void actionPerformed(ActionEvent ae) {
    dispose();
  }

  public void adjustmentValueChanged(AdjustmentEvent ae) {

    // Get scroll bar values
    int r = sr.getValue();
    int g = sg.getValue();
    int b = sb.getValue();

    // Set background color of canvas
    parent.canvas.setBackground(new Color(r, g, b));

    // Repaint canvas
    parent.canvas.repaint();
  }
}


