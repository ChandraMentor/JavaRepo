import java.sql.*;

public class TypeIIweblogic{
public static void main(String a[]) throws Exception{
DriverManager.registerDriver(new weblogic.jdbc.oci.Driver());
Connection con=DriverManager.getConnection("jdbc:weblogic:oracle:ssi","scott","tiger");
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("select * from dept");

while(rs.next())
{
System.out.println(rs.getInt(1));
System.out.println(rs.getString(2));
System.out.println(rs.getString(3));
System.out.println();
}// while()
rs.close();
stmt.close();
con.close();
}// main()
}// class
