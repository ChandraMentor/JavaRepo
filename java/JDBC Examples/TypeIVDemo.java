import java.sql.*;

public class TypeIVDemo {
public static void main(String rags[]) throws Exception,SQLException{
DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
//Connection con=DriverManager.getConnection(jdbc:oracle:thin:@hostname:1521:servername","username","password");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ssie-PC:1521:orcl","scott","tiger");
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("select * from emp");

while(rs.next()){
System.out.print(rs.getInt(1) + " ");
System.out.print(rs.getString(2) + " ");
System.out.println(rs.getString(3));
System.out.println();
}// while()
rs.close();
stmt.close();
con.close();
   }// main()
}// class