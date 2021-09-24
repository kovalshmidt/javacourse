package Concurrency.Synchronisation;

public class SharedMonitorObjects {
    private Object monitor = null;

    int counter1 = 0;

    public SharedMonitorObjects(Object monitor) {
        if (monitor == null) {
            throw new IllegalArgumentException("Monitor Object cannot be null");
        }
        this.monitor = monitor;
    }

    public void intCounter() {
        synchronized (this.monitor){
            this.counter1++;
            System.out.println(counter1);
        }
    }
}
