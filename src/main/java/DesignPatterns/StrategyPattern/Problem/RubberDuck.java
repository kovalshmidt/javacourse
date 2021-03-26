package DesignPatterns.StrategyPattern.Problem;

public class RubberDuck extends Duck{
    @Override
    public void quack() {
        System.out.println("Squeeze!");
    }

    @Override
    public void display() {
        super.display();
    }

    @Override
    public void fly() {
        System.out.println("Doesn't fly");
    }
}
