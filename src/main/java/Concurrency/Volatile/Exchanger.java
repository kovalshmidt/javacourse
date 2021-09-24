package Concurrency.Volatile;

public class Exchanger {
    private Object object = null;
    private volatile boolean hasNewObject = false;

    public Object getObject() {
        while (!hasNewObject){

        }
        Object returnValue = object;
        hasNewObject = false;
        return returnValue;
    }

    public void setObject(Object object) {
        this.object = object;
        hasNewObject = true;
    }
}
