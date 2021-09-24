package Concurrency.Thread_Local;

public class InheritableThreadLocalBasicExample {
    public static void main(String[] args) {
        ThreadLocal<String> threadLocal = new ThreadLocal<>();

        InheritableThreadLocal<String> inheritableThreadLocal = new InheritableThreadLocal<>();

        Thread thread = new Thread(() -> {

            System.out.println("==== Thread1 ====");
            threadLocal.set("Thread1 - ThreadLocal");
            inheritableThreadLocal.set("Thread1 - InheritableThreadLocal");

            System.out.println(threadLocal.get());//Thread1 - ThreadLocal
            System.out.println(inheritableThreadLocal.get());//Thread1 - InheritableThreadLocal

            Thread childThread = new Thread(() -> {
                System.out.println("==== ChildThread ====");
                System.out.println(threadLocal.get());//null
                System.out.println(inheritableThreadLocal.get());//Thread1 - InheritableThreadLocal
            });
            childThread.start();
        });
        thread.start();

        Thread thread2 = new Thread(()->{
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("==== Thread2 ====");
            System.out.println(threadLocal.get());//null
            System.out.println(inheritableThreadLocal.get());//null

        });
        thread2.start();
    }
}
