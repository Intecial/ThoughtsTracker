package GUIComponents.BottomPanel;

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
        ecstatic.setBackground(new Color(0x35aedb));
        ecstatic.setFocusable(false);
        ecstatic.setForeground(new Color(0xDF00FE)); //neon purple

        great = new JRadioButton("Great");
        great.addActionListener(this);
        great.setBackground(new Color(0x35aedb));
        great.setFocusable(false);
        great.setForeground(new Color(0x3EFF15)); //green

        good = new JRadioButton("Good");
        good.addActionListener(this);
        good.setBackground(new Color(0x35aedb));
        good.setFocusable(false);
        good.setForeground(new Color(0x013224)); //darkgreen

        neutral = new JRadioButton("Neutral");
        neutral.addActionListener(this);
        neutral.setBackground(new Color(0x35aedb));
        neutral.setFocusable(false);
        neutral.setForeground(Color.GRAY);

        down = new JRadioButton("Down");
        down.addActionListener(this);
        down.setBackground(new Color(0x35aedb));
        down.setFocusable(false);
        down.setForeground(new Color(0x964B00)); //Brown

        bad = new JRadioButton("Bad");
        bad.addActionListener(this);
        bad.setBackground(new Color(0x35aedb));
        bad.setFocusable(false);
        bad.setForeground(new Color(0x800000)); //Red

        terrible = new JRadioButton("Terrible");
        terrible.addActionListener(this);
        terrible.setBackground(new Color(0x35aedb));
        terrible.setFocusable(false);
        terrible.setForeground(new Color(0xe20000)); //Neon Red

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
        this.setBackground(new Color(0x35aedb));
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
