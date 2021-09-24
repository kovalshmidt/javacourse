package Concurrency.Synchronisation;


import java.util.function.Consumer;

public class SynchronizedLambda {
    private static Object object = null;

    private static void setObject(Object o) {
        object = o;
    }

    public static void consumeObject(Consumer consumer) {
        consumer.accept(object);
    }

    public static void main(String[] args) {
        consumeObject((obj) -> {
            synchronized (SynchronizedLambda.class) {
                System.out.println(object);
            }
        });
        consumeObject((obj) -> {
            synchronized (String.class) { //this
                System.out.println(object);
            }
        });
    }
}
