// OracleXMLSaveTest.java
import java.sql.*;
import oracle.xml.sql.dml.*;
import java.io.*;
public class OracleXMLSaveTest
{
public static void main(String rags[]) throws Exception
{
DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ssi:1521:ssi","scott","tiger");
OracleXMLSave save=new OracleXMLSave(con,"emp");
save.insertXML(new FileInputStream("emps3.xml"));
con.close();
}
}
