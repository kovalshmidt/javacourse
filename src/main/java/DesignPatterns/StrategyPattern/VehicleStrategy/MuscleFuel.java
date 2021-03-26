package DesignPatterns.StrategyPattern.VehicleStrategy;

public class MuscleFuel implements Fuel{
    @Override
    public void fueledBy() {
        System.out.println("Fueled by muscle power");
    }
}
