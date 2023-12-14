import javax.swing.*;
import java.awt.*;

public class CalcView extends JFrame {
    private static final String[][] BUTTON_TEXTS = {
            {"π", "e", ".", "C"},
            {"1", "2", "3", "+"},
            {"4", "5", "6", "-"},
            {"7", "8", "9", "*"},
            {"0", " ", "/", "="}
    };

    private static final Font BTN_FONT = new Font(Font.SANS_SERIF, Font.BOLD, 24);

    private final JButton[][] buttons = new JButton[5][4];

    private final JTextField field = new JTextField(14);

    CalcView() {
        super("Калькулятор");

        field.setFont(BTN_FONT.deriveFont(Font.PLAIN));
        field.setEditable(false);
        JPanel btnPanel = new JPanel(new GridLayout(BUTTON_TEXTS.length, BUTTON_TEXTS[0].length));

        for (int i = 0; i < BUTTON_TEXTS.length; i++) {
            for (int j = 0; j < BUTTON_TEXTS[i].length; j++) {
                JButton btn = new JButton(BUTTON_TEXTS[i][j]);
                btn.setFont(BTN_FONT);
                btnPanel.add(btn);
                buttons[i][j] = btn;
            }
        }

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(field, BorderLayout.PAGE_START);
        mainPanel.add(btnPanel, BorderLayout.CENTER);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(mainPanel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public JButton[][] getButtons() {
        return buttons;
    }

    public void update(String newText, boolean append) {
        if (append) {
            String temp = field.getText();
            field.setText(temp + newText);
        }
        else
        {
            field.setText(newText);
        }
    }

    public String getText() {
        return field.getText();
    }
}
