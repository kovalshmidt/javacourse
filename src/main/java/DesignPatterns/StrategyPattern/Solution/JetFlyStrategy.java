package DesignPatterns.StrategyPattern.Solution;

public class JetFlyStrategy implements FlyStrategy{
    @Override
    public void fly() {
        System.out.println("Turbine Fly");
    }
}
