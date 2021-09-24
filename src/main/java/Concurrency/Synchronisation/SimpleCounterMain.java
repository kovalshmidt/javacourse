package Concurrency.Synchronisation;

public class SimpleCounterMain {
    public static void main(String[] args) {
        SimpleCounter simpleCounter = new SimpleCounter();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000000; i++) {
                simpleCounter.incCount();
            }
            System.out.println(simpleCounter.incGet());
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000000; i++) {
                simpleCounter.incCount();
            }
            System.out.println(simpleCounter.incGet());
        });
        thread1.start();
        thread2.start();
    }
}
