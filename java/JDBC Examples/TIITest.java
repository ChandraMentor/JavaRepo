import java.sql.*;

public class TIITest{
public static void main(String args[]) throws Exception{
//DriverManager.registerDriver(oracle.jdbc.driver.OracleDriver);
DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
Connection con=DriverManager.getConnection("jdbc:oracle:oci8:@localhost","guest","guest");

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