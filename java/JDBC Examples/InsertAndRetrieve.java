import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;

class Form extends JFrame 
{
JButton ADD,RETRIEVE;
JPanel panel;
JLabel label1,label2;
 final JTextField text1,text2;
Form()
{
final Vector columnNames = new Vector();
final Vector data = new Vector();

label1 = new JLabel();
label1.setText("Employee Name:");
text1 = new JTextField(20);

label2 = new JLabel();
label2.setText("Employee Address:");
text2 = new JTextField(20);

ADD=new JButton("ADD");
RETRIEVE=new JButton("RETRIEVE");

panel=new JPanel(new GridLayout(3,2));
panel.add(label1);
panel.add(text1);
panel.add(label2);
panel.add(text2);
panel.add(ADD);
panel.add(RETRIEVE);
add(panel,BorderLayout.CENTER);
setTitle("FORM");

ADD.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae){
String value1=text1.getText();
String value2=text2.getText();
try{
Connection con = null;
DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
con=DriverManager.getConnection("jdbc:oracle:thin:@ssie-PC:1522:xe","guest","guest");


Statement st = con.createStatement();
int i= st.executeUpdate("Insert into employee(empName,empAddress) values('"+value1+"','"+value2+"')");
JOptionPane.showMessageDialog(null,"Data is successfully inserted into the database." );
st.close();
con.close();
}
catch(Exception e){
System.out.println(e);
}
}
});
RETRIEVE.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae){
try{
Connection con = null;
DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
con=DriverManager.getConnection("jdbc:oracle:thin:@ssie-PC:1522:xe","guest","guest");



Statement st = con.createStatement();
ResultSet rs= st.executeQuery("Select * from employee");
ResultSetMetaData md = rs.getMetaData();
int columns = md.getColumnCount();
for (int i = 1; i <= columns; i++) {
columnNames.addElement( md.getColumnName(i) );
}
while (rs.next()) {
Vector row = new Vector(columns);
for (int i = 1; i <= columns; i++) {
row.addElement( rs.getObject(i) );
}
data.addElement( row );
}
rs.close();
st.close();
}
catch(Exception e) {}
JFrame tab=new JFrame();
JTable table = new JTable(data, columnNames);
JScrollPane scrollPane = new JScrollPane(table);
tab.add( scrollPane );
tab.setVisible(true);	
tab.setSize(300,100);
}
});
}
}
class InsertAndRetrieve
{
public static void main(String arg[])
{
try
{
Form frame=new Form();
frame.setSize(300,100);
frame.setVisible(true);
}
catch(Exception e)
{}
}
}