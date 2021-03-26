package DesignPatterns.StrategyPattern.VehicleStrategy;

public class ExplosiveCrashBehaviour implements CrashBehaviour{
    public void crash() {
        System.out.println("Kabooom!");
    }
}
