package lesson_6.exercises.Euler;

public class SmallestMultiple {
    public static void main(String[] args) {
        int quotient;
        boolean allMultiples;
        for (int number = 20; ; number += 20) {
            allMultiples = true;
            for (int divisor = 1; divisor <= 20; divisor++) {
                if (number % divisor != 0) {
                    allMultiples = false;
                    break;
                }
            }
            if (allMultiples){
                quotient = number;
                break;
            }
        }
        System.out.println("Smallest Multiple is:");
        System.out.println(quotient);
    }
}
