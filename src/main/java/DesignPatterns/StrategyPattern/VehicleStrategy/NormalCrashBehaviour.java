package DesignPatterns.StrategyPattern.VehicleStrategy;

public class NormalCrashBehaviour implements CrashBehaviour{

    public void crash() {
        System.out.println("Knaaaarck!");
    }
}
