// ManualXMLPreparation.java
import java.sql.*;
import java.io.*;

public class ManualXMLPreparation{
public static void main(String rags[]) throws Exception{
DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@computer:1521:ssi","scott","tiger");
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("select * from emp");

String xml="";
xml="<?xml version='1.0'?>";
xml+="<EMPS>";
while(rs.next()){
xml+="<EMP>";
xml+="<EMPNO>"+rs.getInt(1)+"</EMPNO>";
xml+="<ENAME>"+rs.getString(2)+"</ENAME>";
xml+="</EMP>";
}// while()
xml+="</EMPS>";

new PrintStream(new FileOutputStream("emp2.xml")).println(xml);
rs.close();
stmt.close();
con.close();
}
}