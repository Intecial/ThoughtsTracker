package GUIComponents;

import javax.swing.*;

public class AppFrame extends JFrame{
    private JPanel textMessages;
    private JPanel inputMessages;
    private JPanel statisticBox;
    private TopButtonPanel saveAndLoad;
    private boolean state;

    public AppFrame(){
        state = true;
        textMessages = new TextMessagePanel();
        inputMessages = new InputMessagePanel();
        statisticBox = new StatisticPanel();
        saveAndLoad = new TopButtonPanel();
        this.setTitle("Thoughts Tracker");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(true);
        this.setSize(920, 450);
        this.setVisible(true);

        this.add(saveAndLoad);
        this.add(textMessages);
        this.add(inputMessages);
        this.add(statisticBox);

    }


    public boolean stillRunning(){
        return this.state == true;
    }

    public void exit(){
        state = false;
        this.dispose();
    }
}
