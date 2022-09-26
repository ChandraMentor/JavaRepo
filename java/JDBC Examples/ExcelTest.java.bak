// JDBC to EXCEL
// Excel data being imported in Java
import java.sql.*;
import java.io.*;

class ExcelTest {
public static void main(String a[]) {
try {
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con;
con=DriverManager.getConnection("jdbc:odbc:ed");
Statement st;
st = con.createStatement();
ResultSet rs;
rs = st.executeQuery("Select * from [emp$]");
                
while(rs.next()) {
System.out.print(rs.getInt(1) + "  ");
System.out.print(rs.getString("empname") + "  ");
System.out.println(rs.getString("empsal"));
    }
   rs.close(); 
   st.close();
   con.close();
         } // try
catch(ClassNotFoundException ce){
 ce.printStackTrace();
 }
catch(SQLException se){
se.printStackTrace();
}
catch(Exception e)  {
e.printStackTrace();
   }
 } // main
} // class