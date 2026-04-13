//TODO: Fix package/compilation issues here.
package animate;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.Shape;
import java.awt.Rectangle;

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

    // translate in the x and y directions.
    int x_t = B_WIDTH / 2;
    int y_t = B_HEIGHT / 2;
    x_t = x_t - SIDE_LEN / 2;
    y_t = y_t - SIDE_LEN / 2;
    AffineTransform affineTransform = new AffineTransform();
    affineTransform.translate(x_t, y_t);

    // get the transformed shape.
    Rectangle rect = new Rectangle(0, 0, SIDE_LEN, SIDE_LEN);
    Shape transformedShape = affineTransform.createTransformedShape(rect);

    // draw the transformed shape on the screen.
    g2d.setColor(Color.MAGENTA);
    g2d.fill(transformedShape);

    g2d.setColor(Color.MAGENTA);
    g2d.fillRect(0, 0, SIDE_LEN, SIDE_LEN);
  }
}
