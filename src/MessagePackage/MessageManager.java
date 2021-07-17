package MessagePackage;

import java.io.*;
import java.util.ArrayList;

public class MessageManager {

    public ArrayList<Message> messageArrayList = new ArrayList<>();
    private final String filepath = "."+ File.separator + "saves" + File.separator;

    public MessageManager() {
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

    public void saveData(String filename) {

        try {
            PrintWriter writer = new PrintWriter(new File(this.filepath + filename));

            for (Message message : messageArrayList) {
                String csvLine = message.toString() + "\n";
                writer.write(csvLine);
            }

            writer.close();

        } catch(Exception e) {
            System.out.println(e + ", " + "an error has occurred");
        }

    }

    public void loadData(String filename) {
        try{
            this.messageArrayList = new ArrayList<>();

            FileReader fileReader = new FileReader(this.filepath + filename);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                messageArrayList.add(new Message(line));
            }

        } catch(Exception e) {
            System.out.println(e + ", error occurred");
        }


    }



}
