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

    public void insertMessage(Message message){

        messageArrayList.add(message);

    }

    public void deleteMessage(Message message){

        if(messageArrayList.contains(message)){

            messageArrayList.remove(message);

        }
        else{

            System.out.println("no message found");

        }

    }



}
