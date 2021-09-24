package Concurrency.Memory;

public class MyRunnable implements Runnable{
    private int count = 0;
    private Object object;


    public MyRunnable(Object object) {
        this.object = object;
    }


    public MyRunnable() {
        this.object = new Object();
    }

    @Override
    public void run() {
        //Object object = new Object();
        System.out.println(object);
        for (int i = 0; i < 1_000_000; i++) {
            synchronized (this) {
                this.count++;
            }
        }
        System.out.println(Thread.currentThread().getName()+"  "+count);
    }
}
