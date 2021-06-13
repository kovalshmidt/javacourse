package Concurrency.Threads;

public class ThreadExample3 {
    public static void main(String[] args) {
       Runnable runnable = ()->{
           while(true){
               System.out.println("Running");
               sleep(1000);
           }
       };
       Thread thread = new Thread(runnable,"InfiniteThread");
       thread.setDaemon(true);
       thread.start();
       sleep(3000);
    }

    private static void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
