package DesignPatterns.AdapterPattern;

public class TestEnemies {
    public static void main(String[] args) {
        EnemyTank panzer = new EnemyTank();
        EnemyRobot robot = new EnemyRobot();
        EnemyAttacker attacker = new EnemyRobotAdapter(robot);

        System.out.println("The robot");
        robot.reactToHuman("Tim");
        robot.walkForward();
        robot.smashWithHands();

        System.out.println("The tank");
        panzer.assignDriver("Tim");
        panzer.driveForward();
        panzer.fireWeapon();

        System.out.println("The adapted Robot");
        attacker.assignDriver("John");
        attacker.driveForward();
        attacker.fireWeapon();

    }
}
