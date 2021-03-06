package MessagePackage;
import System.Dictionary;

import java.io.*;
import java.util.ArrayList;

public class MessageManager {
    private Dictionary wordDictionary;
    private ArrayList<Message> messageArrayList = new ArrayList<>();
    private final String filepath = System.getProperty("user.home")+ File.separator + "ThoughtTrackerCSV" + File.separator;

    public MessageManager() {
        this.wordDictionary = new Dictionary(4861, 31);
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

    public ArrayList<Message> getMessageArrayList() {
        return messageArrayList;
    }

    public void addMessage(Message message){
        messageArrayList.add(message);
        splitSentence(message);

    }

    public void deleteMessage(Message message){
        if(messageArrayList.contains(message)){
            messageArrayList.remove(message);
        }
        else{
            System.out.println("no message found");
        }

    }

    public Dictionary getWordDictionary() {
        return wordDictionary;
    }

    public void splitSentence(Message sentence){
        String content = sentence.getContent();
        String[] splitContent = content.split(" ");

        for (String word: splitContent){
            wordDictionary.insert(word, 1);
        }
    }


    public void loadSentence(ArrayList<Message> array){
        this.wordDictionary = new Dictionary(4861, 31);
        for (Message msg: array) {
            splitSentence(msg);
        }
    }


    public void saveData(String filename) {

        File directory = new File(this.filepath);
        if (!directory.exists()) {
            directory.mkdirs();
        }

        try {
            File file = new File(this.filepath + filename);

            PrintWriter writer = new PrintWriter(file);

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
