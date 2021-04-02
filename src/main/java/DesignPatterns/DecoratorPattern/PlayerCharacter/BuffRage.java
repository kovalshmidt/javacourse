package DesignPatterns.DecoratorPattern.PlayerCharacter;

public class BuffRage extends StatDecorator {
    public BuffRage(PlayerCharacter playerCharacter) {
        super(playerCharacter);
    }

    @Override
    public int getAttack() {
        return this.playerCharacter.getAttack() + 15;
    }
}
