package Lesson_1.Excercises;
//import Scanner class
import java.util.Scanner;

public class Homework4_1 {
    public static void main(String[] args) {
        //enable Scanner
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int sum,product,difference,quotient;
        System.out.println("The first number is:");
        number1 = input.nextInt(); //Input first Int
        System.out.println("The second number is:");
        number2 = input.nextInt(); //Input first Int
        //Calculations
        sum = number1 + number2;
        product = number1 * number2;
        difference = number1 - number2;
        quotient = number1 / number2;
        //Result to user
        System.out.println("The sum is " + sum);
        System.out.println("The product is is " + product);
        System.out.println("The difference is " + difference);
        System.out.println("The quotient is " + quotient);
    }
}
