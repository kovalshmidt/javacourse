package Concurrency.Thread_Pool;

import java.util.concurrent.BlockingQueue;

public class PoolThreadRunnable implements Runnable {

    private Thread thread = null;
    private BlockingQueue<Runnable> taskQueue = null;
    private boolean isStopped = false;

    public PoolThreadRunnable(BlockingQueue<Runnable> taskQueue) {
        this.taskQueue = taskQueue;
    }

    @Override
    public void run() {
        this.thread = Thread.currentThread();

        while (!isStopped) {
            Runnable runnable = null;
            if (taskQueue.size() > 0) {
                try {
                    runnable = taskQueue.take();
                    runnable.run();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public synchronized void doStop() {
        isStopped = true;
        this.thread.interrupt();
    }

    public synchronized boolean isStopped() {
        return isStopped;
    }
}
