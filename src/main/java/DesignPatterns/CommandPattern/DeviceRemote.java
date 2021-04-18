package DesignPatterns.CommandPattern;

public class DeviceRemote {
    public static ElectronicDevice getTV(){
        return new Television();
    }

    public static ElectronicDevice getRadio(){
        return new Radio();
    }
}
