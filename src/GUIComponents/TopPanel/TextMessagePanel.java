package GUIComponents.TopPanel;

import MessagePackage.Message;
import MessagePackage.MessageManager;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class TextMessagePanel extends JPanel {
    private JTextArea displayField;
    private JTextArea statisticsBox;
    private MessageManager m;
    public TextMessagePanel(MessageManager m){
        // TextMessage box
        this.m = m;
        this.setBounds(20, 20, 840, 250);
        this.setLayout(new FlowLayout(FlowLayout.LEADING));
        this.setVisible(true);
        this.setBackground(new Color(0xbdedff));

        displayField = new DisplayField();
        statisticsBox = new StatisticPanel();

        this.add(displayField);
        this.add(statisticsBox);
    }

    public void clearField(){
        displayField.selectAll();
        displayField.replaceSelection("");
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
    }

    public void appendToText(String message){
        displayField.append(message);
    }
}
