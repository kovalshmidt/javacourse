package Concurrency.Thread_Local;

public class ThreadLocalInitialValue {
    public static void main(String[] args) {
        ThreadLocal<Object> threadLocal1 = new ThreadLocal<Object>(){
            @Override
            protected Object initialValue(){
                return new Object();
            }
        };

        ThreadLocal<Object> threadLocal2 = ThreadLocal.withInitial(Object::new);

        Thread thread1 = new Thread(()->{
            System.out.println("Threadlocal 1: " + threadLocal1.get());
            System.out.println("Threadlocal 2: " + threadLocal2.get());
        });

        Thread thread2 = new Thread(()->{
            System.out.println("Threadlocal 1: " + threadLocal1.get());
            System.out.println("Threadlocal 2: " + threadLocal2.get());
        });
        thread1.start();
        thread2.start();
    }
}
