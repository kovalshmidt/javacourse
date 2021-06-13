package Concurrency.Threads;

public class ThreadExample1 {
    public static void main(String[] args) {
        Runnable runnableTest = ()->{
            String threadName = Thread.currentThread().getName();
            System.out.printf("%s is now running\n",threadName);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.printf("%s is now finished its task\n",threadName);
        };
        Thread thread = new Thread(runnableTest);
        thread.start();
    }
}
