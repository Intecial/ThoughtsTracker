package GUIComponents.TopPanel;

import javax.swing.*;
import java.awt.*;

public class DisplayField extends JTextArea {
    private JScrollPane scroll;
    public DisplayField(){
        this.setPreferredSize(new Dimension(560, 240));
        this.setFont(new Font("Comic Sans", Font.PLAIN, 20));
        this.setEditable(false);
        this.setLayout(new BorderLayout());



//        this.add(scroll);


    }

    public JScrollPane getScroll() {
        return scroll;
    }
}
