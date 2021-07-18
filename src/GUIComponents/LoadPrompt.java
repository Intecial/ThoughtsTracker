package GUIComponents;

import MessagePackage.MessageManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoadPrompt extends Prompt implements ActionListener {

    public LoadPrompt(MessageManager m){
       super(m);
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            m.loadData(text.getText());
            prompt.dispose();
        }
    }
}
