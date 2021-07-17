package GUIComponents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioPanel extends JPanel implements ActionListener {
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
        ecstatic.addActionListener(this);

        great = new JRadioButton("Great");
        great.addActionListener(this);

        good = new JRadioButton("Good");
        good.addActionListener(this);

        neutral = new JRadioButton("Neutral");
        neutral.addActionListener(this);

        down = new JRadioButton("Down");
        down.addActionListener(this);

        bad = new JRadioButton("Bad");
        bad.addActionListener(this);

        terrible = new JRadioButton("Terrible");
        terrible.addActionListener(this);

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

    public JRadioButton getTerrible() {
        return terrible;
    }

    public JRadioButton getNeutral() {
        return neutral;
    }

    public JRadioButton getGreat() {
        return great;
    }

    public JRadioButton getGood() {
        return good;
    }

    public JRadioButton getEcstatic() {
        return ecstatic;
    }

    public JRadioButton getDown() {
        return down;
    }

    public JRadioButton getBad() {
        return bad;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        if(e.getSource() == terrible){
//            System.out.println("Terrible");
//        }

    }
}
