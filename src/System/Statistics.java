package System;

import MessagePackage.Message;
import MessagePackage.MessageManager;

import java.security.KeyException;
import java.util.ArrayList;

public class Statistics {

    private MessageManager messageManager;

    public Statistics(MessageManager messageManager) {
        this.messageManager = messageManager;
    }

    public String generateTopFive(Dictionary wordDictionary){
            Tuple[] temp = wordDictionary.getTable();

            Tuple[] tupleArray = new Tuple[wordDictionary.getCount()];

            int j = 0;
            for (int i = 0; i < temp.length; i++) {
                if (temp[i] != null) {
                    tupleArray[j] = temp[i];
                    j += 1;
                }
            }

            Sorter sorter = new Sorter();
            sorter.mergeSort(tupleArray);

        String strTuples = "";
//        int limit = 5;
//
//        for (Tuple tuple : tupleArray) {
//            if (limit > 0) {
//                strTuples += tuple + "\n";
//                limit--;
//            }
//        }

        int index = tupleArray.length - 1;
        int i = 0;
        while(i < 6 && index >= 0) {
            strTuples += tupleArray[index] + "\n";
            i++;
            index--;
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

    public int getMessageCount(){
        int count = 0;
        for (Message msg: messageManager.getMessageArrayList()){
            count ++;
        }
        return count;
    }

    public String displayStats(){

        return "";

    }

}
