import java.awt.*;

class MyDialog extends Dialog{
	TextField name = new TextField("",10);
	Button B1= new Button ("Ok");
	String Sname;
	public MyDialog(Frame parent){
		super(parent,"My Dialog", true);
		setLayout(new FlowLayout());
		add(name);
		add(B1);
		resize(200,200);
	}
	public boolean action(Event evt , Object obj){
		if(evt.target == B1){
			Sname = name.getText();
			dispose();
		}
		else
			return false;
		return true;
	}
	public String getSName(){
		return Sname;
	}
}

public class awt19 extends Frame{
	Button ShowDialog,readname;
	MyDialog dia1;
	awt19(String t){
		setLayout(new GridLayout(5,5));
		add (ShowDialog= new Button("Show Dialog"));
		add (readname= new Button("Read Name"));
		dia1 = new MyDialog(this);
		resize(200,300);
	}
	public static void main (String args[]){
		awt19 win = new awt19 (" card Layout");
		win.show();
	}
	public boolean action(Event evt, Object obj){
		if(evt.target == ShowDialog){
			dia1.show();
		}
		if(evt.target == readname){
			System.out.println(dia1.getSName());
		}
		return super.action(evt,obj);
	}
	public boolean  handleEvent(Event evt){
		if(evt.id == Event.WINDOW_DESTROY)
			System.exit(0);
		return super.handleEvent(evt);
	}
} 