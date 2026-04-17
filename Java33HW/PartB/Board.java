
//NOTE: Since the image I chose was so small, I elected to make the content area larger rather than transforming the image.
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
  private BufferedImage img;
  // private final int B_WIDTH;
  // private final int B_HEIGHT;

  public Board() {
    setBackground(Color.CYAN);
    // attempt to load the image.
    try {
      File imageFile = new File("media/shrimpfriedrice.png");
      img = ImageIO.read(imageFile);
      final int B_WIDTH = img.getWidth();
      final int B_HEIGHT = img.getHeight();
      setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
    } catch (Exception e) {
      System.err.println(e.getMessage());
    }
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    AffineTransform affineTransform = new AffineTransform();
    affineTransform.translate(img.getWidth() - (img.getWidth() / 4), img.getHeight() - (img.getHeight() / 4));
    affineTransform.scale(0.25, 0.25);

    Graphics2D g2d = (Graphics2D) g;
    if (img != null) {
      g2d.drawImage(img, affineTransform, null);
    }
    // set background color of the board and default size.
    setBackground(Color.CYAN);
    // setPreferredSize(new Dimension(img.getWidth() * 4, img.getHeight() * 4));
    // setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));

  }
}
