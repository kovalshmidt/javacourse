package DesignPatterns.AdapterPattern;

import java.util.Random;

public class EnemyTank implements EnemyAttacker{

    Random generator = new Random();

    @Override
    public void fireWeapon() {
        int damage = generator.nextInt(100)+1;
        System.out.printf("Enemy tank deals %d Damage \n",damage);
    }

    @Override
    public void driveForward() {
        int distance = generator.nextInt(50)+1;
        System.out.printf("Enemy tank drives for %d meters \n",distance);
    }

    @Override
    public void assignDriver(String driver) {
        System.out.printf("%s is driving the Tank%n",driver);
    }
}
