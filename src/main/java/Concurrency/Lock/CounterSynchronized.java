package Concurrency.Lock;

public class CounterSynchronized {
    private long count = 0;

    synchronized void increment(){
        count++;
    }
    synchronized long getCount(){
        return count;
    }
}
