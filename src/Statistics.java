import MessagePackage.Message;
import MessagePackage.MessageManager;

import java.util.ArrayList;

public class Statistics {

    private MessageManager messageManager;

    private Dictionary wordDictionary = new Dictionary();
    private ArrayList<Message> wordList = new ArrayList<>();
    private ArrayList<Tuple> topFive = new ArrayList<>();

    public Statistics(MessageManager messageManager){
        this.messageManager = messageManager;
    }

    public void topFive(){

        wordList = messageManager.getMessageArrayList();
        splitSentence(wordList);

        Tuple[] temp = wordDictionary.getTable();

        Sorter sorter = new Sorter();
        sorter.mergeSort(temp);

        int counter = 0;

        for(int i = temp.length-1; i > temp.length - 6; i--){

            topFive.add(counter, temp[i]);
            counter++;

        }

    }

    public void splitSentence(ArrayList<Message> array){

        for (Message msg: array) {
            String msgContent = msg.getContent();
            String[] splitContent = msgContent.split(" ");

            for (String word: splitContent) {
                try {
                    wordDictionary.insert(word, 1);
                }
                catch (Exception e) {
                    System.out.println(e);
                }
            }
        }

    }

    public String displayStats(){

        return "";

    }

}
