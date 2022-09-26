import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MenuBarExample extends JPanel implements ItemListener
	{
	  static JFrame myFrame;
	  Font myFont = new Font("Dialog", Font.PLAIN, 12);
	  public MenuBarExample(){//
   setFont(myFont);    
JTabbedPane tabs = new JTabbedPane(SwingConstants.BOTTOM);
    Icon icon = new ImageIcon ("feet.gif");  
  JButton button = new JButton(icon); 
   JLabel label = new JLabel ("Hello World!"); 
   tabs.addTab("Hello World",label);  
  tabs.addTab("Feet",icon,button);  
  setLayout(new BorderLayout()); 
   add(tabs,"Center"); 
   add(createMenu(),"North"); 
 } 
 public JMenuBar createMenu(){ 
   JMenuBar menuBar = new JMenuBar();
    // File Menu - create this so we have at least two menu options  
  JMenu file = (JMenu) menuBar.add(new JMenu("File")); 
   file.setMnemonic('F'); 
   JMenuItem mi; 
//Temporary place holder 
   //Add several items under 'File' these won't do anything.
    mi = (JMenuItem) file.add(new JMenuItem("Open")); 
   mi.setMnemonic('O');   
 mi = (JMenuItem) file.add(new JMenuItem("Save")); 
   mi.setMnemonic('S'); 
   mi = (JMenuItem) file.add(new JMenuItem("Save As..."));   
 mi.setMnemonic('A');    
file.add(new JSeparator()); 
   mi = (JMenuItem) file.add(new JMenuItem("Exit"));   
     // Look and Feel Menu 
   JMenu options = (JMenu) menuBar.add(new JMenu("L&F"));
    options.setMnemonic('L');     
   // Look and Feel Radio control    
ButtonGroup group = new ButtonGroup();   
 mi = options.add(new JRadioButtonMenuItem("Windows Style Look andcc]Feel"));
    mi.setActionCommand("java.swing.plaf.windows.WindowsLookAndFeel");
    //If the current look and feel is windows, select this item.  
  mi.setSelected(UIManager.getLookAndFeel().getName().equals("Windows"));  
  group.add(mi);  
  mi.addItemListener(this); 
   //  mi.setAccelerator(KeyStroke.getKeyStrokecc](KeyEvent.VK_1, ActionEvent.ALT_MASK)); 
   mi = options.add(new JRadioButtonMenuItem("Motif Look and Feel"));  
  mi.setActionCommand("java.swing.plaf.motif. MotifLookAndFeel");  
  mi.setSelected(UIManager.getLookAndFeel().getName().equals("CDE/Motif"));  
  group.add(mi);    mi.addItemListener(this);  
 //  mi.setAccelerator(KeyStroke.getKeyStrokecc](KeyEvent.VK_2, ActionEvent.ALT_MASK));
    mi = options.add(new JRadioButtonMenuItem("Metal Look and Feel")); 
   mi.setActionCommand("java.swing.plaf.metal.MetalLookAndFeel");  
  mi.setSelected(UIManager.getLookAndFeel().getName().equals("Metal"));  
  //  metalMenuItem.setSelected(true);   
 group.add(mi);    
mi.addItemListener(this);
    //  metalMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_3, ActionEvent.ALT_MASK));
    return menuBar;  
}   
 public void itemStateChanged(ItemEvent e) {
    Component root = myFrame; 
   //Bump the cursor into a wait mode while we make this change
    root.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR)); 
   //Get the source of the event.   
 JRadioButtonMenuItem button = (JRadioButtonMenuItem) e.getSource(); 
   try {    
  if(button.isSelected()) {     
   UIManager.setLookAndFeel(button.getActionCommand()); 
       button.setEnabled(true); 
       SwingUtilities.updateComponentTreeUI(myFrame);
      }  
  } catch (UnsupportedLookAndFeelException exc) { 
     // Error - unsupported L&F    
  button.setEnabled(false);  
    System.err.println("Unsupported LookAndFeel: " + button.getText());
    }catch (Exception exc2)
{         System.err.println("Couldn't load Look and feel" + button.getText());
    }  
  root.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR)); 
 }   
   public static void main(String args[]){ 
   myFrame = new JFrame("MenuBar Example"); 
   MenuBarExample menuExample = new MenuBarExample(); 
   myFrame.getContentPane().add("Center",menuExample); 
   myFrame.setSize(400,200);  
  myFrame.addWindowListener(new WindowAdapter() { 
     public void windowClosing(WindowEvent e) {System.exit(0);}  
    });    myFrame.setVisible(true);  }
}