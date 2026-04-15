
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.Shape;
import java.awt.Rectangle;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class Board extends JPanel {
  private final int B_WIDTH = 350;
  private final int B_HEIGHT = 350;
  private BufferedImage img;

  public Board() {
    setBackground(Color.CYAN);
    // attempt to load the image.
    try {
      File imageFile = new File("media/cakes.jpg");
      img = ImageIO.read(imageFile);
      setPreferredSize(new Dimension(img.getWidth(), img.getHeight()));
    } catch (Exception e) {
      System.err.println(e.getMessage());
    }
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    Graphics2D g2d = (Graphics2D) g;
    if (img != null) {
      g2d.drawImage(img, null, null);
    }
    // set background color of the board and default size.
    setBackground(Color.CYAN);
    setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));

  }
}
