package GUIComponents;

import GUIComponents.BottomPanel.InputMessagePanel;
import GUIComponents.CornerPanel.TopButtonPanel;
import GUIComponents.TopPanel.TextMessagePanel;
import MessagePackage.MessageManager;

import javax.swing.*;
import java.awt.*;

public class AppFrame extends JFrame {
    private TextMessagePanel textMessages;
    private InputMessagePanel inputMessages;
    private TopButtonPanel saveAndLoad;
    private boolean state;

    public AppFrame(MessageManager m) {
        textMessages = new TextMessagePanel(m);
        inputMessages = new InputMessagePanel(m, textMessages);
        saveAndLoad = new TopButtonPanel(m, textMessages);
        this.setTitle("Thoughts Tracker");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(true);
        this.setSize(920, 450);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(0x35aedb));

        this.add(saveAndLoad);
        this.add(textMessages);
        this.add(inputMessages);

    }


    public boolean stillRunning() {
        return this.state == true;
    }

    public void exit() {
        state = false;
        this.dispose();
    }
}

