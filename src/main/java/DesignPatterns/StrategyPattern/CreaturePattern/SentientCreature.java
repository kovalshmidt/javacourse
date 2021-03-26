package DesignPatterns.StrategyPattern.CreaturePattern;

public class SentientCreature implements DamageDealtModifier{
    @Override
    public void damageDealt() {
        System.out.println("Deals damage with weapons");
    }
}
