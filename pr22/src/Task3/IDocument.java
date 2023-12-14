package Task3;

import javax.swing.*;

public interface IDocument {
    void setContent(JTextArea area);
    void getContent(JTextArea area);
    void save(JFrame frame);
}
