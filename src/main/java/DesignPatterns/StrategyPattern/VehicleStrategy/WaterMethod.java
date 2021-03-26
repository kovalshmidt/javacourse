package DesignPatterns.StrategyPattern.VehicleStrategy;

public class WaterMethod implements MethodOfTravel{
    @Override
    public void method() {
        System.out.println("Travels by Water");
    }
}
