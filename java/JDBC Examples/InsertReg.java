/*
Example on insert operation
drop table reg;
create table reg (regid number PRIMARY KEY, name varchar2(20), email varchar2(20));
*/
// InsertReg.java

import java.sql.*;
import java.io.*;

public class InsertReg{
public static void main(String rags[]) throws Exception{
// Register Driver
DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ssie-PC:1522:xe","guest","guest");
Statement stmt=con.createStatement();
DataInputStream in=new DataInputStream(System.in);

System.out.println("Enter Name");
String name=in.readLine().trim();

System.out.println("Enter Email");
String email=in.readLine().trim();

ResultSet rs=stmt.executeQuery("select max(regid) from reg");

int regid=0;
if(rs.next())
{
regid=rs.getInt(1);
regid++;
}
else
{
regid=1;
}// else
rs.close();

String sql="insert into reg values("+regid+",'"+name+"','"+email+"')";
int i=stmt.executeUpdate(sql);
stmt.close();
con.close();
System.out.println(i+" row(s) inserted");
}// main()
}// class