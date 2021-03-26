package DesignPatterns.StrategyPattern.Solution;

public class Duck {

    private final QuackStrategy quackStrategy;
    private final DisplayStrategy displayStrategy;
    private final FlyStrategy flyStrategy;

    public Duck(QuackStrategy quackStrategy, DisplayStrategy displayStrategy, FlyStrategy flyStrategy) {
        this.quackStrategy = quackStrategy;
        this.displayStrategy = displayStrategy;
        this.flyStrategy = flyStrategy;
    }

    public void quack() {
        this.quackStrategy.quack();
    }

    public void display() {
        this.displayStrategy.display();
    }

    public void fly() {
        this.flyStrategy.fly();
    }

}
