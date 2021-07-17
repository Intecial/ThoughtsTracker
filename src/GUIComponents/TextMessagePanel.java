package GUIComponents;

import javax.swing.*;
import java.awt.*;

public class TextMessagePanel extends JPanel {
    private JTextField displayField;
    public TextMessagePanel(){
        // TextMessage box
        this.setBounds(20, 20, 570, 250);
        this.setPreferredSize(new Dimension(560, 250));
        this.setLayout(new FlowLayout(FlowLayout.LEADING));
        this.setVisible(true);
        this.setBackground(new Color(0xbdedff));

        displayField = new JTextField();
        displayField.setPreferredSize(new Dimension(560, 240));
        displayField.setFont(new Font("Comic Sans", Font.PLAIN, 20));
        displayField.setEditable(false);
        this.add(displayField);
    }
}
