/*
PreparedStatement
--------------------------
1) Is a sub class of Statement
2) PreparedStatement is same as Statement object, but the only difference is PS bound to only one single SQL statement
3) PS pre-compiles SQL statement syntax, and we need to pass only I/P parameters and execute statement
4) In long run PS improves the performance of the JDBC application
*/
// PreInsertTest.java
import java.sql.*;
import java.io.*;

public class PreInsertTest{
public static void main(String rags[]) throws Exception {

DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ssie-PC:1521:orcl","scott","tiger");
//PreparedStatement pstmt=con.prepareStatement("insert into reg values(?,?,?)");
PreparedStatement pstmt=con.prepareStatement("insert into pdemo values(?,?)");
pstmt.setInt(1,12);
pstmt.setString(2,"RAMS");

int i=pstmt.executeUpdate();

System.out.println(i+" row(s) inserted");
pstmt.close();
con.close();
}// main()
}// class