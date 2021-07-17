import java.util.ArrayList;

public class MessageManager {

    private ArrayList<Message> messageArrayList;

    public MessageManager() {
        //TODO: load csv into messageArrayList
    }

    public Message getMessage(int index){
        Message result;

        if (messageArrayList != null) {
            result = messageArrayList.get(index);
        } else {
            result = null;
        }

        return result;
    }



}
