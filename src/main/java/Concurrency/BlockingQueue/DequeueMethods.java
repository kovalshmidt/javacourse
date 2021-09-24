package Concurrency.BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class DequeueMethods {
    public static void main(String[] args) {
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);

        //take() blocks until an element becomes available
        try {
            String elementTake = blockingQueue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //poll() returns null if no element is available
        String elementPoll = blockingQueue.poll();

        //poll() with time variables waits for a set amount of time for a notnull element, but returns null if the time runs out
        try {
            String elementTimedPoll = blockingQueue.poll(1000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //remove() removes an element if present in the blockingQueue and returns a boolean of the elements presence
        boolean wasRemoved = blockingQueue.remove("1");
    }
}
