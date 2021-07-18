import java.security.KeyException;

public class Dictionary {
    private final int MIN_CAPACITY = 1;
    private final int[] PRIMES = {3,7, 11, 17, 23, 29, 37, 47, 59, 71, 89, 107, 131, 163, 197, 239, 293, 353, 431, 521, 631, 761, 919,
            1103, 1327, 1597, 1931, 2333, 2801, 3371, 4049, 4861, 5839, 7013, 8419, 10103, 12143, 14591, 17519, 21023,
            25229, 30313, 36353, 43627, 52361, 62851, 75521, 90523, 108631, 130363, 156437, 187751, 225307, 270371,
            324449, 389357, 467237, 560689, 672827, 807403, 968897, 1162687, 1395263, 1674319, 2009191, 2411033,
            2893249, 3471899, 4166287, 4999559, 5999471, 7199369 };

    private int count;
    private Tuple[] table;
    private int nextPrime;
    private int hashBase;

    public Dictionary(){
        this(17, 31);
    }

    public Dictionary(int tableSize, int hashBase){
        count = 0;
        table = new Tuple[tableSize];
        nextPrime = 0;
        this.hashBase = hashBase;

        while(PRIMES[nextPrime] <= tableSize){
            nextPrime += 1;
        }
    }

    public int size(){
        return this.count;
    }

    private void rehash(){
        Dictionary newHash = new Dictionary(PRIMES[nextPrime], hashBase);
        nextPrime++;

        for(int i = 0; i < table.length; i++){
            if(table[i] != null){
                try {
                    newHash.insert((String) table[i].getFirst(), (int) table[i].getSecond());
                }catch (KeyException e){
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    public void insert(String key, int data) throws KeyException{
        if (isFull()){
            rehash();
        }
        int position = linearProbe(key, true);

        if (table[position] == null){
            table[position] = new Tuple(key, data);
            count++;
        } else {
            int value = (int)table[position].getSecond() + data;
            table[position] = new Tuple(key, value);
        }

    }

    public String getItem(String key) throws KeyException {
        int position = linearProbe(key, false);
        return (String) table[position].getSecond();

    }

    private int linearProbe(String key, boolean isInsert) throws KeyException {
        int position = hash(key);

        if (isInsert && isFull()){
            throw new KeyException(key);
        }
        for(int i = 0; i < table.length; i++){
            if(table[position] == null){
                if (isInsert){
                    return position;
                }
                else{
                    throw new KeyException(key);
                }
            }
            else if(table[position].getFirst().equals(key)){
                return position;
            }
            else{
                position = (position + 1) % table.length;
            }
        }
        throw new KeyException(key);
    }

    public int hash(String key){
        int value = 0;
        for(int i = 0; i < key.length(); i++){
            char c = key.charAt(i);
            value = (value * hashBase + (int) c) % table.length;
        }
        return value;
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public boolean isFull(){
        return count == table.length;
    }

    public void deleteItem(String key) throws KeyException{
        int position = linearProbe(key, false);
        table[position] = null;
        count--;
        position = (position + 1) % table.length;
        while (table[position] != null){
            Tuple item = table[position];
            table[position] = null;
            count--;
            insert((String) item.getFirst(), (int) item.getSecond());
            position = (position + 1) % table.length;
        }

    }

    public Tuple[] getTable(){

        Tuple[] res = new Tuple[table.length];

        for (int i = 0; i < res.length; i++){

            res[i] = table[i];

        }

        return res;

    }

}
