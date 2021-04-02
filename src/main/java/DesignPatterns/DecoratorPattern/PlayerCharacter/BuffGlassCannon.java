package DesignPatterns.DecoratorPattern.PlayerCharacter;

public class BuffGlassCannon extends StatDecorator {
    public BuffGlassCannon(PlayerCharacter playerCharacter) {
        super(playerCharacter);
    }

    @Override
    public int getAttack() {
        return this.playerCharacter.getAttack() + 50;
    }

    @Override
    public int getDefense() {
        return this.playerCharacter.getDefense() - 100;
    }
}
