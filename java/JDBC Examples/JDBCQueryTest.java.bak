import java.sql.*;

public class JDBCQueryTest{
public static void main(String args[]) throws Exception{
//step 1
//DriverManager.registerDriver(new sun.jdbc.odbc.JdbcOdbcDriver());
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
//step 2 -oracle
Connection con=DriverManager.getConnection("jdbc:odbc:sample"," "," ");
//for ms-access
//Connection con=DriverManager.getConnection("jdbc:odbc:sample"," "," ");
//step 3 enables the sql statement to be written
Statement stmt=con.createStatement();
//step 4
ResultSet rs=stmt.executeQuery("select * from EmpData");
System.out.println("connection success");

while(rs.next()){
System.out.print(rs.getInt(1)+ " ");
System.out.print(rs.getString(2)+ " ");
System.out.println(rs.getInt(3)+" ");
//System.out.println(rs.getInt(4) + " " );
}// while()
rs.close();
stmt.close();
con.close();
  }// main()
}// class