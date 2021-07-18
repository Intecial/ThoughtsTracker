package GUIComponents.TopPanel;

import javax.swing.*;
import java.awt.*;


public class StatisticPanel extends JTextArea {
//    private System.Statistics stats;
    public StatisticPanel(){
        this.setPreferredSize(new Dimension(260, 240));
        this.setFont(new Font("Comic Sans", Font.PLAIN, 20));
        this.setEditable(false);
        this.setLayout(new FlowLayout());
    }
}
