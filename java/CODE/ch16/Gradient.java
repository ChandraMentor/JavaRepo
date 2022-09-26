import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
  <applet code="Gradient" width=250 height=250>
  </applet>
*/

public class Gradient extends Applet 
implements ItemListener {
  Checkbox cb1, cb2;
  MyCanvas myCanvas;

  public void init() {

    // Set layout manager
    setLayout(new BorderLayout());

    // Create panel for "North"
    Panel pn = new Panel();
    CheckboxGroup cbg = new CheckboxGroup();
    cb1 = new Checkbox("Horizontal", cbg, true);
    cb1.addItemListener(this);
    pn.add(cb1);
    cb2 = new Checkbox("Vertical", cbg, false);
    cb2.addItemListener(this);
    pn.add(cb2);
    add(pn, "North");

    // Create panel for "Center"
    Panel pc = new Panel();
    myCanvas = new MyCanvas(this);
    myCanvas.setSize(200, 200);
    pc.add(myCanvas);
    add(pc, "Center");
  }
  
  public void itemStateChanged(ItemEvent ie) {
    myCanvas.repaint();
  }
}

class MyCanvas extends Canvas {
  Gradient gradient;

  public MyCanvas(Gradient gradient) {
    this.gradient = gradient;
  }

  public void paint(Graphics g) {

    // Select horizontal or vertical gradient 
    if(gradient.cb1.getState())
      hgradient(g);
    else
      vgradient(g);
  }

  public void hgradient(Graphics g) {
    Dimension d = getSize();
    float delta = (float)(255/d.width);
    for(int i = 0; i < d.width; i++) {
      int c = (int)(delta * i);
      g.setColor(new Color(c, c, c));
      g.drawLine(i, 0, i, d.height);
    }
  }

  public void vgradient(Graphics g) {
    Dimension d = getSize();
    float delta = (float)(255/d.height);
    for(int i = 0; i < d.height; i++) {
      int c = (int)(delta * i);
      g.setColor(new Color(c, c, c));
      g.drawLine(0, i, d.width, i);
    }
  }
}