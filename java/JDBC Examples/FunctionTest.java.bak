/*
Function calling from JDBC
create or replace function empsal_func(empno1 number) RETURN number AS
sal1 number;
BEGIN
SELECT sal INTO sal1 from emp where empno=empno1;
return sal1;
END;
/
*/
// FunctionTest.java
import java.sql.*;
public class FunctionTest{
public static void main(String rags[]) throws Exception{

DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ssie-PC:1521:orcl","scott","tiger");
//Connection con=DriverManager.getConnection("jdbc:oracle:thin:@computer:1522:xe","hr","hr");
CallableStatement cstmt=con.prepareCall("{?=call empsal_func(?)}");
cstmt.setInt(2,Integer.parseInt(rags[0]));
cstmt.registerOutParameter(1,Types.DOUBLE);
cstmt.execute();

System.out.println(cstmt.getDouble(1));
cstmt.close();
con.close();
  }// main()
}// class