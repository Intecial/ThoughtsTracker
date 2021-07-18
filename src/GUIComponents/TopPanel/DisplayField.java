package GUIComponents.TopPanel;

import javax.swing.*;
import java.awt.*;

public class DisplayField extends JTextArea {

    public DisplayField(){

        this.setFont(new Font("Comic Sans", Font.PLAIN, 20));
        this.setEditable(false);
        this.setLayout(new BorderLayout());


    }

}
