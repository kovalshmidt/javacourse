package DesignPatterns.StrategyPattern.Solution;

public class NoFlyStrategy implements FlyStrategy{
    @Override
    public void fly() {
        System.out.println("Grounded");
    }
}
