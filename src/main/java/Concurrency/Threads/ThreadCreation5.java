package Concurrency.Threads;

public class ThreadCreation5 {
    public static void main(String[] args) {
        Runnable runnable = ()->{
            System.out.printf("Lambda  %s is running\n",Thread.currentThread().getName());
        };
        Thread thread = new Thread(runnable,"TestLambda");
        thread.start();
    }
}
