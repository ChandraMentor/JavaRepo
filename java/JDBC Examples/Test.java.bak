import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class Test {
  public static void main(String[] args) throws Exception {
    String driver ="com.mysql.jdbc.Driver";
	String databaseUrl = "jdbc:mysql://localhost:3306/employee";
    String username = "root";
    String password = "root";

    RowSetFactory rowSetFactory = null;
    rowSetFactory = RowSetProvider.newFactory(
        "com.sun.rowset.RowSetFactoryImpl", null);
    JdbcRowSet rowSet = rowSetFactory.createJdbcRowSet();

    rowSet.setUrl(databaseUrl);
    rowSet.setUsername(username);
    rowSet.setPassword(password);
    rowSet.setCommand("SELECT * FROM emp");
    rowSet.execute();

    while (rowSet.next()) {
      System.out.println(rowSet.getInt("empno") + " - "
          + rowSet.getString("empname"));
    }
  }
}