package Concurrency.LiveLock;

public class LiveLock {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Worker1",true);
        Worker worker2 = new Worker("Worker2",true);

        CommonRessource commonRessource = new CommonRessource(worker1);

        new Thread(()->{
           worker1.work(commonRessource,worker2);
            worker2.work(commonRessource,worker1);
        }).start();

        /*new Thread(()->{
            worker2.work(commonRessource,worker1);

        }).start();
        */

    }
}
