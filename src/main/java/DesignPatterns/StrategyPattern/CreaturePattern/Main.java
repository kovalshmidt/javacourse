package DesignPatterns.StrategyPattern.CreaturePattern;

public class Main {
    public static void main(String[] args) {
        Creature enemy = new Creature(new FeralCreature(),new VolcanicCreatureTaken(),new LegionOfTheDeep(),new MehLoot());
        Creature friend = new Creature(new SentientCreature(),new BorealCreatureTaken(), new ForcesOfTheGods(),new MehLoot());
        Creature enemy2 = new Creature(new SentientCreature(),new BorealCreatureTaken(),new LegionOfTheDeep(),new GoodLoot());
    }
}
