 import java.sql.*;
import oracle.jdbc.pool.OracleDataSource;

public class TypeIITestORA{
public static void main(String args[]) throws Exception{

OracleDataSource ods = new OracleDataSource();
ods.setUser("scott");
ods.setPassword("tiger");
ods.setURL("jdbc:oracle:oci:@");
ods.setURL("jdbc:oracle:oci:@ssi");

Connection con;
con = ods.getConnection();
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("select * from emp");

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
con.close();
}// main()
}// class