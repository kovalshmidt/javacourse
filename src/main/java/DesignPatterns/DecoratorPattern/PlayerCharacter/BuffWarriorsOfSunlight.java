package DesignPatterns.DecoratorPattern.PlayerCharacter;

public class BuffWarriorsOfSunlight extends StatDecorator {

    public BuffWarriorsOfSunlight(PlayerCharacter playerCharacter) {
        super(playerCharacter);
    }

    @Override
    public int getAttack() {
        return this.playerCharacter.getAttack() + 25;
    }

    @Override
    public int getDefense() {
        return this.playerCharacter.getDefense() + 25;
    }
}
