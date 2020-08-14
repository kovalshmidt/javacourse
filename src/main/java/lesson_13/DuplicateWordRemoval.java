package lesson_13;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateWordRemoval {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please type in a sentence with no punctuation:");
        String sentence = input.nextLine().toLowerCase();
        String[] separatedSentence = sentence.split(" ");
        Collection<String> words = new ArrayList<>(Arrays.asList(separatedSentence));
        words.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);

    }
}
