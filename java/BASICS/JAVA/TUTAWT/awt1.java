/* Program to show a simple window on the screen
Author : Team -J
Version : 1.0 */
import java.awt.*;

class awt1 extends Frame{
	 static public void main(String agrs[]){
		awt1 sampframe = new awt1("frame window");
		sampframe.show();
		}
	awt1(String title){
		super(title);
		}
	public boolean handleEvent ( Event evobj ) {
		if (evobj.id == Event.WINDOW_DESTROY)
			System.exit(0);
		return super.handleEvent ( evobj);
		}
}