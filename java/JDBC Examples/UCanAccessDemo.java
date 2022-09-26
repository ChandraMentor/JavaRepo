import java.lang.*;
import java.sql.*;

class UCanAccessDemo {
public static void main(String args[]) throws SQLException {
Connection conn=DriverManager.getConnection("jdbc:ucanaccess://D:/test/Employee.mdb");
Statement s = conn.createStatement();
ResultSet rs = s.executeQuery("SELECT [EName] FROM [Emp]");
while (rs.next()) {
System.out.println(rs.getString(1));
     }
   }
}