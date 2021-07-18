import GUIComponents.AppFrame;
import MessagePackage.*;

import javax.swing.*;

public class Application {
    public static void main(String[] args) {
        MessageManager m = new MessageManager();
        AppFrame frame = new AppFrame(m);
        ImageIcon icon = new ImageIcon("icon.png");
        frame.setIconImage(icon.getImage());
    }
}
