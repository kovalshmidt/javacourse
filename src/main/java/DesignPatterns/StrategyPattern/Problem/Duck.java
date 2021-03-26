package DesignPatterns.StrategyPattern.Problem;

/*
In computer programming, the strategy pattern (also known as the policy pattern) is a behavioral software design pattern that enables selecting an algorithm at runtime.
Instead of implementing a single algorithm directly, code receives run-time instructions as to which in a family of algorithms to use.
 */

public class Duck {
    public void quack(){
        System.out.println("Quack!");
    }

    public void display(){
        System.out.println("Display");
    }

    public void fly(){
        System.out.println("Fly me to the moon...");
    }
}
