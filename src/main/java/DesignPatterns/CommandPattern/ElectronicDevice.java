package DesignPatterns.CommandPattern;

public interface ElectronicDevice {
    boolean isStatus();
    void on();
    void off();
    void volumeUp();
    void volumeDown();
}
