package Concurrency.Synchronisation;

public class MixItSynchronisation {
    public static Object staticObject = null;
    public Object instanceObject = null;

    public synchronized void setInstanceObject(Object instanceObject) {
        this.instanceObject = instanceObject;
    }

    public static synchronized void setStaticObject(Object staticObject) {
        MixItSynchronisation.staticObject = staticObject;
    }
}
