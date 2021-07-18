package GUIComponents.CornerPanel;

import GUIComponents.CornerPanel.LoadPrompt;
import GUIComponents.CornerPanel.Prompt;
import GUIComponents.CornerPanel.SavePrompt;
import GUIComponents.TopPanel.TextMessagePanel;
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
    private TextMessagePanel tmp;
    public TopButtonPanel(MessageManager m, TextMessagePanel tmp){
        this.m = m;
        this.tmp = tmp;
        this.setBounds(0, 0, 150, 20);
        this.setBackground(new Color(0x35aedb));
        this.setVisible(true);

        save = new JButton("Save");
        save.setVerticalTextPosition(JButton.CENTER);
        save.setHorizontalTextPosition(JButton.CENTER);
        save.addActionListener(this);
        save.setFocusable(false);
        save.setBorder(BorderFactory.createRaisedBevelBorder());
        save.setBackground(new Color(0x210fba));
        save.setForeground(Color.WHITE);

        load = new JButton("Load");
        load.setHorizontalTextPosition(JButton.CENTER);
        load.setVerticalTextPosition(JButton.CENTER);
        load.addActionListener(this);
        load.setFocusable(false);
        load.setBorder(BorderFactory.createRaisedBevelBorder());
        load.setBackground(new Color(0x210fba));
        load.setForeground(Color.WHITE);

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
            Prompt loadPrompt = new LoadPrompt(m, tmp);
        }
    }
}
