package Concurrency.ExecutorService;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceExample3 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future future = executorService.submit(newRunnable("Task 1"));
        System.out.println(future.isDone());
        try {
            //Main thread is blocked here until other thread is done with the task
            future.get(); //will return null0
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println(future.isDone());
        executorService.shutdown();
    }

    private static Runnable newRunnable(String message) {
        return new Runnable() {
            @Override
            public void run() {
                String string = Thread.currentThread().getName() + " : " + message;
                System.out.println(string);
            }
        };
    }
}
