import java.applet.*;
import java.awt.*;
import java.util.*;
/*
  <applet code="Greeting" width=250 height=60>
  </applet>
*/

public class Greeting extends Applet {

  public void init() {
    Label label = new Label();
    Calendar calendar = Calendar.getInstance();
    int hours = calendar.get(Calendar.HOUR_OF_DAY);
    if(hours < 12) {
      label.setText("Good morning");
    }
    else if(hours < 18) {
      label.setText("Good afternoon");
    }
    else {
      label.setText("Good evening");
    }
    add(label);
  }
}