package Task3;

import javax.swing.*;


public class Shell extends JFrame {
    JMenuBar menuBar;
    IDocument doc;
    ICreateDocument fac;
    JTextArea textArea;

    Shell(String type) {
        super("Редактор");

        if (type.equalsIgnoreCase("text")) {
            fac = new CreateTextDocument();
            textArea = new JTextArea(10, 50);
            add(textArea);
            textArea.setEditable(false);
        }

        menuBar = new JMenuBar();

        JMenu menu = new JMenu("File");

        JMenuItem create = new JMenuItem("New");
        JMenuItem open = new JMenuItem("Open");
        JMenuItem save = new JMenuItem("Save");
        JMenuItem exit = new JMenuItem("Exit");

        create.addActionListener(e -> {
            doc = fac.createNew();
            doc.getContent(textArea);
        });
        open.addActionListener(e -> {
            doc = fac.createOpen(this);
            doc.getContent(textArea);
        });
        save.addActionListener(e -> {
            doc.setContent(textArea);
            doc.save(this);
        });
        exit.addActionListener(e -> this.dispose());

        menu.add(create);
        menu.add(open);
        menu.add(save);
        menu.add(exit);

        menuBar.add(menu);

        setJMenuBar(menuBar);

        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
    }

}
