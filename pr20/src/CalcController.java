import javax.swing.*;

public class CalcController {
    private final Calc model;
    private final  CalcView view;

    CalcController() {
        model = new Calc();
        view = new CalcView();

        addBtnAction(view.getButtons()[0][0], " π ");
        addBtnAction(view.getButtons()[0][1], " e ");
        addBtnAction(view.getButtons()[0][2], ".");
        addBtnAction(view.getButtons()[1][0], "1");
        addBtnAction(view.getButtons()[1][1], "2");
        addBtnAction(view.getButtons()[1][2], "3");
        addBtnAction(view.getButtons()[2][0], "4");
        addBtnAction(view.getButtons()[2][1], "5");
        addBtnAction(view.getButtons()[2][2], "6");
        addBtnAction(view.getButtons()[3][0], "7");
        addBtnAction(view.getButtons()[3][1], "8");
        addBtnAction(view.getButtons()[3][2], "9");
        addBtnAction(view.getButtons()[4][0], "0");
        addBtnAction(view.getButtons()[4][1], " ");
        addBtnAction(view.getButtons()[4][2], " / ");
        addBtnAction(view.getButtons()[1][3], " + ");
        addBtnAction(view.getButtons()[2][3], " - ");
        addBtnAction(view.getButtons()[3][3], " * ");
        view.getButtons()[0][3].addActionListener(e -> clearCalc());
        view.getButtons()[4][3].addActionListener(e -> makeCalc(view.getText()));
    }

    private void addBtnAction(JButton btn, String text) {
        btn.addActionListener(e -> view.update(text, true));
    }

    public void makeCalc(String exp)  {
        try {
            view.update(model.calculate(exp), false);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(view, e.getMessage());
            clearCalc();
        }
    }

    public void clearCalc() {
        view.update("", false);
        model.clearStack();
    }
}
