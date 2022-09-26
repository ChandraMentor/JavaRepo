import java.sql.*;

public class TypeIV {
public static void main(String rags[]) throws Exception,SQLException{
DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
//Connection con=DriverManager.getConnection(jdbc:oracle:thin:@hostname:1521:servicename("database name","username","password");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ssie-PC:1522:xe","guest","guest");
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