package DesignPatterns.DecoratorPattern.PlayerCharacter;

public class GameMain {
    public static void main(String[] args) {
        PlayerCharacter player1 = new BuffWarriorsOfSunlight(new DebuffCorrosiveAcid(new PlayerBaseStats()));
        PlayerCharacter player2 = new BuffGlassCannon(new BuffRage(new PlayerBaseStats()));

        System.out.printf("Player1: %d Attack  %d Defense \n",player1.getAttack(),player1.getDefense());
        System.out.printf("Player2: %d Attack  %d Defense \n",player2.getAttack(),player2.getDefense());
    }
}
