package GUIComponents;

import MessagePackage.Message;
import MessagePackage.MessageManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SavePrompt implements ActionListener {
    private JFrame prompt = new JFrame();
    private JButton button;
    private JTextField text;
    private String filename;
    private MessageManager m;
    public SavePrompt(MessageManager m){
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
        button.addActionListener(this);

        text = new JTextField();
        text.setPreferredSize(new Dimension(200, 100));
        panel.setLayout(new FlowLayout(FlowLayout.LEADING));
        panel.add(text);
        panel.add(button);

        prompt.add(panel);

    }

    public String getFilename() {
        return filename;
    }

    public JTextField getTextField() {
        return text;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            m.saveData(text.getText());
            prompt.dispose();
        }
    }
}
