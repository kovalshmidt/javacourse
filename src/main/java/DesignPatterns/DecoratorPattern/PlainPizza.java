package DesignPatterns.DecoratorPattern;

public class PlainPizza implements Pizza{

    @Override
    public String getDescription() {
        return "dough";
    }

    @Override
    public double getCost() {
        return 0.99;
    }
}
