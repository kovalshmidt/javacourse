package DesignPatterns.StrategyPattern.Problem;

public class CloudDuck extends FlyingFastDuck{
    @Override
    public void quack() {
        super.quack();
    }

    @Override
    public void display() {
        System.out.println("Cloudy Display");
    }

}
