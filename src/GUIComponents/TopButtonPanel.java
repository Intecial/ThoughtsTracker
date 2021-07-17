package GUIComponents;

import javax.swing.*;
import java.awt.*;

public class TopButtonPanel extends JPanel {
    private JButton save;
    private JButton load;
    public TopButtonPanel(){
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

}
