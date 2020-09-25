package lesson_13;

/**
 * Write a program that inputs a sentence from the user (assume no punctuation), then determines and displays the
 * unique words in alphabetical order. Treat uppercase and lowercase letters the same.
 * Use Java 8 functionalities
 */

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateWordRemoval {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please type in a sentence with no punctuation:");
        String sentence = input.nextLine().toLowerCase();

        Arrays.stream(sentence.split(" ")).distinct().forEach(System.out::println);

    }
}
