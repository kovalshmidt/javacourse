package DesignPatterns.StrategyPattern.Problem;

public class CityDuck extends Duck{
    @Override
    public void quack() {
        super.quack();
    }

    @Override
    public void display() {
        System.out.println("Park display");
    }

    @Override
    public void fly() {
        super.fly();
    }
}
