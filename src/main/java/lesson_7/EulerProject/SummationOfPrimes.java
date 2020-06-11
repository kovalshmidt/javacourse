package lesson_7.EulerProject;

/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 *
 * Find the sum of all the primes below two million.
 */

import lesson_5.exercises.PrimeNumber;

import java.util.HashSet;

public class SummationOfPrimes {
    public static void main(String[] args) {
        HashSet<Integer> primes = new HashSet<>();
        long summation = 0;

        for(int number = 1;number <= 2000000;number++){
            if ((PrimeNumber.primeCheck(number) == 0)&&(number != 1)){
                primes.add(number);
                System.out.println(number + " is Prime");
            }
        }
        for (Integer number: primes) {
            summation = summation + number;
        }

        System.out.println(summation);
    }
}
