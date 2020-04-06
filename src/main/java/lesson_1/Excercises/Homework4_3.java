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
        if ((number1 < number2) && (number1 < number3)) {
            smallest = number1;
            if (number2 < number3)
                largest = number3;
            if (number2 > number3)
                largest = number2;
        }
        if ((number2 < number1) && (number2 < number3)) {
            smallest = number2;
            if (number1 < number3)
                largest = number3;
            if (number1 > number3)
                largest = number1;
        }
        if ((number3 < number2) && (number3 < number1)) {
            smallest = number3;
            if (number1 < number2)
                largest = number2;
            if (number1 > number2)
                largest = number1;
        }
        //Number1 == Number2
        if ((number1 == number2) && (number1 < number3))
            smallest = number2;
        if ((number1 == number2) && (number1 > number3))
            largest = number2;
        //Number1 == Number 3
        if ((number1 == number3) && (number1 < number2))
            smallest = number3;
        if ((number1 == number3) && (number1 > number2))
            largest = number3;
        //Number2 == 3
        if ((number2 == number3) && (number2 < number1))
            smallest = number3;
        if ((number2 == number3) && (number2 > number1))
            largest = number3;

        //All equal
        if ((number1 == number2)&&(number2 == number3)){
            largest = number1;
            smallest = number3;
        }
        System.out.println("The sumn is " + sum);
        System.out.println("The average is " + average);
        System.out.println("The product is " + product);
        System.out.println("The smallest number is " + smallest + " and the largest number is " + largest);

    }
}
