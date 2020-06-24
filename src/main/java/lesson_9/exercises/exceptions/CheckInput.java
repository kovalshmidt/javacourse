package lesson_9.exercises.exceptions;


import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;

            System.out.println("Type in a number:");
            isError(input);

    }

    private static void isError(Scanner input) {
        int number;
        try {
            number = input.nextInt();
            System.out.println(number);
        } catch (InputMismatchException ex) {
            input.next();
            System.out.println("You inserted a String");
            isError(input);
        }
    }
}
