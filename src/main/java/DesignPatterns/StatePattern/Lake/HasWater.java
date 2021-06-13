package DesignPatterns.StatePattern.Lake;

public class HasWater implements LakeState{

    EnchantedLake enchantedLake;

    public HasWater(EnchantedLake enchantedLake) {
        this.enchantedLake = enchantedLake;
    }

    @Override
    public void toWater() {
        System.out.println("Lake is already filled with Water");
    }

    @Override
    public void toLava() {
        System.out.println("Northern Magic prevents hellish Lava from rising");
    }

    @Override
    public void toDrained() {
        System.out.println("Void Magic Drains the Lake");
        enchantedLake.setLakeState(enchantedLake.isDrained);
    }

    @Override
    public void toFrozen() {
        System.out.println("Southern Magic freezes the Lake");
        enchantedLake.setLakeState(enchantedLake.isFrozen);
    }

    @Override
    public void traverseLake() {
        System.out.println("Swim across");
    }
}
