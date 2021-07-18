package GUIComponents;

import MessagePackage.Message;
import MessagePackage.MessageManager;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class TextMessagePanel extends JPanel {
    private JTextArea displayField;
    private MessageManager m;
    public TextMessagePanel(MessageManager m){
        // TextMessage box
        this.m = m;
        this.setBounds(20, 20, 570, 250);
        this.setPreferredSize(new Dimension(560, 250));
        this.setLayout(new FlowLayout(FlowLayout.LEADING));
        this.setVisible(true);
        this.setBackground(new Color(0xbdedff));

        displayField = new JTextArea();
        displayField.setPreferredSize(new Dimension(560, 240));
        displayField.setFont(new Font("Comic Sans", Font.PLAIN, 20));
        displayField.setEditable(false);
        displayField.setLayout(new FlowLayout());
        this.add(displayField);
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
