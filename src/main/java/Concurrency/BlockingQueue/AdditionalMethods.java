package Concurrency.BlockingQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class AdditionalMethods {
    public static void main(String[] args) {
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(10);

        List arrayList = new ArrayList();
        populate(blockingQueue);
        //drain all the content of the queue to the list
        blockingQueue.drainTo(arrayList);
        System.out.println("Drained:");
        System.out.println("List 1: " + arrayList);
        System.out.println("Queue 1: " + blockingQueue);

        List arrayList2 = new ArrayList();
        populate(blockingQueue);
        //drain the elements from
        blockingQueue.drainTo(arrayList2, 5);
        System.out.println("List 2: " + arrayList2);
        System.out.println("Queue: " + blockingQueue);


        int capacity = blockingQueue.remainingCapacity();
        System.out.println("Capacity left: "+ capacity);

        boolean containsElement = blockingQueue.contains("8");
        System.out.println("Contains 8: "+ containsElement);
    }

    private static void populate(BlockingQueue<String> blockingQueue) {
        for (int i = 0; i <= 9; i++) {
            try {
                blockingQueue.put(i + "");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
