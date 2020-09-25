package lesson_3.exercises;
/**
 * Write an application that simulates coin tossing. Let the program toss a coin each time the
 * user chooses the “Toss Coin” menu option. Count the number of times each side of the coin
 * appears. Display the results. The program should call a separate method flip that takes no
 * arguments and returns a value from a Coin enum (HEADS and TAILS). [Note: If the program
 * realistically simulates coin tossing, each side of the coin should appear approximately half
 * the time.]
 */

import java.util.Random;
import java.util.Scanner;

public class CoinToss {

    public static void main(String[] args) {
        boolean loop = true;
        int tails = 0;
        int heads = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Toss a coin or finish:");
        do {
            String answer = input.next();
            if (answer.equals("toss")) {
                boolean result = Throw();
                if (result) {
                    System.out.println("Heads");
                    heads++;
                } else {
                    System.out.println("Tails");
                    tails++;
                }
            } else if (answer.equals("finish")) {
                loop = false;
                System.out.println("Heads: " + heads + " Tails: " + tails);
            } else {
                System.out.println("Unclear answer. toss/finish acceptable answers");
            }
        } while (loop);

    }

    private static boolean Throw() {
        return new Random().nextBoolean();
    }
}
