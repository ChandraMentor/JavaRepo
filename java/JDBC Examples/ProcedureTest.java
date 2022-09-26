/*
CallableStatement
------------------------
The interface used to execute SQL stored procedures. JDBC provides a stored procedure SQL escape syntax that allows stored procedures to be called in a standard way for all RDBMSs.

CallableStatement cstmt=con.prepareCall("{call procedure_name(?,?)}");

Note: Parameter may be an OUT / IN parameter:
To pass value to IN parameter
cstmt.setInt(1,10);
OUT parameter:
cstmt.registerOutParameter(2,Types.INTEGER);
cstmt.execute();

SQL Procedure definition
---------------------------------
	create or replace procedure empsal_proc(empno1 in number,  sal1 out number) AS
	BEGIN
	SELECT salary INTO sal1 from emp1 where empno=empno1;
	END;
/
*/
// ProcedureTest.java
import java.sql.*;

public class ProcedureTest {
public static void main(String args[]) throws Exception {
DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ssie-PC:1522:xe","guest","guest");
CallableStatement cstmt=con.prepareCall("{call empsal_proc(?,?)}");
cstmt.setInt(1,1);
cstmt.registerOutParameter(2,Types.DOUBLE);
boolean flag=cstmt.execute();
System.out.println(cstmt.getDouble(2));
System.out.println("Procedure executed successfully...");
    }
}