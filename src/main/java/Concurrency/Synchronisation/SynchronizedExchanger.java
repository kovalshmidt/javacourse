package Concurrency.Synchronisation;

public class SynchronizedExchanger {
    Object object = null;

    // it means that the thread that gets in this method acquires the lock of the object on which it is called
    // synchronized(this)
    public synchronized void setObject(Object object) {
        this.object = object;
    }

    public synchronized Object getObject() {
        return object;
    }

    public void setObj(Object object) {
        synchronized (this) {
            this.object = object;
        }
    }

    public Object getObj() {
        synchronized (this) {
            return object;
        }
    }
}
