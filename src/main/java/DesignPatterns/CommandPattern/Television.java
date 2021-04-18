package DesignPatterns.CommandPattern;

/**
 * The television is a receiver
 */
public class Television implements ElectronicDevice{
    private int volume;
    private boolean status;

    public boolean isStatus() {
        return status;
    }

    @Override
    public void on() {
        System.out.println("TV is on");
        this.status = true;
    }

    @Override
    public void off() {
        System.out.println("TV is off");
        this.status = false;
    }

    @Override
    public void volumeUp() {
        this.volume++;
        System.out.printf("Volume of the TV is %d \n",this.volume);
    }

    @Override
    public void volumeDown() {
        this.volume--;
        System.out.printf("Volume of the TV is %d \n",this.volume);
    }
}
