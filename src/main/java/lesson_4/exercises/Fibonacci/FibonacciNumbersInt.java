package lesson_4.exercises.Fibonacci;


import java.util.Scanner;

public class FibonacciNumbersInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Type in the wanted nth Fibonacci number");
        number = input.nextInt();
        System.out.println("The number is:");
        System.out.println(FibonacciResultInt(number));
        //highest Number: 47 >>1836311903

    }

    public static int FibonacciResultInt(int number) {
        int previous1 = 0;
        int previous2 = 1;
        int result = 1;
        for (int i = 0; i <= number - 3; i++) {
            result = previous1 + previous2;
            previous1 = previous2;
            previous2 = result;
        }
        if (number == 1) {
            return 0;
        } else {
            return result;
        }
    }
}
