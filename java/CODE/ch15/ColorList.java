import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Enumeration;
import java.util.Hashtable;
/*
  <applet code="ColorList" width=400 height=100>
  </applet>
*/

public class ColorList extends Applet 
implements ItemListener {
  Hashtable ht;
  List list;
  Canvas canvas;

  public void init() {
  
    // Create hash table
    ht = new Hashtable();
    ht.put("Black", Color.black);
    ht.put("Blue", Color.blue);
    ht.put("Cyan", Color.cyan);
    ht.put("Dark Gray", Color.darkGray);
    ht.put("Gray", Color.gray);
    ht.put("Green", Color.green);
    ht.put("Light Gray", Color.lightGray);
    ht.put("Magenta", Color.magenta);
    ht.put("Orange", Color.orange);
    ht.put("Pink", Color.pink);
    ht.put("Red", Color.red);
    ht.put("White", Color.white);
    ht.put("Yellow", Color.yellow);

    // Create list
    list = new List();
    Enumeration keys = ht.keys();
    while(keys.hasMoreElements()) {
      list.add((String)keys.nextElement());
    }
    list.addItemListener(this);
    add(list);

    // Create canvas
    canvas = new Canvas();
    canvas.setBackground(Color.black);
    canvas.setSize(30, 30);
    add(canvas);
  }

  public void itemStateChanged(ItemEvent ie) {
    String str = list.getSelectedItem();
    canvas.setBackground((Color)ht.get(str));
    canvas.repaint();
  }
}