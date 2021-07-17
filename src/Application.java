import GUIComponents.AppFrame;

import java.io.File;
import MessagePackage.Message;
import MessagePackage.*;
import Enum.MoodLabel;

import javax.swing.*;

public class Application {
    public static void main(String[] args) {
//        MessageManager m = new MessageManager(".\\saves\\testCsv.csv");
        MessageManager m = new MessageManager("."+ File.separator + "saves" + File.separator + "testCsv.csv");
        AppFrame frame = new AppFrame(m);
        m.addMessage(new Message(MoodLabel.GOOD, "I'm feeling good"));
        m.addMessage(new Message(MoodLabel.GREAT, "I'm feeling great!"));
        m.saveData();
    }
}
