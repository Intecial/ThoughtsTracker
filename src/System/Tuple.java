package System;

public class Tuple<T, K> {
    private T first;
    private K second;

    public Tuple(T first, K second){
        this.first = first;
        this.second = second;
    }

    public T getFirst(){
        return first;
    }

    public K getSecond(){
        return second;
    }

    @Override
    public String toString() {
        return "(" + getFirst() + ", " + getSecond() + ")";
    }
}
