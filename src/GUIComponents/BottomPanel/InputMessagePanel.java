package GUIComponents.BottomPanel;

import GUIComponents.TopPanel.TextMessagePanel;
import MessagePackage.Message;
import MessagePackage.MessageManager;
import MessagePackage.MoodLabel;
import System.Statistics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputMessagePanel extends JPanel implements ActionListener{
    private JTextField inputField;
    private JButton enter;
    private RadioPanel radioPanel;
    private MessageManager m;
    private TextMessagePanel tmp;
    public InputMessagePanel(MessageManager m, TextMessagePanel tmp){
        this.m = m;
        this.tmp = tmp;
        this.setBounds(20, 290, 840, 110);
        this.setVisible(true);
        this.setBackground(new Color(0xbdedff));
        this.setLayout(new FlowLayout(FlowLayout.LEADING));
        enter = new JButton();
        createButtonProperties();

        inputField = new JTextField();
        inputField.setPreferredSize(new Dimension(560, 100));
        inputField.setFont(new Font("Comic Sans", Font.PLAIN, 20));
        inputField.setText("     Write what you feel here...");

        radioPanel = new RadioPanel();

        this.add(inputField);
        this.add(radioPanel);
        this.add(enter);
        radioPanel.getTerrible().addActionListener(this);
        radioPanel.getNeutral().addActionListener(this);
        radioPanel.getGreat().addActionListener(this);
        radioPanel.getGood().addActionListener(this);
        radioPanel.getEcstatic().addActionListener(this);
        radioPanel.getDown().addActionListener(this);
        radioPanel.getBad().addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Message message = null;
        MoodLabel label = null;
            if( radioPanel.getTerrible().isSelected() ){
                label = MoodLabel.TERRIBLE;
            }
            else if(radioPanel.getBad().isSelected()){
                label = MoodLabel.BAD;
            }
            else if(radioPanel.getDown().isSelected()){
                label = MoodLabel.DOWN;
            }
            else if(radioPanel.getEcstatic().isSelected()){
                label = MoodLabel.ECSTATIC;
            }
            else if(radioPanel.getGood().isSelected()){
                label = MoodLabel.GOOD;
            }
            else if(radioPanel.getGreat().isSelected()){
                label = MoodLabel.GREAT;
            }
            else if(radioPanel.getNeutral().isSelected()){
                label = MoodLabel.NEUTRAL;
            }

        if(e.getSource() == enter) {
            String messageToDisplay = null;
            message = new Message(label, inputField.getText());

            if(m.getMessageArrayList().size() != 0) {
                messageToDisplay = "\n" + message.displayMessage();
            }else if(m.getMessageArrayList().size() == 0){
                messageToDisplay = message.displayMessage();
            }

            m.addMessage(message);
            tmp.appendToText(messageToDisplay);

        }

    }

    private void createButtonProperties(){
        enter.setPreferredSize(new Dimension(130, 100));
        enter.addActionListener(this);

        enter.setText("Enter");

        enter.setFocusable(false);
        enter.setHorizontalTextPosition(JButton.CENTER);
        enter.setVerticalTextPosition(JButton.CENTER);

        enter.setFont(new Font("Comic Sans", Font.PLAIN, 20));
        enter.setBackground(new Color(0x6fbdd1));
        enter.setBorder(BorderFactory.createRaisedBevelBorder());
    }
}
