package Task3;

import javax.swing.*;

public class ScoreView extends JFrame {
    JButton milan = new JButton("AC Milan");
    JButton madrid = new JButton("Real Madrid");
    JLabel res = new JLabel("Result 0 x 0");
    JLabel last = new JLabel("Last scorer: N/A");
    JLabel winner = new JLabel("Winner: Draw");

    public ScoreView() {
        super("Score");
        setSize(300, 200);
        setLocation(500, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(null);
        milan.setBounds(135, 10, 150, 60);
        madrid.setBounds(135, 95, 150, 60);
        res.setBounds(5, 40, 150, 20);
        last.setBounds(5, 70, 150, 20);
        winner.setBounds(5, 100, 150, 20);

        add(milan);
        add(madrid);
        add(res);
        add(last);
        add(winner);
    }

    public void update(int milanScore, int madridScore, String lastScorer) {
        last.setText("Last scorer: " + lastScorer);
        res.setText("Result " + milanScore + " x " + madridScore);
        if (milanScore > madridScore) {
            winner.setText("Winner: AC Milan");
        }
        else if (milanScore < madridScore) {
            winner.setText("Winner: Real Madrid");
        }
        else {
            winner.setText("Winner: Draw");
        }
    }
}
