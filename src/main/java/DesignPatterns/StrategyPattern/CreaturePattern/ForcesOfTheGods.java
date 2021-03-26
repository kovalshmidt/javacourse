package DesignPatterns.StrategyPattern.CreaturePattern;

public class ForcesOfTheGods implements Faction {
    @Override
    public void memberOfFaction() {
        System.out.println("Fights in the name of the Gods");
    }
}
