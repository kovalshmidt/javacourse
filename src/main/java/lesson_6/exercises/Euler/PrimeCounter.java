package lesson_6.exercises.Euler;

import lesson_5.exercises.PrimeNumber;

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
