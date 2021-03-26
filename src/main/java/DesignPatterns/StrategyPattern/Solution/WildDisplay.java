package DesignPatterns.StrategyPattern.Solution;

public class WildDisplay implements DisplayStrategy{
    @Override
    public void display() {
        System.out.println("Nature Display");
    }
}
