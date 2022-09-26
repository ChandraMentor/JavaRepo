import java.sql.*;
public class Client
{
	public static void main(String[] args)throws Exception
	{
		System.out.println("Hello World!");

		DriverManager.registerDriver(new com.jcon.JConDriver());
		Connection con=DriverManager.getConnection("jdbc:jcon:localhost:1099:DNSOracle");
/*
		Statement st=con.createStatement();
		System.out.println(st.executeUpdate("insert into mybank values(\'"+args[0]+"\')"));
		
		ResultSet rs=st.executeQuery("select * from mybank");
		while (rs.next())
		{
			System.out.println(rs.getString(1)+"\t"+rs.getDouble(2));
		}

		PreparedStatement ps=con.prepareStatement("insert into mybank values(?,?)");
		ps.setString(1,args[0]);
		ps.setDouble(2,Double.parseDouble(args[1]));
		System.out.println(ps.executeUpdate());
*/
		PreparedStatement ps1=con.prepareStatement("select * from mybank");
		
		ResultSet rs=ps1.executeQuery();
		while (rs.next())
		{
			System.out.println(rs.getString(1)+"\t"+rs.getDouble(2));
		}
	}
}