/* Program to demonstrate Jtable Component
   Author : Team -J
   Version : 1.0*/


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;
public class swing18 extends JPanel{ 
 static JFrame myFrame; 
  	public swing18(){  
  		setLayout(new BorderLayout());  
 		DefaultMutableTreeNode rootNode = createNodes();
   		JTree tree = new JTree(rootNode);
    		tree.setRootVisible(true);
    		JScrollPane pane = new JScrollPane();
    		pane.setViewportView(tree);
    		add(pane);
  	}
    	public DefaultMutableTreeNode createNodes(){
		DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("Tree Top");
		DefaultMutableTreeNode nodeone = new DefaultMutableTreeNode ("One");
		DefaultMutableTreeNode nodetwo = new DefaultMutableTreeNode ("Two");
		rootNode.add(nodeone);
		rootNode.add(nodetwo);
		DefaultMutableTreeNode childnode1 =new DefaultMutableTreeNode ("Child node  one");
		DefaultMutableTreeNode childnode2 = new DefaultMutableTreeNode ("Child node two"); 
		nodeone.add(childnode1); 
		nodeone.add(childnode2);
	        childnode1.add(new DefaultMutableTreeNode ("Item 1"));
		childnode1.add(new DefaultMutableTreeNode ("Item 2"));
		childnode2.add(new DefaultMutableTreeNode ("Item 3"));
		childnode2.add(new DefaultMutableTreeNode ("Item 4"));
	        childnode1.add(new DefaultMutableTreeNode ("Item 5")); 
                nodetwo.add(new DefaultMutableTreeNode ("Item 6"));
		nodetwo.add(new DefaultMutableTreeNode ("Item 7"));
		return rootNode;
	  }
 	public static void main(String args[]){
	    myFrame = new JFrame();
	    swing18 tree = new swing18();
	    myFrame.getContentPane().add("Center",tree); 
	    myFrame.setSize(400,250);
	    myFrame.addWindowListener(new WindowAdapter() {
		      public void windowClosing(WindowEvent e) {System.exit(0);}
	    }); 
	   myFrame.setVisible(true);
	  }
}