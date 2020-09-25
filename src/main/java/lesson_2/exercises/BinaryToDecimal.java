package lesson_2.exercises;

import java.util.Scanner;

import static utils.Utility.Number_Test.getDecimal;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Put in a binary:");
        int binary = input.nextInt();
        int result = getDecimal(binary);
        System.out.println("The decimal equivalent of " + binary + " is " + result);
    }


}
