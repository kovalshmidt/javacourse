package Concurrency.ExecutorService;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceExample7 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        //Normal shutdown,will shutdown when all tasks are completed
        executorService.shutdown();

        //Will try to stop the task that are already running, those in the queue will not be executed
        List<Runnable> runnables = executorService.shutdownNow();


        try {
            //It is used together with shutdownNow(). The program will wait for the last task to terminate before continuing
            executorService.awaitTermination(3000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
