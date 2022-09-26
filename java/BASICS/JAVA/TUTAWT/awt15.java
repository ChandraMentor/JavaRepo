import java.awt.*;
public class awt15 extends Frame{
	Button b1 = new Button("Set Editable"),b2 = new Button("Disable Edit");
	Button b3=new Button("Append Text");
	TextField t = new TextField("", 30);
	String s = new String();
	TextArea ta = new TextArea();
	awt15(String title){
		super(title);
		setLayout(new FlowLayout());
		add(b1);
		add(b2);
		add(b3);
		add(t);add(ta);
	}
	static public void main(String agrs[]){
		awt15 sampframe = new awt15("frame window");
		sampframe.show();
		sampframe.repaint();
		sampframe.resize(500,300);
		}
	public boolean action (Event evt, Object arg) {
		if(evt.target.equals(b1)) {
			t.setEditable(true);
		}
		else if(evt.target.equals(b2)) {
			t.setEditable(false);
		}
		else if(evt.target.equals(b3)) {
			ta.setText(ta.getText() + t.getText());
		}

		else
			return super.action(evt, arg);
		return true; 
	}
}
