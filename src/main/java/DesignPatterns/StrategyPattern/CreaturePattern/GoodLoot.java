package DesignPatterns.StrategyPattern.CreaturePattern;

public class GoodLoot implements LootTable {
    @Override
    public void loot() {
        System.out.println("Drops phat loot");
    }
}
