package MessagePackage;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;


import MessagePackage.Message;

import java.util.ArrayList;

public class MessageManager {

    private ArrayList<Message> messageArrayList = new ArrayList<>();
    private String filepath;

    public MessageManager(String filepath) {
        //TODO: load csv into messageArrayList
        this.filepath = filepath;
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

    public void addMessage(Message message){

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

    public void saveData() {

        try {
            PrintWriter writer = new PrintWriter(new File(this.filepath));

            for (Message message : messageArrayList) {
                String csvLine = message.toString() + "\n";
                writer.write(csvLine);
            }

            writer.close();

        } catch(Exception e) {
            System.out.println(e + ", " + "an error has occurred");
        }

    }



}
