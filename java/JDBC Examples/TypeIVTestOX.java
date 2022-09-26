import java.sql.*;
import oracle.jdbc.pool.OracleDataSource;

public class TypeIVTestOX{
public static void main(String args[]) throws Exception,SQLException{

OracleDataSource ods = new OracleDataSource();
ods.setUser("hr");
ods.setPassword("hr");
ods.setURL("jdbc:oracle:thin:@computer:1522:xe");
System.out.println("Before Connection");

Connection conn;
conn = ods.getConnection();
Statement stmt=conn.createStatement();
ResultSet rs=stmt.executeQuery("select * from employees");

while(rs.next()){
System.out.print(rs.getInt(1));
System.out.print(" ");
System.out.print(rs.getString(2));
System.out.print(" ");
System.out.print(rs.getString(3));
System.out.println();
}// while()
rs.close();
stmt.close();
conn.close();
}// main()
}// class