package GUIComponents;

import GUIComponents.*;

import javax.swing.*;
import java.awt.*;

public class AppFrame extends JFrame {
    private JButton button;
    private JPanel textMessages;
    private JPanel inputMessages;
    private JPanel buttonPanels;
    private JPanel statisticBox;

    public AppFrame(){
//        button = new EnterButton();
        textMessages = new TextMessageBox();
        inputMessages = new InputMessageBox();
        buttonPanels = new ButtonBox();
        statisticBox = new StatisticsBox();

        this.setTitle("Thoughts Tracker");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(true);
        this.setSize(820, 450);
        this.setVisible(true);


//        this.add(button);
        this.add(textMessages);
        this.add(inputMessages);
        this.add(buttonPanels);
        this.add(statisticBox);

    }
}
