package GUIComponents.TopPanel;

import javax.swing.*;
import java.awt.*;

public class DisplayField extends JTextArea {
    public DisplayField(){
        this.setPreferredSize(new Dimension(560, 240));
        this.setFont(new Font("Comic Sans", Font.PLAIN, 20));
        this.setEditable(false);
        this.setLayout(new FlowLayout());
    }

}
