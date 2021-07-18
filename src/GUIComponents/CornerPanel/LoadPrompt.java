package GUIComponents.CornerPanel;

import GUIComponents.TopPanel.TextMessagePanel;
import MessagePackage.MessageManager;
import System.Statistics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoadPrompt extends Prompt implements ActionListener {

    private TextMessagePanel tmp;
    public LoadPrompt(MessageManager m, TextMessagePanel tmp){
       super(m);
        button.addActionListener(this);
        this.tmp = tmp;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            m.loadData(text.getText());
            m.loadSentence(m.getMessageArrayList());
            tmp.clearField();
            tmp.loadField();
            prompt.dispose();
        }
    }
}
