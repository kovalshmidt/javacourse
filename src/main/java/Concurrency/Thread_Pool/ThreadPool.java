package Concurrency.Thread_Pool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ThreadPool {

    private BlockingQueue<Runnable> taskQueue = null;
    private List<PoolThreadRunnable> runnables = new ArrayList<>();
    private boolean isStopped = false;


    public ThreadPool(int numberOfThreads, int maxNumberOfTasks) {
        taskQueue = new ArrayBlockingQueue<Runnable>(maxNumberOfTasks);
        for (int i = 0; i < numberOfThreads; i++) {
            PoolThreadRunnable poolThreadRunnable = new PoolThreadRunnable(taskQueue);
            runnables.add(poolThreadRunnable);
        }

        for (PoolThreadRunnable runnable : runnables) {
            new Thread(runnable).start();
        }
    }

    public synchronized void execute(Runnable task) {
        if (isStopped) throw new IllegalStateException("Thread pool has stopped!");

        this.taskQueue.offer(task);
    }

    public synchronized void stop() {
        isStopped = true;
        for (PoolThreadRunnable poolThreadRunnable : runnables) {
            poolThreadRunnable.doStop();
        }
    }

    public synchronized void waitUntilAllDone() {
        while (this.taskQueue.size() > 0) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
