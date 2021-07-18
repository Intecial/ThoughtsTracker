package GUIComponents.TopPanel;

import MessagePackage.Message;
import MessagePackage.MessageManager;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import System.*;

public class TextMessagePanel extends JPanel {
    private DisplayField displayField;
    private StatisticPanel statisticsBox;
    private MessageManager m;
    private JScrollPane scroll;

    public TextMessagePanel(MessageManager m){
        // TextMessage box
        this.m = m;
        this.setBounds(20, 20, 840, 250);
        this.setLayout(new FlowLayout(FlowLayout.LEADING));
        this.setVisible(true);
        this.setBackground(new Color(0xbdedff));

        displayField = new DisplayField();

        scroll = new JScrollPane(displayField);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setPreferredSize(new Dimension(560, 240));

        statisticsBox = new StatisticPanel(m);


        this.add(scroll);

        this.add(statisticsBox);
    }

    public void clearField(){
        displayField.selectAll();
        displayField.replaceSelection("");
        statisticsBox.clear();
    }


    public void loadField(){
        for(int i = 0; i < m.getMessageArrayList().size(); i++) {

            ArrayList<Message> arList = m.getMessageArrayList();
            if(i != 0) {
                displayField.append("\n" + arList.get(i).displayMessage());
            }else{
                displayField.append(arList.get(i).displayMessage());
            }
        }
        statisticsBox.clear();
        statisticsBox.main();

    }

    public void appendToText(String message){


        displayField.append(message);
        statisticsBox.clear();
        statisticsBox.main();
    }
}
