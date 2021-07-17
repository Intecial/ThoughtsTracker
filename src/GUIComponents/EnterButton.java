package GUIComponents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EnterButton extends JButton implements ActionListener {
    public EnterButton(){
        this.setPreferredSize(new Dimension(130, 100));
        this.addActionListener(this);
        this.setText("Enter");
        this.setFocusable(false);
        this.setHorizontalTextPosition(JButton.CENTER);
        this.setVerticalTextPosition(JButton.CENTER);
        this.setFont(new Font("Comic Sans", Font.PLAIN, 20));
        this.setBackground(new Color(0x6fbdd1));
        this.setBorder(BorderFactory.createRaisedBevelBorder());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this){
        }
    }
}
