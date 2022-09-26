import java.sql.*;

public class TypeIIITest{
public static void main(String rags[]) throws Exception{
DriverManager.registerDriver(new weblogic.jdbc.oci.Driver());
onnection con=DriverManager.getConnection("jdbc:weblogic:oracle","scott","tiger");
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("select * from dept");

while(rs.next()){
System.out.println(rs.getInt(1));
System.out.println(rs.getString(2));
System.out.println(rs.getString(3));
System.out.println();
}// while()
rs.close();
stmt.close();
con.close();
   }// main()
}// class