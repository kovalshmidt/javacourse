package Concurrency.Deadlock;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DeadlockDemo {
    private static void moveListItem(List<Integer> from, List<Integer> to, Integer item) throws InterruptedException {
        log("Attempting lock for list",from);
        synchronized (from){ // thread1 get the lock on from(list1) thread2 gets the lock on from(list2)
            log("Lock acquired for list",from);
            TimeUnit.SECONDS.sleep(1);
            log("Attempting lock for list",to);
            synchronized (to){ // thread1 get the lock on to(list2) thread2 tries to get the lock on to(list1)
                log("Lock acquired for list",to);
                if (from.remove(item)){
                    to.add(item);
                }
                log("moved item to list",to);
            }
        }
    }

    private static void log(String message,Object target){
        System.out.println(Thread.currentThread().getName()+" : "+message+" : "+ System.identityHashCode(target));
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(2,4,6,8,10));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,3,5,7,9));
        Thread thread1 = new Thread(()->{
            try {
                moveListItem(list1,list2,2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread thread2 = new Thread(()->{
            try {
                moveListItem(list2,list1,9);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread1.start();
        thread2.start();
    }
}
