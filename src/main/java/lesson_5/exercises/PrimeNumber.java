package lesson_5.exercises;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Collection;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Collection<Integer> primeFactors = new LinkedHashSet<>();
        boolean isPrime = true;
        int factor;

        System.out.println("Type in a number");
        final int Prime = input.nextInt();

        factor = primeCheck(Prime);
        if (factor != 0) {
            isPrime = false;
            primeFactors.add(factor);
            factorCheck(primeFactors, Prime, factor);
        }

        System.out.println(Prime + " is " + (isPrime ? "" : "not") + " a prime number.");
        if (primeFactors.size() > 0) {
            System.out.println(primeFactors + " are the prime factors.");
        }
    }

    //Returns lowest prime factor
    private static int primeCheck(int prime) {
        for (int isDivisible = 2; isDivisible < prime; isDivisible++) {
            if (prime % isDivisible == 0) {
                return isDivisible;
            }
        }
        return 0;
    }

    //returns all prime factors
    private static Collection<Integer> factorCheck(Collection<Integer> primeFactors, int prime, int factor) {
        //other factor (e.g. 2*50 = 100 >> 100/2 = 50)
        int otherFactor = prime / factor;
        //lowest prime 2 of 50 >> 2*2*25 >> 2*2*5*5
        int lowerFactor = primeCheck(otherFactor);
        if (lowerFactor != 0) {
            primeFactors.add(lowerFactor);
            factorCheck(primeFactors, otherFactor, lowerFactor);
        } else {
            primeFactors.add(otherFactor);
        }


        return primeFactors;
    }
}
