package lesson_5.exercises.EulerProject;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class BigPrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Collection<Integer> primeFactors = new LinkedHashSet<>();
        boolean isPrime = true;
        int factor;

        System.out.println("Type in a number");
        final long Prime = input.nextLong();
        //Type in 600851475143
        factor = primeCheck(Prime);
        if (factor != 0) {
            isPrime = false;
            primeFactors.add(factor);
            factorCheck(primeFactors, Prime, factor);
        }

        System.out.println(Prime + " is " + (isPrime ? "" : "not") + " a prime number.");
        if (primeFactors.size() > 0) {
            System.out.println(primeFactors + " are the prime factors.");
            System.out.println("Largest prime factor: " + Collections.max(primeFactors));
            //Largest Factor 6857
        }
    }

    //Returns lowest prime factor
    private static int primeCheck(long prime) {
        for (int isDivisible = 2; isDivisible < prime; isDivisible++) {
            if (prime % isDivisible == 0) {
                return isDivisible;
            }
        }
        return 0;
    }

    //returns all prime factors
    private static void factorCheck(Collection<Integer> primeFactors, long prime, long factor) {
        //other factor (e.g. 2*50 = 100 >> 100/2 = 50)
        long otherFactor =  (prime / factor);
        //lowest prime 2 of 50 >> 2*2*25 >> 2*2*5*5
        long lowerFactor = primeCheck(otherFactor);
        if (lowerFactor != 0) {
            primeFactors.add((int) lowerFactor);
            factorCheck(primeFactors, otherFactor, lowerFactor);
        } else {
            primeFactors.add((int) otherFactor);
        }
    }
}
