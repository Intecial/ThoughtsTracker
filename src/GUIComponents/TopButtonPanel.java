package GUIComponents;

import MessagePackage.MessageManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TopButtonPanel extends JPanel implements ActionListener {
    private JButton save;
    private JButton load;
    private JFrame newPrompt;
    private MessageManager m;
    public TopButtonPanel(MessageManager m){
        this.m = m;
        this.setBounds(0, 0, 150, 20);
        this.setBackground(new Color(0xbdedff));
        this.setVisible(true);

        save = new JButton("Save");
        save.setVerticalTextPosition(JButton.CENTER);
        save.setHorizontalTextPosition(JButton.CENTER);
        save.addActionListener(this);
        save.setFocusable(false);

        load = new JButton("Load");
        load.setHorizontalTextPosition(JButton.CENTER);
        load.setVerticalTextPosition(JButton.CENTER);
        load.addActionListener(this);
        load.setFocusable(false);

        this.add(save);
        this.add(load);
        this.setLayout(new GridLayout(1, 2, 10, 0));

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == save){
            System.out.println("Saved");
            Prompt savePrompt = new SavePrompt(m);
        }else if(e.getSource() == load){
            System.out.println("Loaded");
            Prompt loadPrompt = new LoadPrompt(m);
        }
    }
}
