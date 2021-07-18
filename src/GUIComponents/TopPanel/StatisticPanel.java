package GUIComponents.TopPanel;

import javax.swing.*;
import java.awt.*;

import MessagePackage.MessageManager;
import System.*;


public class StatisticPanel extends JTextArea {
    private Statistics stats;
    private MessageManager m;
    public StatisticPanel(){

        this.setPreferredSize(new Dimension(260, 240));
        this.setFont(new Font("Comic Sans", Font.PLAIN, 20));
        this.setEditable(false);
        this.setLayout(new FlowLayout());
    }

    public StatisticPanel(MessageManager m){
        this();
        this.m = m;
        stats = new Statistics(m);
        main();
    }

    public void clear(){
        this.selectAll();
        this.replaceSelection("");
    }
    public void main(){
        this.append("Statistics\n");

        this.append(stats.generateMessageCount() + "\n");
        this.append(stats.getCount() + "");
        if (stats.getCount() > 4){
            this.append(stats.generateTopFive());
        }
    }


}
