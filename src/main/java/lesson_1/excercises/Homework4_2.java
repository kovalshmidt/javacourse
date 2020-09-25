package lesson_1.excercises;

import java.util.Scanner;

public class Homework4_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1, number2;
        int biggerOne;
        System.out.println("The first number is:");
        number1 = input.nextInt(); //Input first Int
        System.out.println("The second number is:");
        number2 = input.nextInt(); //Input second Int
        if (number1 > number2)
            System.out.println(number1 + " is bigger then " + number2);
        if (number1 < number2)
            System.out.println(number1 + " is smaller then " + number2);
        if (number1 == number2)
            System.out.println("These numbers are equal");
    }
}
