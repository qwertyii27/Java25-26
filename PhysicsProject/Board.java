import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.Shape;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Board extends JPanel implements MouseListener {
  private final int B_WIDTH = 350;
  private final int B_HEIGHT = 350;
  public final int SIDE_LEN = 250;
  private Graphics2D g2d;
  private String str = "Listening...";

  public Board() {
    setBackground(Color.CYAN);
    setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
    this.setFocusable(true);
    this.addMouseListener(this);
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    g2d = (Graphics2D) g;
    drawText(str);
  }

  public void drawText(String str) {
    clearScreen();
    Graphics2D g2d = this.g2d;
    g2d.setColor(Color.BLACK);
    g2d.drawString(str, B_WIDTH / 2, B_HEIGHT / 2);
  }

  public void clearScreen() {
    g2d.setColor(Color.WHITE);
    g2d.fillRect(0, 0, B_WIDTH, B_HEIGHT);
  }

  public void mouseExited(MouseEvent e) {

  }

  public void mouseClicked(MouseEvent e) {
  }

  public void mouseReleased(MouseEvent e) {

  }

  public void mouseEntered(MouseEvent e) {

  }

  public void mousePressed(MouseEvent e) {
  }
}
