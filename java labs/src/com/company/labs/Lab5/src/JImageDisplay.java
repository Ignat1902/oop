import javax.swing.JComponent;
import java.awt.*;
import java.awt.image.BufferedImage;

public class JImageDisplay extends JComponent {
    private final BufferedImage image;

    public BufferedImage getImage() {
        return image;
    }

    public JImageDisplay(int w, int h){
        if (w <= 0)
            throw new IllegalArgumentException("w must be > 0; got " + w);

        if (h <= 0)
            throw new IllegalArgumentException("h must be > 0; got " + h);

        image = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
        Dimension dimension = new Dimension(w, h);

        super.setPreferredSize(dimension);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage (image, 0, 0, image.getWidth(), image.getHeight(), null);
    }

    public void clearImage() {
        Graphics2D imageGraphics = image.createGraphics();
        imageGraphics.setColor(new Color(0, 0, 0));

        imageGraphics.fillRect(0, 0, image.getWidth(), image.getHeight());
    }

    public void drawPixel (int x, int y, int rgbColor){
        image.setRGB(x, y, rgbColor);
    }
}
