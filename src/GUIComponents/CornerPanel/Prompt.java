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
        prompt.setSize(500, 500);
        prompt.setLayout(null);
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 420, 420);
        panel.setBackground(Color.CYAN);

        button = new JButton("Submit");
        button.setVerticalTextPosition(JButton.CENTER);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setFocusable(false);

        text = new JTextField();
        text.setPreferredSize(new Dimension(200, 100));
        panel.setLayout(new FlowLayout(FlowLayout.LEADING));
        panel.add(text);
        panel.add(button);

        prompt.add(panel);
    }
}
