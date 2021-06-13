package DesignPatterns.AdapterPattern;

public class EnemyRobotAdapter implements EnemyAttacker{

    EnemyRobot robot;

    public EnemyRobotAdapter(EnemyRobot robot) {
        this.robot = robot;
    }

    @Override
    public void fireWeapon() {
       this.robot.smashWithHands();
    }

    @Override
    public void driveForward() {
        this.robot.walkForward();
    }

    @Override
    public void assignDriver(String driver) {
        this.robot.reactToHuman(driver);
    }
}
