package lesson_7.EulerProject;

public class Pythagoras {
    public static void main(String[] args) {
        int numberOne = 0, numberTwo = 0, numberThree = 0;
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
