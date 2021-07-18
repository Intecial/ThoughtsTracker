import GUIComponents.AppFrame;
import MessagePackage.*;

public class Application {
    public static void main(String[] args) {
        MessageManager m = new MessageManager();
        AppFrame frame = new AppFrame(m);
    }
}
