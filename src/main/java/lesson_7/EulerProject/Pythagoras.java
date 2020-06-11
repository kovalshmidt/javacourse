package lesson_7.EulerProject;

/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 *
 * a2 + b2 = c2
 * For example, 32 + 42 = 9 + 16 = 25 = 52.
 *
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */

public class Pythagoras {
    public static void main(String[] args) {
        int numberOne, numberTwo = 0, numberThree = 0;
        int pythagoras = 1000;
        int product = 0;
        boolean found = false;
        for (numberOne = 1; numberOne < pythagoras / 3; numberOne++) {
            for (numberTwo = numberOne; numberTwo < pythagoras / 2; numberTwo++) {
                numberThree = pythagoras - numberOne - numberTwo;

                if (numberOne * numberOne + numberTwo * numberTwo == numberThree * numberThree) {
                    product = numberOne * numberTwo * numberThree;
                    found = true;
                    break;
                }
            }

            if (found) {
                break;
            }
        }
        System.out.println(numberOne);
        System.out.println(numberTwo);
        System.out.println(numberThree);
        System.out.println(product);
    }
}
