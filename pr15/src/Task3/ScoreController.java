package Task3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScoreController {

    public ScoreController(Score model, ScoreView view) {

        view.milan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.incMilan();
                view.update(model.getMilanScore(), model.getMadridScore(), "AC Milan");
            }
        });

        view.madrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.incMadrid();
                view.update(model.getMilanScore(), model.getMadridScore(), "Real Madrid");
            }
        });
    }
}
