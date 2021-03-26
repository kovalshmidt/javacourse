package DesignPatterns.StrategyPattern.CreaturePattern;

public class VolcanicCreatureTaken implements DamageTakenModifiers{
    public void damageTaken() {
        System.out.println("Immune to fire, Weak to Frost");
    }
}
