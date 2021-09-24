package Concurrency.Synchronisation;

public class Reentrance {
    int count  = 0;

    public synchronized void inc(){
        count++;
    }

    public synchronized int incAndGet(){
        inc();
        return count;
    }
}
