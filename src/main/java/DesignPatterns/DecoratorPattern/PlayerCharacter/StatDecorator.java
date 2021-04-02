package DesignPatterns.DecoratorPattern.PlayerCharacter;

public class StatDecorator implements PlayerCharacter {
    protected PlayerCharacter playerCharacter;

    public StatDecorator(PlayerCharacter playerCharacter) {
        this.playerCharacter = playerCharacter;
    }

    @Override
    public int getAttack() {
        return this.playerCharacter.getAttack();
    }

    @Override
    public int getDefense() {
        return this.playerCharacter.getDefense();
    }
}
