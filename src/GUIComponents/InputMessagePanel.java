package GUIComponents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputMessagePanel extends JPanel implements ActionListener{
    private JTextField inputField;
    private JButton enter;
    private RadioPanel radioPanel;
    private String message;
    public InputMessagePanel(){
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

    public String getMessage(){
        return message;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == enter){
            message = inputField.getText();
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
