package Concurrency.Synchronisation;

public class SimpleCounter {
    private long counter;

    public synchronized void incCount(){
        counter++;
    }

    public synchronized long incGet(){
        return counter;
    }

}
