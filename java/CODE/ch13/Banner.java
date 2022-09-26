import java.applet.*;
import java.awt.*;

/*
<applet code="Banner" width=350 height=100>
<param name="message" value="This is the message">
<param name="t1" value="200">
<param name="t2" value="3000">
</applet>
*/

public class Banner extends Applet 
implements Runnable {
// Message to be displayed
String message;
// Msec between characters
int t1;
// Msec to display complete message
int t2;
// Width and height of applet
int w,h;
// Index of next characters to display
int index;
// Background buffer
Image buffer;
// Graphics context for background buffer
Graphics bufferg;
  // Reference to thread
 Thread t;
  public void init() {
// Process parameters
message = getParameter("message");
 t1 = Integer.parseInt(getParameter("t1"));
 t2 = Integer.parseInt(getParameter("t2"));
// Determine size of applet
Dimension d = getSize();
w = d.width;
h = d.height;
// Create background buffer 
buffer = createImage(d.width, d.height);
 // Start thread
t = new Thread(this);
t.start();
}
public void update(Graphics g) {
paint(g);
  }
public void paint(Graphics g) {
 // Get graphics context for buffer
if(bufferg == null) 
bufferg = buffer.getGraphics();
//Clear buffer
bufferg.clearRect(0, 0, w, h);
//Set font
bufferg.setFont(new Font("Serif",Font.BOLD,36));
// Display substring
String str = message.substring(0, index);
Dimension d = getSize();
bufferg.drawString(str, 5, d.height/2);
//Copy background buffer to screen
g.drawImage(buffer,0,0,null);
}
public void run() {
try {
while(true) {
// Request a repaint
repaint();
 // Sleep before displaying next character
 // and update index
if(index == message.length()) {
Thread.sleep(t2);
index = 0;
  }
else {
Thread.sleep(t1);
++index;
       }
    }
}
catch(Exception e) {
    }
  }
}