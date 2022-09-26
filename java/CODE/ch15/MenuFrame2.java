import java.awt.*;
import java.awt.event.*;

class MenuFrame2 extends Frame
implements ActionListener, ItemListener {
  TextArea ta;

  public static void main(String args[]) {
    MenuFrame2 mf2 = new MenuFrame2("MyFrame");
    mf2.show();
    mf2.setSize(200, 200);
  }

  MenuFrame2(String title) {

    // Invoke the superclass constructor
    super(title);

    // Register to receive window events
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent we) {
        System.exit(0);
      }
    });

    // Create and set manu bar
    MenuBar mb = new MenuBar();
    setMenuBar(mb);

    // Create menu A
    Menu a = new Menu("A");
    mb.add(a);
    MenuItem a1 = new MenuItem("A1");
    a1.addActionListener(this);
    a.add(a1);
    MenuItem a2 = new MenuItem("A2");
    a2.addActionListener(this);
    a.add(a2);
    MenuItem a3 = new MenuItem("A3");
    a3.addActionListener(this);
    a.add(a3);

    // Create menu B
    Menu b = new Menu("B");
    mb.add(b);
    MenuItem b1 = new MenuItem("B1");
    b1.addActionListener(this);
    b.add(b1);
    MenuItem b2 = new MenuItem("B2");
    b2.addActionListener(this);
    b.add(b2);

    // Create sub-menu for B3
    Menu b3 = new Menu("B3");
    b.add(b3);
    MenuItem b31 = new MenuItem("B31");
    b31.addActionListener(this);
    b3.add(b31);
    MenuItem b32 = new MenuItem("B32");
    b32.addActionListener(this);
    b3.add(b32);
    MenuItem b33 = new MenuItem("B33");
    b33.addActionListener(this);
    b3.add(b33);

    // Create menu C
    Menu c = new Menu("C");
    mb.add(c);
    MenuItem c1 = new MenuItem("C1");
    c1.addActionListener(this);
    c.add(c1);
    MenuItem c2 = new MenuItem("C2");
    c2.addActionListener(this);
    c.add(c2);

    // Create menu D
    Menu d = new Menu("D");
    mb.add(d);
    CheckboxMenuItem d1 = new CheckboxMenuItem("D1");
    d1.addItemListener(this);
    d.add(d1);
    CheckboxMenuItem d2 = new CheckboxMenuItem("D2");
    d2.addItemListener(this);
    d.add(d2);    

    // Create a text area and add it to the frame
    ta = new TextArea(10, 20);
    add(ta, "Center");
  }

  public void actionPerformed(ActionEvent ae) {
    ta.append("ActionEvent: " +
      ae.getActionCommand() + "\n");
  }

  public void itemStateChanged(ItemEvent ie) {
    CheckboxMenuItem cbmi = (CheckboxMenuItem)ie.getSource();
    ta.append("ItemEvent: " +
      cbmi.getLabel() + "\n");
  }
}
