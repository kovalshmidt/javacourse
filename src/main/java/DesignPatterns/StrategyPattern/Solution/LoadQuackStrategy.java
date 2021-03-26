package DesignPatterns.StrategyPattern.Solution;

public class LoadQuackStrategy implements QuackStrategy{
    @Override
    public void quack() {
        System.out.println("QUACK!");
    }
}
