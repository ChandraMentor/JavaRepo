
/* Program to show how to use Jtable component
Author : Team -J
Version : 1.0*/


import java.awt.*;import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.event.*;
public class swing17 extends JPanel{ 
static JFrame myFrame;  
	public swing17(){    
		setLayout(new BorderLayout());
    		JTable table = new JTable(new myTableModel()); 
   		JScrollPane pane = JTable.createScrollPaneForTable(table);
    		add(pane);
      		} 
 	public static void main(String args[]){   
 		myFrame = new JFrame(); 
   		swing17 table= new swing17();  
 		myFrame.getContentPane().add("Center",table);
    		myFrame.setSize(400,300);
    		myFrame.addWindowListener(new WindowAdapter() {
      			public void windowClosing(WindowEvent e) {System.exit(0);}
      			});   
		 myFrame.setVisible(true); 
 	}
}

class myTableModel extends AbstractTableModel{
  	String data[][] ={{"1","one"},{"2","two"},{"3","three"},{"4","four"},{"5","five"},
				{"6","six"},{"7","seven"}}; 
 	String columnNames[] ={"Sno","Text"};

    	public int getRowCount(){    return data.length;  }
    	public int getColumnCount(){    return columnNames.length;  }  
    	public Object getValueAt(int row,int column){    
		  return data[row][column]; 
   	}   
    	public String getColumnName(int column){  
  		return columnNames[column]; 
 	}   
 	public void setValueAt(Object value, int row, int column){ 
	   	if (value instanceof String){ 
     			data[row][column] = (String)value;  
  		}
		fireTableChanged(new TableModelEvent(this,row,row,column)); 
 	} 
 	public boolean isCellEditable(int row, int col) {
		return true;
	} 
 	public Class getColumnClass(int c){
		return getValueAt(0, c).getClass();
	}
}