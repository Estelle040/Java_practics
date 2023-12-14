import javax.swing.*;
import java.awt.*;
import java.util.Random;

class RandomShape extends JPanel {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    private static final int NUM_SHAPES = 20;

    private Random random = new Random();

    public RandomShape() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i = 0; i < NUM_SHAPES; i++) {
            int x = random.nextInt(WIDTH);
            int y = random.nextInt(HEIGHT);

            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            g.setColor(color);

            int shapeType = random.nextInt(3); // 0: Rectangle, 1: Circle, 2: Triangle

            switch (shapeType) {
                case 0:
                    int width = random.nextInt(100);
                    int height = random.nextInt(100);
                    g.fillRect(x, y, width, height);
                    break;
                case 1:
                    int diameter = random.nextInt(100);
                    g.fillOval(x, y, diameter, diameter);
                    break;
                case 2:
                    int[] xPoints = {x, x + 50, x + 100};
                    int[] yPoints = {y + 100, y, y + 100};
                    g.fillPolygon(xPoints, yPoints, 3);
                    break;
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new RandomShape());
        frame.pack();
        frame.setVisible(true);
    }
}
