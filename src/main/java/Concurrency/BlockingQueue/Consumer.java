package Concurrency.BlockingQueue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{
    BlockingQueue<String> stringBlockingQueue = null;

    public Consumer(BlockingQueue<String> stringBlockingQueue) {
        this.stringBlockingQueue = stringBlockingQueue;
    }

    @Override
    public void run() {
        while (true){
            try {
                String element = stringBlockingQueue.take();
                System.out.println("Consumed: "+element);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
