package Concurrency.Threads;

public class ThreadCreation3 {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable(),"Test");
        thread.start();
    }

    public static class MyRunnable implements Runnable{

        @Override
        public void run() {
            System.out.printf("%s is running! \n",Thread.currentThread().getName());
        }
    }
}
