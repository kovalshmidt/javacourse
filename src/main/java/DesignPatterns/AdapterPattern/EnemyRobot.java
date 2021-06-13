package DesignPatterns.AdapterPattern;

import java.util.LinkedList;
import java.util.Random;

public class EnemyRobot{
    Random generator = new Random();

    public void smashWithHands(){
        int attackDamage = generator.nextInt(10)+1;
        System.out.println("Enemy robot dealt "+attackDamage+" points of damage with its fists");
    }

    public  void walkForward(){
        int distance = generator.nextInt(5)+1;
        System.out.println("Enemy robot walked "+distance+" meters forward");
    }

    public void reactToHuman(String driver){
        System.out.println("Enemy robot detected "+driver+".");
    }
}
