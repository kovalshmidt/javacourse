package lesson_6.exercises;

/**
 * Write a program that inputs a sentence from the user (assume no punctuation), then determines and
 * displays the unique words in alphabetical order. Treat uppercase and lowercase letters the same. Make
 * use of streams.
 */

import java.util.*;
import java.util.stream.Collectors;

public class WordList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Type a sentence:");
        String sentence = input.nextLine();
        String[] sentence2 = sentence.split(" ");
        ArrayList<String> words = new ArrayList<>();

        Collections.addAll(words, sentence2);

        System.out.println(words);

       List<String> sortedList = words.stream().sorted().collect(Collectors.toList());

       sortedList.forEach(System.out::println);

    }
}
