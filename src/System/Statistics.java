package System;

import MessagePackage.Message;
import MessagePackage.MessageManager;

import java.security.KeyException;
import java.util.ArrayList;

public class Statistics {

    private MessageManager messageManager;

    private Dictionary wordDictionary = new Dictionary(4861, 31);
    private ArrayList<Message> wordList = new ArrayList<>();
    private ArrayList<Tuple> topFive = new ArrayList<>();

    public Statistics(MessageManager messageManager) {
        this.messageManager = messageManager;
    }

    public String generateTopFive(){

        wordList = messageManager.getMessageArrayList();
        splitSentence(wordList);

        Tuple[] temp = wordDictionary.getTable();

        Tuple[] tupleArray = new Tuple[wordDictionary.getCount()];

        int j = 0;
        for(int i = 0; i < temp.length; i++){
            if (temp[i] != null){
                tupleArray[j] = temp[i];
                j += 1;
            }
        }

        Sorter sorter = new Sorter();
        sorter.mergeSort(tupleArray);

        String strTuples = "";
        int limit = 5;

        for (Tuple tuple : tupleArray) {
            if (limit > 0) {
                strTuples += tuple + "\n";
                limit--;
            }
        }

        String result = "Top 5 most used words: " + "\n" + strTuples;

        return result;
    }

    public String generateMessageCount() {

        int count = 0;

        for (Message msg: messageManager.getMessageArrayList()) {
            count++;
        }

        String result = "Total Messages: " + count;
        return result;
    }

    public int getCount(){
        int count = 0;
        for (Message msg: messageManager.getMessageArrayList()){
            count ++;
        }
        return count;
    }



    public void splitSentence(ArrayList<Message> array){

        for (Message msg: array) {
            String msgContent = msg.getContent();
            String[] splitContent = msgContent.split(" ");

            for (String word: splitContent) {
                wordDictionary.insert(word, 1);
            }
        }

    }

    public String displayStats(){

        return "";

    }

}
