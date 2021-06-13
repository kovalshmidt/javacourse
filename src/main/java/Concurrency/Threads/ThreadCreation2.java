package Concurrency.Threads;

public class ThreadCreation2 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        System.out.printf("%s is running! \n",Thread.currentThread().getName());
        myThread.start();
    }

    public static class MyThread extends Thread{
        public void run(){
            System.out.printf("%s is running! \n",Thread.currentThread().getName());
        }
    }
}
