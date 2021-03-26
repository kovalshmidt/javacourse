package DesignPatterns.StrategyPattern.CreaturePattern;

public class BorealCreatureTaken implements DamageTakenModifiers{
    @Override
    public void damageTaken() {
        System.out.println("Immune to frost, weak to lightning");
    }
}
