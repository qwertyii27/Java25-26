package animate;

import javax.swing.JFrame;
import java.awt.EventQueue;

public class Application extends JFrame {
  private final int FRAME_WIDTH = 640;
  private final int FRAME_HEIGHT = 480;

  /*
   * Constructor.
   */
  public Application(String title) {
    // the values for border width and title bar height
    // depend on the operating system.
    int border_width = 0;
    int bar_height = 0;
    OS os = checkOS();
    switch (os) {
      case WIN:
        border_width = 7;
        bar_height = 30;
        break;
      case MAC:
        border_width = 0;
        bar_height = 28;
        break;
      case LINUX:
        // I don't know what the values are for Linux.
        break;
      case OTHER:
        break;
    }
    // New board.
    Board board = new Board();
    this.add(board);
    int application_width = (int) board.getPreferredSize().getHeight() + 2 * border_width;
    int application_height = (int) board.getPreferredSize().getHeight() + bar_height + border_width;
    this.setTitle(title);
    this.setSize(application_width, application_height);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
  }

  public static enum OS {
    WIN, MAC, LINUX, OTHER
  }

  public static OS checkOS() {
    OS val;
    String name = System.getProperty("os.name").toLowerCase();
    if (name.indexOf("win") >= 0) {
      val = OS.WIN;
    } else if (name.indexOf("mac") >= 0) {
      val = OS.MAC;
    } else if (name.indexOf("nux") >= 0) {
      val = OS.LINUX;
    } else {
      val = OS.OTHER;
    }
    return val;
  }

  public static void main(String[] args) {
    /*
     * In Java, GUI related actions should be
     * performed in the AWT event thread
     * or it could cause severe problems with the GUI.
     * EventQueue.invokeLater() posts your GUI-related
     * actions in the AWT event queue to avoid causing
     * any problems with other GUI-related actions.
     */
    EventQueue.invokeLater(() -> {
      Application myApp = new Application("test graphics window");
      myApp.setVisible(true);
    });

  }
}
