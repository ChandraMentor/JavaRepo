import java.awt.*;
public class awt17 extends Frame{
	awt17(String t){
		setLayout(new GridLayout(5,5));
		for(int i = 0; i <5;i++)
			for (int j=0;j <5;j++)
				add ( new Button("B" + i +j));
		resize(200,300);
	}
	public static void main (String args[]){
		awt17 win = new awt17 (" Border Layout");
		win.show();
	}
} 