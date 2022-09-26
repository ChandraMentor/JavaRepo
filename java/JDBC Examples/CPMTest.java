/*
JDBC Connection Pool management
-----------------------------------------------
1) start weblogic server
start->Programs->BEA WebLogic Platform 7.0->WebLogic Server 7.0->Server Tour and Examples-> Launch Examples Server

2) open browser
http://localhost:7001/console
user= weblogic
password= weblogic

select "Connection Pools"
click on "Configure a new JDBC Connection Pool"

General tab
----------------
PoolName: OTP
URL: jdbc:weblogic:oracle
Driver: weblogic.jdbc.oci.Driver

Properties
--------------
user=scott
password=tiger

click on "create" button
click on "Apply" button

connection tab
-------------------
Initial=2
Max=10
increment=2
Login Delay Seconds=1
Refresh Period=10
AllowShrinking=True
Shrink Period=15
"Apply"

Testing tab
---------------
Test table Name=emp
"Apply"

Targets tab
---------------
shift available server to chosen server
"Apply"

Go to console home page
--------------------------------
DataSource
Configure a new JDBC Data Source
Name: OTP
JNDI name: OTP
Pool Name: OTP

"Create" "Apply"

select targets tab
----------------------
shift available server - chosen server
"Apply"

JDBC Program
--------------------
*/
// CPMTest.java
import java.sql.*;
import javax.sql.*;
import java.util.*;
import javax.naming.*;

public class CPMTest{
public static void main(String args[]) throws Exception{
Hashtable ht=new Hashtable();
ht.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
ht.put(Context.PROVIDER_URL,"t3://localhost:7001");

Context ctxt=new InitialContext(ht);
Object o=ctxt.lookup("OPool");
DataSource ds=(DataSource)o;
Connection con=ds.getConnection();
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("select * from dept");

while(rs.next()){
System.out.println(rs.getInt(1));
System.out.println(rs.getString(2));
System.out.println(rs.getString(3));
}// while()
rs.close();
stmt.close();
con.close();
}
}