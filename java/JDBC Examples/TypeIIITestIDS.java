import java.sql.*;

public class TypeIIITestIDS {
public static void main(String rags[]) throws Exception{

DriverManager.registerDriver(new ids.sql.IDSDriver());
//if we are using type1 then we have establish the below said
Connection con=DriverManager.getConnection("jdbc:ids://localhost:12/conn?dsn='IDSXE'");	
//if we are using type2 then we have establish connection

Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("select * from emp");

while(rs.next()) {
System.out.print(rs.getInt(1) + " ");
System.out.print(rs.getString(2) + " ");
System.out.println(rs.getString(3));
System.out.println();
}// while()
rs.close();
stmt.close();
con.close();
  }// main()
}// class