package DesignPatterns.StrategyPattern.VehicleStrategy;

public class GasolineFuel implements Fuel{

    public void fueledBy() {
        System.out.println("Fueled by Gasoline");
    }
}
