import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Test {

  public static void main(String[] args) {
    JFrame.setDefaultLookAndFeelDecorated(true);

    GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment
        .getLocalGraphicsEnvironment();
    GraphicsDevice graphicsDevice = graphicsEnvironment
        .getDefaultScreenDevice();

    if (!graphicsDevice
        .isWindowTranslucencySupported(GraphicsDevice.WindowTranslucency.TRANSLUCENT)) {
      System.err.println("Translucency is not supported on this platform");
      System.exit(0);
    }
    ApplicationWindow window = new ApplicationWindow();
    window.setOpacity(0.75f);
    window.setVisible(true);
  }
}
class ApplicationWindow extends JFrame {
  public ApplicationWindow() {
    this.setBounds(100, 100, 200, 200);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setType(Type.NORMAL);

    JButton exitButton = new JButton("Exit");
    this.add(exitButton);
    exitButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        System.exit(0);
      }
    });
  }
}