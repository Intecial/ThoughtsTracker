import GUIComponents.AppFrame;
import MessagePackage.*;
import System.*;

import javax.swing.*;

public class Application {
    public static void main(String[] args) {
        MessageManager m = new MessageManager();
        AppFrame frame = new AppFrame(m);
        Statistics stats = new Statistics(m);
        ImageIcon icon = new ImageIcon("ThoughtsTracker_icon.png");
        frame.setIconImage(icon.getImage());
    }
}
