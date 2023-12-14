package Task3;

import javax.swing.*;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CreateTextDocument implements ICreateDocument{
    @Override
    public IDocument createNew() {
        return new TextDocument();
    }

    @Override
    public IDocument createOpen(JFrame fr) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        String str = "";
        if (fileChooser.showOpenDialog(fr) == JFileChooser.APPROVE_OPTION ) {
            File f = fileChooser.getSelectedFile();
            try {
                FileReader reader = new FileReader(f);
                int c = 1;
                while(true)
                {
                    c = reader.read();
                    if (c == -1) {
                        break;
                    }
                    str += (char)c;
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        return new TextDocument(str);
    }
}
