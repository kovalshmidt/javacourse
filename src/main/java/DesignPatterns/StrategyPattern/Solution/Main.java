package DesignPatterns.StrategyPattern.Solution;

public class Main {
    public static void main(String[] args) {
        Duck mountainDuck = new Duck(new LoadQuackStrategy(),new WildDisplay(),new FastFlyStrategy());
        Duck rubberDucky = new Duck(new NoQuackStrategy(),new CityDisplayStrategy(),new NoFlyStrategy());
        Duck wildDuck = new Duck(new LoadQuackStrategy(),new WildDisplay(),new JetFlyStrategy());
    }
}
