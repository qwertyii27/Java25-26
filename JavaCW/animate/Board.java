package animate;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Board extends JPanel {
  private final int B_WIDTH = 350;
  private final int B_HEIGHT = 350;
  public final int SIDE_LEN = 250;

  public Board() {
    setBackground(Color.CYAN);
    setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    Graphics2D g2d = (Graphics2D) g;

    g2d.setColor(Color.MAGENTA);
    g2d.fillRect(0, 0, SIDE_LEN, SIDE_LEN);
  }
}
