package GUIComponents;

import MessagePackage.MessageManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TopButtonPanel extends JPanel implements ActionListener {
    private JButton save;
    private JButton load;
    private MessageManager m;
    public TopButtonPanel(MessageManager m){
        this.m = m;
        this.setBounds(0, 0, 150, 20);
        this.setBackground(new Color(0xbdedff));
        this.setVisible(true);

        save = new JButton("Save");
        save.setVerticalTextPosition(JButton.CENTER);
        save.setHorizontalTextPosition(JButton.CENTER);

        load = new JButton("Load");
        load.setHorizontalTextPosition(JButton.CENTER);
        load.setVerticalTextPosition(JButton.CENTER);

        this.add(save);
        this.add(load);
        this.setLayout(new GridLayout(1, 2, 10, 0));

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == save){
            m.saveData();
        }else if(e.getSource() == load){
//            m.loadData();
        }
    }
}
