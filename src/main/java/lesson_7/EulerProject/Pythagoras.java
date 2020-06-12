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
        int a, b = 0, c = 0;
        int pythagoras = 1000;
        int product = 0;
        boolean found = false;
        for (a = 1; a < pythagoras / 3; a++) {
            for (b = a; b < pythagoras / 2; b++) {
                c = pythagoras - a - b;

                if (a * a + b * b == c * c) {
                    product = a * b * c;
                    found = true;
                    break;
                }
            }

            if (found) {
                break;
            }
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(product);
    }
}
