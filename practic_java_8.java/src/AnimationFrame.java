import javax.swing.*;
import java.awt.*;


public class AnimationFrame extends JFrame {
    private JLabel animationLabel;
    private ImageIcon[] frames;
    private int currentFrame = 0;

    public AnimationFrame() {
        setTitle("Простая анимация");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Загрузка кадров анимации
        frames = new ImageIcon[9];
        for (int i = 0; i < frames.length; i++) {
            frames[i] = new ImageIcon("/Users/mac/Desktop/Птичка" + (i + 1) + ".png");
        }

        animationLabel = new JLabel();
        add(animationLabel);

        // Запустите таймер, чтобы обновлять анимацию
        Timer timer = new Timer(100, e -> {
            animationLabel.setIcon(frames[currentFrame]);
            currentFrame = (currentFrame + 1) % frames.length;
        });
        timer.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AnimationFrame frame = new AnimationFrame();
            frame.setVisible(true);
        });
    }
}
