import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class SchemaTest {
  public static void main(String[] args) throws Exception {
    Class.forName("com.mysql.jdbc.Driver");	
 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");

    DatabaseMetaData metaData = con.getMetaData();
    ResultSet resultSet = metaData.getPseudoColumns("", "schemaName",
        "tableName", "");

    while (resultSet.next()) {
      System.out.println(resultSet.getString("TABLE_SCHEM ") + " - "
          + resultSet.getString("COLUMN_NAME "));
    }

  }
}
