import javax.swing.*;
import java.awt.*;
import java.io.File;
import javax.imageio.ImageIO;

class ImageDisplay extends JPanel {
    private Image image;

    public ImageDisplay(Image image) {
        this.image = image;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, null);
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java ImageDisplay <image-path>");
            System.exit(1);
        }

        String imagePath = args[0];
        try {
            Image image = ImageIO.read(new File("/Users/mac/Desktop/images.png"));
            JFrame frame = new JFrame("Image Display");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new ImageDisplay(image));
            frame.pack();
            frame.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
