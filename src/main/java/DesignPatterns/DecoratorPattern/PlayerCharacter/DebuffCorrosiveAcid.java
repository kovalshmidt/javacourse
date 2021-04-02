package DesignPatterns.DecoratorPattern.PlayerCharacter;

public class DebuffCorrosiveAcid extends StatDecorator {
    public DebuffCorrosiveAcid(PlayerCharacter playerCharacter) {
        super(playerCharacter);
    }

    @Override
    public int getDefense() {
        return this.playerCharacter.getDefense() - 75;
    }
}
