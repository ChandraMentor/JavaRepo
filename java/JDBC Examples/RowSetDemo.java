/*
RowSet
-----------
Connection less RS
Serializable RS

*JDK1.4 
*javax.sql.RowSet package jar file from java.sun.com site 
*use III r party vendor API (BEA WebLogic Application Server)

*/
// RowSetDemo.java
import java.sql.*;
import weblogic.jdbc.rowset.*;
public class RowSetDemo{
public static void main(String rags[]) throws Exception
{
DriverManager.registerDriver(new sun.jdbc.odbc.JdbcOdbcDriver());
Connection con=DriverManager.getConnection("jdbc:odbc:DSNOracle","scott","tiger");

Statement stmt=con.createStatement();

ResultSet rs=stmt.executeQuery("select * from emp");

CachedRowSetImpl rowset=new CachedRowSetImpl();

rowset.populate(rs);

rs.close();
stmt.close();
con.close();

rowset.last();
System.out.print(rowset.getInt(1)+":");
System.out.print(rowset.getDouble(6));
}// main()
}// class