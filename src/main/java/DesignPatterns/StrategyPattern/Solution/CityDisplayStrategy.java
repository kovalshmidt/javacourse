package DesignPatterns.StrategyPattern.Solution;

public class CityDisplayStrategy implements DisplayStrategy{
    @Override
    public void display() {
        System.out.println("City Display");
    }
}
