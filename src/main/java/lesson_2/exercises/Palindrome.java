package lesson_2.exercises;

import java.util.Scanner;

/**
 * A palindrome is a sequence of characters that reads the same backward as for- ward. For example, each of the following
 * five-digit integers is a palindrome: 12321, 55555, 45554 and 11611. Write an application that reads in a five-digit
 * integer and determines whether it’s a palindrome. If the number is not five digits long, display an error message
 * and allow the user to enter a new value.
 */
public class Palindrome {
    public static void main(String[] args) {

        //Initialize variables
        Scanner input = new Scanner(System.in);
        StringBuilder reversedNumber = new StringBuilder();
        String number;
        boolean notFive = true;
        boolean palindrome;

        //Ask for 5 digit input
        System.out.println("Enter a 5-digit integer:");

        do {
            //Get the digit from the console, transform it to String and save in the variable "number"
            number = String.valueOf(input.nextInt());

            //Check that the input number is composed of 5 digits
            if (number.length() == 5) {
                notFive = false;
                //Loop in reverse through the "number" and copy it into "reversedNumber"
                for (int count = 4; count >= 0; count--) {
                    reversedNumber.append(number.charAt(count));
                }
            } else {
                System.out.println("Please input a 5-digit integer.");
            }
        } while (notFive); //Continue the loop if the number is not 5 digit long

        //Check if the number is a palindrome
        palindrome = number.equals(reversedNumber.toString());

        //Print the result
        System.out.println("The number is " + (palindrome ? "" : "not ") + "a Palindrome");
        System.out.println(reversedNumber + (palindrome ? " == " : " != ") + number);

    }
}
