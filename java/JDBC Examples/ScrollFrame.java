/*perform first,last,previous and next navigation buttons  using scrollable ResultSet*/

import java.sql.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ScrollFrame extends Frame implements ActionListener
{
	TextField tsno, tsna, tsadd;
	Label lno,lna,ladd;
	Button bfirst, blast, bnext, bprevious;
        Connection con=null;
        Statement st=null;
        ResultSet rs=null;
        ScrollFrame()
	{
		setLayout(new FlowLayout());
		setBackground(Color.green);
		setSize(400,200);
        lno=new Label("Name");
		add(lno);
		tsno = new TextField(20);
		add(tsno);
		lna=new Label("FName");
		add(lna);
		
		tsna = new TextField(20);
		add(tsna);
		ladd=new Label("Address");
		add(ladd);
		
		tsadd = new TextField(20);
		add(tsadd);

		bfirst = new Button("first");	
		add(bfirst);
		bfirst.addActionListener(this);
	

		blast =new Button("last");
		add(blast);
		blast.addActionListener(this);
		

		bprevious = new Button("previous");	
		add(bprevious);
		bprevious.addActionListener(this);

		bnext = new Button("next");	
		add(bnext);
		bnext.addActionListener(this);
		setVisible(true);
		makeConnection();
	}

	void makeConnection()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");

            con = DriverManager.getConnection("jdbc:oracle:thin:@ssie-PC:1522:xe","guest","guest");
			st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			rs = st. executeQuery("select * from student");
                }
                catch(Exception ce)
		{
			ce.printStackTrace();
		}
	}//make connection

	public void actionPerformed(ActionEvent ae)
	{	
		boolean found=false;
		try
		{
			System.out.println(ae.getActionCommand());
			if(ae.getSource()==bfirst)
			{
				rs.first();
				found=true;
			}
			else
				if(ae.getSource()==blast)
				{
				rs.last();
				found=true;
				}
			else
				if(ae.getSource()==bnext)
				{
					if(!rs.isLast())
					{
						rs.next();
						found=true;
					}
				}
			else
				if(ae.getSource()==bprevious)
				{
					if(!rs.isFirst())
					{
						rs.previous();
						found=true;
					}
				}
			if(found)
			{
				tsno.setText(rs.getString(1));
				tsna.setText(rs.getString(2));
				tsadd.setText(rs.getString(3));
			}
		}catch(Exception e)
		  {
			e.printStackTrace();
		  }
	}//actionPerformed

	public static void main(String args[])
	{
		new ScrollFrame();
	}
}
		

			
	
