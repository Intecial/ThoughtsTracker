package GUIComponents;

import MessagePackage.Message;
import MessagePackage.MessageManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SavePrompt extends Prompt implements ActionListener {

    public SavePrompt(MessageManager m){
        super(m);
        button.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            m.saveData(text.getText());
            prompt.dispose();
        }
    }
}
