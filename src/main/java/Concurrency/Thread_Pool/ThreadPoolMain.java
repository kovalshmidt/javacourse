package Concurrency.Thread_Pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolMain {
    public static void main(String[] args) {
        ThreadPool threadPool= new ThreadPool(3,10);
        for (int i = 0; i < 10; i++) {
            int taskNumber = i;
            threadPool.execute(() -> {
                String message = Thread.currentThread().getName() + " : Tasks " + taskNumber;
                System.out.println(message);
            });
        }
        threadPool.waitUntilAllDone();
        threadPool.stop();

        //Executorservice
        //Callable
        //Future
        //CompletableFuture

    }
}
