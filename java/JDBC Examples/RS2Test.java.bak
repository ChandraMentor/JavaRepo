// RS2Test.java
import java.sql.*;

public class RS2Test{
public static void main(String rags[]) throws Exception{

DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@computer:1521:ssi","scott","tiger");
Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
ResultSet rs=stmt.executeQuery("select * from emp");

rs.afterLast();
while(rs.previous()) {
System.out.print(rs.getInt(1)+":");
System.out.println(rs.getString(2));
}// while()
rs.close();
stmt.close();
con.close();
}// main()
}// class
