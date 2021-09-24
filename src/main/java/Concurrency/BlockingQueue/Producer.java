package Concurrency.BlockingQueue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
    BlockingQueue<String> stringBlockingQueue = null;

    public Producer(BlockingQueue<String> stringBlockingQueue) {
        this.stringBlockingQueue = stringBlockingQueue;
    }

    @Override
    public void run() {
     while (true){
         long timeNow = System.currentTimeMillis();
         try {
             stringBlockingQueue.put(String.valueOf(timeNow));// "" + 123 -> "123"
         } catch (InterruptedException e) {
             System.out.println("Producer was interrupted");
             e.printStackTrace();
         }
         sleep(1000);
     }
    }

    private void sleep(long timeMilliseconds){
        try {
            Thread.sleep(timeMilliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
