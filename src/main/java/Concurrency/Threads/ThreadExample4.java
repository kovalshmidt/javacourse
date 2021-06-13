package Concurrency.Threads;

public class ThreadExample4 {
    public static void main(String[] args) {
        Runnable runnable = ()->{
            for (int i = 0; i < 5; i++) {
              sleep(1000);
                System.out.println("Is running");
            }
        };
        Thread thread = new Thread(runnable);
        thread.setDaemon(true);
        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
