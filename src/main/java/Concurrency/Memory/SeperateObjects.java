package Concurrency.Memory;

public class SeperateObjects {
    public static void main(String[] args) {
        Object test = new Object();
        Runnable runnable1 = new MyRunnable(test);
        Runnable runnable2 = new MyRunnable(test);

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();
    }
}
