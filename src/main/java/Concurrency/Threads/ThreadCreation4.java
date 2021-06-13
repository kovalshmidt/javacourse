package Concurrency.Threads;

public class ThreadCreation4 {
    public static void main(String[] args) {
       Runnable runnable = new Runnable() {
           @Override
           public void run() {
               System.out.printf("Runnable %s is running! \n",Thread.currentThread().getName());
           }
       };
       Thread thread = new Thread(runnable,"Test2");
       thread.start();
    }
}
