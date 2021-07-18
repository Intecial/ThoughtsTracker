import MessagePackage.Message;
import MessagePackage.MessageManager;

import java.util.ArrayList;

public class Statistics {

    private MessageManager messageManager;
    private Dictionary wordDictionary = new Dictionary();
    private ArrayList<Message> mostUsed = new ArrayList<>();

    public Statistics(MessageManager messageManager){
        this.messageManager = messageManager;
    }

    public void topFive(String fileName){



    }

    public void loadWordToDict(){
        ArrayList<Message> arr = messageManager.getMessageArrayList();
        for (Message msg: arr) {
            String msgContent = msg.getContent();
            String[] splitContent = msgContent.split(" ");

            for (String word: splitContent) {
                try {
                    wordDictionary.insert(word, 1);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }

    public String displayStats() {
        return "";
    }

}
