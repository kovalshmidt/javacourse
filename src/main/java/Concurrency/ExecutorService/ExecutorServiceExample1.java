package Concurrency.ExecutorService;

import java.util.concurrent.*;

public class ExecutorServiceExample1 {
    public static void main(String[] args) {
        int corePoolSize = 10;
        int maxPoolSize = 20;
        long keepAliveTime = 3000;

        //Execute the task as quick as possible
        ExecutorService threadPoolExecutor = new ThreadPoolExecutor(
                corePoolSize, //Base number of threads in the pool
                maxPoolSize,  //Max. number of threads in the pool, increase it when it is needed
                keepAliveTime, //If additionally added thread is idle for more than the allotted time, it will be removed
                TimeUnit.MILLISECONDS, //Time unit for keepAliveTime
                new ArrayBlockingQueue<>(128) //Collection for the to be executed tasks
        );
        threadPoolExecutor = Executors.newFixedThreadPool(3);

        //You can make scheduled execution of the tasks
        ExecutorService scheduledExecutorService = new ScheduledThreadPoolExecutor(3);
        scheduledExecutorService = Executors.newFixedThreadPool(3);
    }
}
