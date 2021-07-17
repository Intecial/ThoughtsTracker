package GUIComponents;

import javax.swing.*;
import java.awt.*;

public class TextMessageBox extends JPanel {
    private JTextField displayField;
    public TextMessageBox(){
        // TextMessage box
        this.setBounds(20, 20, 560, 250);
        this.setPreferredSize(new Dimension(560, 250));
        this.setLayout(new FlowLayout(FlowLayout.LEADING));
        this.setVisible(true);
        this.setBackground(new Color(0xbdedff));

        displayField = new JTextField();
        displayField.setPreferredSize(new Dimension(560, 100));
        displayField.setFont(new Font("Comic Sans", Font.PLAIN, 20));
        displayField.setEditable(false);
    }
}
