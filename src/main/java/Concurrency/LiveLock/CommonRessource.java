package Concurrency.LiveLock;

public class CommonRessource {
    private Worker owner;

    public CommonRessource(Worker owner) {
        this.owner = owner;
    }

    public Worker getOwner() {
        return owner;
    }

    public synchronized void setOwner(Worker owner) {
        this.owner = owner;
    }


}
