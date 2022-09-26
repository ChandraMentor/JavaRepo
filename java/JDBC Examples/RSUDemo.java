/*
Updatable resultset
*/
// RSUDemo.java
import java.sql.*;
public class RSUDemo{
public static void main(String rags[]) throws Exception{
DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
//DriverManager.registerDriver(new sun.jdbc.odbc.JdbcOdbcDriver());
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@computer:1521:ssi","scott","tiger");
//Connection con=DriverManager.getConnection("jdbc:odbc:DSNOracle","scott","tiger");
Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
ResultSet rs=stmt.executeQuery("select * from emp");
rs.last();
rs.updateDouble(6, 1500.00);
rs.updateRow();
rs=stmt.executeQuery("select * from emp");
while(rs.next()){
System.out.print(rs.getInt(1)+": ");
System.out.println(rs.getDouble(6));
}// while()
rs.close();
stmt.close();
con.close();
}// main()
}// class
