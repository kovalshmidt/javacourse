package DesignPatterns.StrategyPattern.Solution;

public class NoQuackStrategy implements QuackStrategy{
    @Override
    public void quack() {
        System.out.println("...");
    }
}
