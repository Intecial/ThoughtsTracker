package GUIComponents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import MessagePackage.*;
import Enum.*;

public class InputMessagePanel extends JPanel implements ActionListener{
    private JTextField inputField;
    private JButton enter;
    private RadioPanel radioPanel;
    private MessageManager mm;

    public InputMessagePanel(MessageManager mm){
        this.mm = mm;
        this.setBounds(20, 290, 870, 110);
        this.setVisible(true);
        this.setBackground(new Color(0xbdedff));
        this.setLayout(new FlowLayout());
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
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Message message = null;
        if (e.getSource() == radioPanel.getBad() && e.getSource() == enter){
           message = new Message(MoodLabel.BAD, inputField.getText());
        }else if(e.getSource() == radioPanel.getDown()&& e.getSource() == enter){
            message = new Message(MoodLabel.DOWN, inputField.getText());
        }else if(e.getSource() == radioPanel.getEcstatic()&& e.getSource() == enter){
            message = new Message(MoodLabel.ECSTATIC, inputField.getText());
        }else if(e.getSource() == radioPanel.getGood() && e.getSource() == enter){
             message = new Message(MoodLabel.GOOD, inputField.getText());
        }else if(e.getSource() == radioPanel.getGreat() && e.getSource() == enter){
             message = new Message(MoodLabel.GREAT, inputField.getText());
        }else if(e.getSource() == radioPanel.getNeutral() && e.getSource() == enter){
             message = new Message(MoodLabel.NEUTRAL, inputField.getText());
        }else if(e.getSource() == radioPanel.getTerrible() && e.getSource() == enter){
             message = new Message(MoodLabel.TERRIBLE, inputField.getText());
        }
        mm.addMessage(message);
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
