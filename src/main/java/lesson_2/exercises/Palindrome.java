package lesson_2.exercises;

import java.util.Scanner;

import static utils.Utility.Boolean_Tests.isPalindrome;

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
        int number;
        boolean palindrome;


        System.out.println("Enter an integer:");
        number = input.nextInt();
        palindrome = isPalindrome(number);
        System.out.println("The number is " + (palindrome ? "" : "not ") + "a Palindrome");

    }


}
