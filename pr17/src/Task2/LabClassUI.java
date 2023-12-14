package Task2;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LabClassUI extends JFrame{
    private final LabClass model;
    private final JTable studTable;
    private final JPanel pN;

    public LabClassUI(Student[] baseStudents) {
        super("Студенты");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(640, 480);
        setLocationRelativeTo(null);

        model = new LabClass(baseStudents);

        pN = new JPanel(new FlowLayout());
        JButton ascSortBtn = new JButton("Сортировать по возрастанию");
        JButton descSortBtn = new JButton("Сортировать по убыванию");
        JButton findStudentBtn = new JButton("Найти студента");

        pN.add(ascSortBtn);
        pN.add(descSortBtn);
        pN.add(findStudentBtn);

        ascSortBtn.addActionListener(e -> sortBtnClicked(true));
        descSortBtn.addActionListener(e -> sortBtnClicked(false));
        findStudentBtn.addActionListener(e -> findBtnClicked());

        Object[] headers = new String[] {"Имя", "Средний балл"};
        Object [][] startStudents = new String[baseStudents.length][2];
        for(int i = 0; i < baseStudents.length; i++){
            startStudents[i][0] = baseStudents[i].name();
            startStudents[i][1] = ((Integer)(baseStudents[i].score())).toString();
        }
        studTable = new JTable( new DefaultTableModel(startStudents, headers)){
            @Override
            public boolean isCellEditable(int x, int y){
                return false;
            }
        };

        JTableHeader header = studTable.getTableHeader();
        header.setReorderingAllowed(false);
        header.setResizingAllowed(false);

        getContentPane().add(new JScrollPane(studTable), BorderLayout.CENTER);

        getContentPane().add(pN, BorderLayout.NORTH);

        setVisible(true);
    }

    public void sortBtnClicked(boolean asc) {
        model.sort(asc);

        DefaultTableModel dtm = (DefaultTableModel) studTable.getModel();

        for (int i = 0; i < model.students().length; i++) {
            dtm.removeRow(i);
            Student st = model.students()[i];
            dtm.insertRow(i, new Object[]{st.name(), st.score()});
        }
    }

    public void findBtnClicked(){
        JDialog die = new JDialog(this, "Поиск студента");
        die.setSize(200, 130);
        die.setLocation(700, 300);

        JLabel l = new JLabel("Введите имя студента");
        JButton okBt = new JButton("ОК");
        JButton cancelBt = new JButton("Cancel");
        JTextField inp = new JTextField(15);
        JPanel pN = new JPanel(new FlowLayout());

        okBt.addActionListener(e -> {
            String name = inp.getText();
            try {
                String message = model.findStudent(name);
                JOptionPane.showMessageDialog(pN, message);
            }
            catch (EmptyStringException | StudentNotFoundException e1) {
                JOptionPane.showMessageDialog(pN, e1.getMessage());
            }
        });

        cancelBt.addActionListener(e -> die.dispose());

        pN.add(l);
        pN.add(inp);
        pN.add(okBt);
        pN.add(cancelBt);
        die.add(pN);

        die.setResizable(false);
        die.setModal(true);
        die.setVisible(true);
        die.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
}
