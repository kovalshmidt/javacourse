package lesson_5.exercises.EulerProject;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * <p>
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */

import java.util.Collection;
import java.util.LinkedHashSet;

public class ThreeOrFiveMultiples {
    public static void main(String[] args) {
        Collection<Integer> multiples = new LinkedHashSet<>();
        int sum = 0;


        for (int i = 3; i < 1000; i++) {
            if ((i % 3 == 0) || (i % 5 == 0)) {
                multiples.add(i);
                sum += i;
            }
        }
        System.out.println("Sum is " + sum);
        System.out.println("Multiples are " + multiples);
    }
}

