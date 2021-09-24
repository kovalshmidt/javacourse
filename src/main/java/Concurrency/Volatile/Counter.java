package Concurrency.Volatile;

public class Counter {
    private volatile int count = 0;

    public synchronized boolean increment(){
        // two threads arrive and the value of count = 9
        if (this.count==10){
            return false;
        }
        count++;
        // 1. read count value
        // 2. increment
        // 3. write count to memory
        return true;
    }
}
