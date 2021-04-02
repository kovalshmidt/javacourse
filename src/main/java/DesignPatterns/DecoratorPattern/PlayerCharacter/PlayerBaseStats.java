package DesignPatterns.DecoratorPattern.PlayerCharacter;

public class PlayerBaseStats implements PlayerCharacter{
    @Override
    public int getAttack() {
        return 100;
    }

    @Override
    public int getDefense() {
        return 100;
    }
}
