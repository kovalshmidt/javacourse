package Concurrency.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CounterLock {
    private long count = 0;
    Lock counterLock = new ReentrantLock();

    public void increment(){
        try {
            counterLock.lock();
            count++;
        }
        finally {
            counterLock.unlock();
        }
    }

    public long getCount() {
        try {
            counterLock.lock();
            return count;
        }
        finally {
            counterLock.unlock();
        }
    }
}
