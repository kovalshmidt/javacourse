package DesignPatterns.StrategyPattern.CreaturePattern;

public class FeralCreature implements DamageDealtModifier{
    @Override
    public void damageDealt() {
        System.out.println("Deals Claw damage");
    }

}
