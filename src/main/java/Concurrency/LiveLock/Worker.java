package Concurrency.LiveLock;

public class Worker {
    private String name;
    private boolean active;

    public Worker(String name, boolean active) {
        this.name = name;
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return active;
    }
    public synchronized void work(CommonRessource commonRessource,Worker otherWorker){
        while(active){
        //1 step. Check it it is my resource
            if (commonRessource.getOwner()!=this){
                try {
                    wait(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                continue;
            }
            //2 step. Before working on it pass it to the other one if it is active
            if (otherWorker.isActive()){
                System.out.println(getName()+" : hand over the resource to the worker: "+otherWorker.getName());
                commonRessource.setOwner(otherWorker);
                continue;
            }

            //3 step. work on the resource
            System.out.println(getName()+" : working on the common resource");
            active=false;
            commonRessource.setOwner(otherWorker);
        }
    }
    /*
    public synchronized void work(CommonRessource commonRessource,Worker otherWorker){
        while(active){
            if (commonRessource.getOwner()!=null){
                try {
                    wait(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(getName()+" : working on the common resource");
            active=false;
            commonRessource.setOwner(otherWorker);

            if (otherWorker.isActive()){
                System.out.println(getName()+" : hand over the resource to the worker: "+otherWorker.getName());
                commonRessource.setOwner(otherWorker);
                continue;
            }
        }
    }
     */
}
