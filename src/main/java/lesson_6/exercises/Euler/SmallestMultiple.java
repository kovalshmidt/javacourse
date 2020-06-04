package lesson_6.exercises.Euler;

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 *
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

public class SmallestMultiple {
    public static void main(String[] args) {
        int quotient;
        boolean allMultiples;
        for (int number = 20; ; number += 20) {
            allMultiples = true;
            for (int divisor = 1; divisor <= 20; divisor++) {
                if (number % divisor != 0) {
                    allMultiples = false;
                    break;
                }
            }
            if (allMultiples){
                quotient = number;
                break;
            }
        }
        System.out.println("Smallest Multiple is:");
        System.out.println(quotient);
    }
}
