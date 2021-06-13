package DesignPatterns.StatePattern.Lake;

public class IsDrained implements LakeState {
    EnchantedLake enchantedLake;

    public IsDrained(EnchantedLake enchantedLake) {
        this.enchantedLake = enchantedLake;
    }

    @Override
    public void toWater() {
        enchantedLake.setLakeState(enchantedLake.hasWater);
    }

    @Override
    public void toLava() {
        enchantedLake.setLakeState(enchantedLake.hasLava);
    }

    @Override
    public void toDrained() {

    }

    @Override
    public void toFrozen() {

    }

    @Override
    public void traverseLake() {
        System.out.println("Walk on the lake bed");
    }
}
