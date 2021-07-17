package GUIComponents;

import MessagePackage.MessageManager;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppFrame extends JFrame {
    private TextMessagePanel textMessages;
    private InputMessagePanel inputMessages;
    private StatisticPanel statisticBox;
    private TopButtonPanel saveAndLoad;
    private boolean state;

    public AppFrame(MessageManager m) {
        state = true;
        textMessages = new TextMessagePanel();
        inputMessages = new InputMessagePanel(m);
        statisticBox = new StatisticPanel();
        saveAndLoad = new TopButtonPanel(m);
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


    public boolean stillRunning() {
        return this.state == true;
    }

    public void exit() {
        state = false;
        this.dispose();
    }
}

