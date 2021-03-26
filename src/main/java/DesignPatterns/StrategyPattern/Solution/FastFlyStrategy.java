package DesignPatterns.StrategyPattern.Solution;

public class FastFlyStrategy implements FlyStrategy{
    @Override
    public void fly() {
        System.out.println("Fly faster");
    }
}
