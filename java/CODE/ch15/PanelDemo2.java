import java.applet.*;
import java.awt.*;
/*
  <applet code="PanelDemo2" width=200 height=250>
  </applet>
*/

public class PanelDemo2 extends Applet {

  public void init() {

    // Set layout manager
    setLayout(new GridLayout(1, 2));

    // Create panel for entry 1, 1
    Panel p11 = new Panel();
    p11.setLayout(new GridLayout(3, 1));
    CheckboxGroup cbg = new CheckboxGroup();
    Checkbox red = new Checkbox("Red", cbg, true);
    p11.add(red);
    Checkbox green = new Checkbox("Green", cbg, false);
    p11.add(green);
    Checkbox blue = new Checkbox("Blue", cbg, false);
    p11.add(blue);
    add(p11);

    // Create panel for entry 1, 2
    Panel p12 = new Panel();
    p12.setLayout(new GridLayout(4, 1));
    Checkbox annuities = new Checkbox("Annuities");
    p12.add(annuities);
    Checkbox bonds = new Checkbox("Bonds");
    p12.add(bonds);
    Checkbox options = new Checkbox("Options");
    p12.add(options);
    Checkbox stocks = new Checkbox("Stocks");
    p12.add(stocks);
    add(p12);
  }

  public Insets getInsets() {
    return new Insets(5, 5, 5, 5);
  }
}
