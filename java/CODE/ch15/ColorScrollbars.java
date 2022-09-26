import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
  <applet code="ColorScrollbars" width=400 height=60>
  </applet>
*/

public class ColorScrollbars extends Applet 
implements AdjustmentListener {
  Scrollbar rsb, gsb, bsb;
  Canvas canvas;

  public void init() {
    Label rl = new Label("Red", Label.RIGHT);
    add(rl);
    rsb = new Scrollbar(Scrollbar.HORIZONTAL, 255, 5, 0, 255);
    rsb.addAdjustmentListener(this);
    add(rsb);
    Label gl = new Label("Green", Label.RIGHT);
    add(gl);
    gsb = new Scrollbar(Scrollbar.HORIZONTAL, 0, 5, 0, 255);
    gsb.addAdjustmentListener(this);
    add(gsb);
    Label bl = new Label("Blue", Label.RIGHT);
    add(bl);
    bsb = new Scrollbar(Scrollbar.HORIZONTAL, 0, 5, 0, 255);
    bsb.addAdjustmentListener(this);
    add(bsb);
    canvas = new Canvas();
    canvas.setSize(30, 30);
    canvas.setBackground(new Color(255, 0, 0));
    add(canvas);
  }

  public void adjustmentValueChanged(AdjustmentEvent ae) {
    int r = rsb.getValue();
    int g = gsb.getValue();
    int b = bsb.getValue();
    Color color = new Color(r, g, b);
    canvas.setBackground(color);
    canvas.repaint();
  }
}