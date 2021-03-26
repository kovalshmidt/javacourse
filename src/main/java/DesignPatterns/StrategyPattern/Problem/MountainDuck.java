package DesignPatterns.StrategyPattern.Problem;

public class MountainDuck extends FlyingFastDuck {
    @Override
    public void quack() {
        System.out.println("Roaring Quack!");
    }

    @Override
    public void display() {
        System.out.println("Nature Display");
    }
}
