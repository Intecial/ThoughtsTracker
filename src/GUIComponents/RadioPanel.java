package GUIComponents;

import javax.swing.*;
import java.awt.*;

public class RadioPanel extends JPanel {
    private JRadioButton ecstatic;
    private JRadioButton great;
    private JRadioButton good;
    private JRadioButton neutral;
    private JRadioButton down;
    private JRadioButton bad;
    private JRadioButton terrible;
    public RadioPanel(){
        this.setPreferredSize(new Dimension(130, 100));
        ecstatic = new JRadioButton("Ecstatic");
        great = new JRadioButton("Great");
        good = new JRadioButton("Good");
        neutral = new JRadioButton("Neutral");
        down = new JRadioButton("Down");
        bad = new JRadioButton("Bad");
        terrible = new JRadioButton("Terrible");

        ButtonGroup group = new ButtonGroup();
        group.add(ecstatic);
        group.add(great);
        group.add(good);
        group.add(neutral);
        group.add(down);
        group.add(bad);
        group.add(terrible);

        this.add(ecstatic);
        this.add(great);
        this.add(good);
        this.add(neutral);
        this.add(down);
        this.add(bad);
        this.add(terrible);
        this.setLayout(new GridLayout(7,1));
        this.setVisible(true);
        this.setBackground(Color.red);
    }

    public JRadioButton getBad() {
        return bad;
    }

    public JRadioButton getDown() {
        return down;
    }

    public JRadioButton getEcstatic() {
        return ecstatic;
    }

    public JRadioButton getGood() {
        return good;
    }

    public JRadioButton getGreat() {
        return great;
    }

    public JRadioButton getNeutral() {
        return neutral;
    }

    public JRadioButton getTerrible() {
        return terrible;
    }
}
