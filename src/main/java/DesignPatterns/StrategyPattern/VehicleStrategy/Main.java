package DesignPatterns.StrategyPattern.VehicleStrategy;

public class Main {
    public static void main(String[] args) {
        Vehicle motorBoat = new Vehicle(new ExplosiveCrashBehaviour(),new WaterMethod(),new GasolineFuel());
        Vehicle bicycle = new Vehicle(new NormalCrashBehaviour(), new LandMethod(),new MuscleFuel() );
        Vehicle swanBoat = new Vehicle(new NormalCrashBehaviour(),new WaterMethod(),new MuscleFuel());
    }
}
