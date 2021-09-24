package Concurrency.Deadlock;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DeadlockDemoFix {


    private static void moveListItem(List<Integer> from, List<Integer> to, Integer item) throws InterruptedException {
        boolean removedSuccessfully = false;
        //synchronized (DeadlockDemo.class) { We block the access to two objects by having a higher Object
        TimeUnit.SECONDS.sleep(1);
        log("Attempting lock for list", from);
        synchronized (from) { //Thread1 takes list1, thread2 waits for thread1 to finish
            log("Lock acquired for list", from);
            TimeUnit.SECONDS.sleep(1);
            removedSuccessfully = from.remove(item);

        }
        if (removedSuccessfully) {
            log("Attempting lock for list", to);
            synchronized (to) { //Thread1 waits for thread2 to finish, so that it gets access to list2
                log("Lock acquired for list", to);
                to.add(item);
                log("moved item to list", to);
            }
        }
    }

    private static void log(String message, Object target) {
        System.out.println(Thread.currentThread().getName() + " : " + message + " : " + System.identityHashCode(target));
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        Thread thread1 = new Thread(() -> {
            try {
                moveListItem(list1, list2, 2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread thread2 = new Thread(() -> {
            try {
                moveListItem(list2, list1, 9);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread1.start();
        thread2.start();
    }
}
