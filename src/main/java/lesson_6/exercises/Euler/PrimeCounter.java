package lesson_6.exercises.Euler;

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 *
 * What is the 10 001st prime number?
 */

public class PrimeCounter {
    public static void main(String[] args) {
        final int MAXNUMBER = 10001;
        int counter = 0,prime;
        for (int number = 2; ; number++) {
            if (primeCheck(number)) {
                counter++;
            }
            if (counter == MAXNUMBER) {
                prime = number;
                break;
            }
        }
        System.out.println("10001st prime number is: " + prime);
    }

    public static boolean primeCheck(int prime) {
        for (int isDivisible = 2; isDivisible < prime; isDivisible++) {
            if (prime % isDivisible == 0) {
                return false;
            }
        }
        return true;
    }
}
