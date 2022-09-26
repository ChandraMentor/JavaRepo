import java.sql.*;

public class TypeIVTest{
public static void main(String args[]) throws Exception{
DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
//Connection con=DriverManager.getConnection("jdbc:oracle:thin:@computername/ipaddress:1521:databaseservername","username","password");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ssie-PC:1521:orcl","scott","tiger");
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("select * from emp");

while(rs.next()){
System.out.print(rs.getInt(1));
System.out.print(" ");
System.out.print(rs.getString(2));
System.out.print(" ");
System.out.print(rs.getString(3));
System.out.println(" ");
}// while()
rs.close();
stmt.close();
con.close();
}// main()
}// class