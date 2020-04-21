package lesson_3.exercises;

import java.util.Scanner;
import java.util.Random;


public class NumbersGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continuePlaying = true;
        int guess;
        do {
            int truth = RNG();
            System.out.println("Try to guess the number between 1 and 1000:");
            boolean foundIt = false;
            int  tries = 0;
            do {
                guess = input.nextInt();
                tries++;
                if (guess == truth) {
                    foundIt = true;
                    System.out.println("Congratulations,");
                    System.out.println("It took you: " + tries + " guesses to find the number!");
                } else {
                    if (guess < truth) {
                        System.out.println("Too small. Try again:");
                    }
                    if (guess > truth) {
                        System.out.println("Too high. Try again:");
                    }
                }
            } while (!foundIt);
            System.out.println("Do you want to play a new round? y/n");
            String nextRound = input.next();
            if (nextRound.equals("n")) {
                continuePlaying = false;
            }
        } while (continuePlaying);
        System.out.println("Goodbye");
    }

    private static int RNG() {
        return new Random().nextInt(1000);
    }
}
