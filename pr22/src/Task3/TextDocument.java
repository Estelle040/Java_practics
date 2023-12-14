package Task3;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TextDocument implements IDocument{
    String text;

    TextDocument() {
        text = "";
    }

    TextDocument(String text) {
        this.text = text;
    }

    @Override
    public void getContent(JTextArea area) {
        area.setText(text);
        area.setEditable(true);
    }

    @Override
    public void setContent(JTextArea area) {
        text = area.getText();
    }

    @Override
    public void save(JFrame frame) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        if (fileChooser.showSaveDialog(frame) == JFileChooser.APPROVE_OPTION )
        {
            File f = fileChooser.getSelectedFile();
            try {
                FileWriter writer = new FileWriter(f);
                String str = text;
                writer.write(str);
                writer.close();

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

            JOptionPane.showMessageDialog(frame,
                    "File " + fileChooser.getSelectedFile() + " was saved");
        }
    }
}
