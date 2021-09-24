package Concurrency.BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class EnqueueMethods {
    public static void main(String[] args) {
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);

        //put() will block until there is space in the BlockingQueue for the element
        try {
            blockingQueue.put("1");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //add will throw IllegalStateException, if there is no space available for the element
        blockingQueue.add("2");

        //offer() returns false, if there is no space
        boolean wasEnqueued = blockingQueue.offer("3");

        //offer() can be set on a timer, if there is no space within the time limit it returns false, instead of checking immediately
        try {
            boolean wasEnqueuedTimer = blockingQueue.offer("3",1000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
