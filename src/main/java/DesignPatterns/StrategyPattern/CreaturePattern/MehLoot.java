package DesignPatterns.StrategyPattern.CreaturePattern;

public class MehLoot implements LootTable{
    @Override
    public void loot() {
        System.out.println("Drops okay loot");
    }
}
