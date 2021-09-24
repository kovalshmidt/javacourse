package Concurrency.Synchronisation;

public class StaticSynchronizedExchanger {
    private static Object object = null;

    public synchronized static void setObject(Object obj) {
        object = obj;
    }

    public synchronized static Object getObject() {
        return object;
    }

    public static void setObj(Object obj) {
        synchronized (StaticSynchronizedExchanger.class) {
            object = obj;
        }
    }

    public static Object getObj() {
        synchronized (StaticSynchronizedExchanger.class) {
            return object;
        }
    }
}
