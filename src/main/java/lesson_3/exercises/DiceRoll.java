package lesson_3.exercises;

/**
 * Write an application to simulate the rolling of two dice. The application should use an object of class
 * Random once to roll the first die and again to roll the second die. The sum
 * of the two values should then be calculated. Each die can show an integer value from 1 to
 * 6, so the sum of the values will vary from 2 to 12, with 7 being the most frequent sum,
 * and 2 and 12 the least frequent. The image below shows the 36 possible combinations of
 * the two dice. Your application should roll the dice 36,000,000 times. Use a one-
 * dimensional array to tally the number of times
 * each possible sum appears. Display the results in tabular format.
 */

import java.util.Random;

public class DiceRoll {
    public static void main(String[] args) {
        int dice1, dice2, diceSum;
        int[] combo = new int[11];
        /**
         * 2 [0]
         * 3 [1]
         * 4 [2]
         * 5 [3]
         * 6 [4]
         * 7 [5]
         * 8 [6]
         * 9 [7]
         * 10 [8]
         * 11 [9]
         * 12 [10]
         */

        for (int i = 0; i <= 36000000; i++) {
            dice1 = diceThrow();
            dice2 = diceThrow();
            diceSum = dice1 + dice2;
            combo[diceSum - 2] += 1;


        }
        for (int j = 0; j <= 10; j++) {
            System.out.println((j + 2) + " was thrown " + combo[j] + " times.");
        }
    }

    private static int diceThrow() {
        return new Random().nextInt(6) + 1;
    }
}
