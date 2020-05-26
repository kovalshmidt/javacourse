package lesson_2.exercises;

import org.apache.commons.lang3.StringUtils;

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
        int number = 0;
        String inputNumber;
        boolean palindrome,error = false;
            System.out.println("Enter an integer:");
        do {
            inputNumber = input.nextLine();
            if (StringUtils.isNumeric(inputNumber)) {
                number = Integer.parseInt(inputNumber);
                palindrome = isPalindrome(number);
                System.out.println("The number is " + (palindrome ? "" : "not ") + "a Palindrome");
            } else {
                System.out.println("Please type in a number");
                error = true;
            }
        }while(error);
    }
}
