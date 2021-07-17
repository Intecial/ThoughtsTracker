package GUIComponents;

import javax.swing.*;
import java.awt.*;

public class Prompt{
    JFrame frame = new JFrame();
    private boolean state;
    public Prompt(){
        state = true;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setBackground(Color.CYAN);

        JButton button = new JButton("Submit");
        button.setVerticalTextPosition(JButton.CENTER);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setFocusable(false);

        JTextField text = new JTextField();
        panel.setLayout(new FlowLayout(FlowLayout.LEADING));
        panel.add(text);
        panel.add(button);

    }
}
