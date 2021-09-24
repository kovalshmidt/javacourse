package Concurrency.Synchronisation;

public class SharedMonitorObjectMain {
    public static void main(String[] args) {
        Object monitor1 = new Object();

        SharedMonitorObjects sharedMonitorObjects1 = new SharedMonitorObjects(monitor1);
        SharedMonitorObjects sharedMonitorObjects2 = new SharedMonitorObjects(monitor1);

        sharedMonitorObjects1.intCounter();
        sharedMonitorObjects2.intCounter();


        Object monitor2 = new Object();
        SharedMonitorObjects sharedMonitorObjects3 = new SharedMonitorObjects(monitor2);

        sharedMonitorObjects3.intCounter();

    }
}
