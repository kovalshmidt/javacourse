package lesson_6.exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Write a program that inserts 30 random letters into a List. Perform the following operations and display your results:
 * a) Sort the List in ascending order.
 * b) Sort the List in descending order.
 * c) Display the List in ascending order with duplicates removed.
 */

public class LettersWithoutDuplicates {
    public static void main(String[] args) {

        List<Character> letters = new ArrayList<>();

        for (int l = 1; l <= 30; l++) {
            letters.add(randomLetter());
        }
        System.out.println("Original");
        printLetters(letters);
        System.out.println("No duplicates");
        List<Character> uniqueLetters = getNoDupes(letters);
        printLetters(uniqueLetters);
        System.out.println("Descending");
        List<Character> descending = letters.stream().sorted().collect(Collectors.toList());
        printLetters(descending);
        System.out.println("Ascending");
        List<Character> ascending = descending;
        Collections.reverse(ascending);
        printLetters(ascending);
        System.out.println("Descending, no duplicates");
        descending = getNoDupes(descending);
        Collections.reverse(descending);
        printLetters(descending);
        System.out.println("Ascending, no duplicates");
        ascending = getNoDupes(ascending);
        printLetters(ascending);
    }

    private static void printLetters(List<Character> letterList) {
        letterList.forEach(System.out::print);
        System.out.println();
    }

    public static List<Character> getNoDupes(List<Character> letterList) {
        return letterList.stream().distinct().collect(Collectors.toList());
    }

    public static char randomLetter() {
        Random r = new Random();
        return (char) (r.nextInt(26) + 'a');
    }
}
