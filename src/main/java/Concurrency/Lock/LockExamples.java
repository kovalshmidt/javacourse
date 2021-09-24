package Concurrency.Lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 1.   Synchronized block must be contained within a single method
 *      lock() and unlock() can be called from separate methods
 *  2.  Synchronized methods are always reentrant, Lock can decide not to be
 *  3.  Synchronized blocks can not guarantee fairness, Locks can
 **/
public class LockExamples {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock(true);
        lockBasics(lock);
        lockInterruptibly(lock);
        tryLock(lock);
    }

    public static void lockBasics(Lock lock) {
        Runnable runnable = () -> {
            lockSleepUnlock(lock, 1000);
        };

        Thread thread1 = new Thread(runnable, "Thread 1");
        Thread thread2 = new Thread(runnable, "Thread 2");
        Thread thread3 = new Thread(runnable, "Thread 3");

        thread1.start();
        thread2.start();
        thread3.start();
    }

    private static void lockSleepUnlock(Lock lock, long milliseconds) {
        try {
            //Point when threads gets in the queue
            lock.lock();
            printThreadMessage("Holds the lock");
            sleep(milliseconds);
        } finally {
            printThreadMessage("Lock released");
            lock.unlock();
        }
    }

    private static void printThreadMessage(String text) {
        System.out.println(Thread.currentThread().getName() + " | " + text);
    }

    private static void sleep(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void lockInterruptibly(Lock lock){
        Thread.currentThread().interrupt();
        try {
            lock.lockInterruptibly();
            lock.unlock();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }

    private static void tryLock(Lock lock){
        try {
            //boolean lockSuccessful = lock.tryLock();
            boolean lockSuccessful = lock.tryLock(100, TimeUnit.MILLISECONDS);
            System.out.println("Lock successful: "+ lockSuccessful);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
