package lesson_6.exercises.Euler;

/**
 * The sum of the squares of the first ten natural numbers is,
 * <p>
 * 1^2+2^2+...+102=385
 * The square of the sum of the first ten natural numbers is,
 * <p>
 * (1+2+...+10)^2=55^2=3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025−385=2640.
 * <p>
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */

public class SumSquareDifference {
    public static void main(String[] args) {
        int sumOfSquare = 0, squareOfSum = 0, difference;
        for (int m = 1; m <= 100; m++) {
            sumOfSquare += Math.pow(m, 2);
            squareOfSum += m;
        }
        squareOfSum = (int) Math.pow(squareOfSum, 2);
        System.out.println("Sum of the square: " + sumOfSquare);
        System.out.println("Square of the sum: " + squareOfSum);
        difference = squareOfSum - sumOfSquare;
        System.out.println("Difference: " + difference);

    }

}
