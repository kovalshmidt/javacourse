package Concurrency.BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueUsageExample {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);

        blockingQueue.put("Element 1");
        blockingQueue.put("Element 2");

        String takeOne = blockingQueue.take();
        String takeTwo = blockingQueue.take();

        System.out.println(takeOne);
        System.out.println(takeTwo);
    }
}
