package lesson_5.exercises;

import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Collection<Integer> primeFactors = new LinkedHashSet<>();
        boolean isPrime = true;
        int factor;

        //Type in 600851475143
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
            System.out.println("Largest prime factor: " + Collections.max(primeFactors));
        }
    }

    //Returns lowest prime factor
    public static int primeCheck(int prime) {
        for (int isDivisible = 2; isDivisible < prime; isDivisible++) {
            if (prime % isDivisible == 0) {
                return isDivisible;
            }
        }
        return 0;
    }

    //returns all prime factors
    private static void factorCheck(Collection<Integer> primeFactors, int prime, int factor) {
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
    }
}
