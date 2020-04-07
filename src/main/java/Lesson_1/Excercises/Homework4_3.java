package Lesson_1.Excercises;

import java.util.Scanner;

public class Homework4_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1, number2, number3;
        int sum, average, product, smallest = 0, largest = 0;

        System.out.println("The first number is:");
        number1 = input.nextInt(); //Input first Int
        System.out.println("The second number is:");
        number2 = input.nextInt(); //Input second Int
        System.out.println("The third number is:");
        number3 = input.nextInt();

        //Calculations
        sum = number1 + number2 + number3;
        average = (number1 + number2 + number3) / 3;
        product = number1 * number2 * number3;
        largest = getLargest(number1, number2, number3);
        smallest = getSmallest(number1, number2, number3);

        System.out.println("The sum is " + sum);
        System.out.println("The average is " + average);
        System.out.println("The product is " + product);
        System.out.println("The smallest number is " + smallest + " and the largest number is " + largest);

    }

    private static int getSmallest(int a, int b, int c) {
        int smallest = a;

        if(b < smallest) {
             smallest = b;
        }

        if(c < smallest) {
            smallest = c;
        }

        return smallest;
    }

    private static int getLargest(int a, int b, int c) {
        int largest = a;

        if(b > largest) {
            largest = b;
        }

        if(c > largest) {
            largest = c;
        }

        return largest;
    }
}
