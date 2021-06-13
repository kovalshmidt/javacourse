package DesignPatterns.StatePattern.Lake;

public class HasLava implements LakeState{
    EnchantedLake enchantedLake;

    public HasLava(EnchantedLake enchantedLake) {
        this.enchantedLake = enchantedLake;
    }

    @Override
    public void toWater() {

    }

    @Override
    public void toLava() {

    }

    @Override
    public void toDrained() {
    enchantedLake.setLakeState(enchantedLake.isDrained);
    }

    @Override
    public void toFrozen() {
        enchantedLake.setLakeState(enchantedLake.isFrozen);
    }

    @Override
    public void traverseLake() {
        System.out.println("Burn up");
    }
}
