package GUIComponents.CornerPanel;

import MessagePackage.MessageManager;

import javax.swing.*;
import java.awt.*;

public class Prompt {
    protected JFrame prompt = new JFrame();
    protected JButton button;
    protected JTextField text;
    protected MessageManager m;

    public Prompt(MessageManager m){
        this.m = m;
        prompt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        prompt.setVisible(true);
        prompt.setSize(480, 80);
        prompt.setLayout(null);
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 500, 100);
        panel.setBackground(new Color(0x35aedb));

        button = new JButton("Submit");
        button.setPreferredSize(new Dimension(60,30));
        button.setVerticalTextPosition(JButton.CENTER);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setFocusable(false);
        button.setBackground(new Color(0x210fba));
        button.setForeground(Color.WHITE);
        button.setBorder(BorderFactory.createRaisedBevelBorder());

        text = new JTextField();
        text.setPreferredSize(new Dimension(390, 30));
        panel.setLayout(new FlowLayout(FlowLayout.LEADING));
        panel.add(text);
        panel.add(button);

        prompt.add(panel);
    }
}
