import GUIComponents.AppFrame;
import MessagePackage.*;
import System.*;

public class Application {
    public static void main(String[] args) {
        MessageManager m = new MessageManager();
        AppFrame frame = new AppFrame(m);
        Statistics stats = new Statistics(m);
    }
}
