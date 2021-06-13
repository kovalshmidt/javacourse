package DesignPatterns.StatePattern.Lake;

public interface LakeState {
    void toWater();
    void toLava();
    void toDrained();
    void toFrozen();
    void traverseLake();
}
