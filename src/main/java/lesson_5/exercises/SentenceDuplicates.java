package lesson_5.exercises;

import sun.security.krb5.internal.crypto.Aes128;

import java.util.*;

public class SentenceDuplicates {
    public static void main(String[] args) {
        System.out.println("Type a sentence:");
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        String[] sentence2 = sentence.split(" ");
        ArrayList<String> words = new ArrayList<String>();

        for (int sentenceLength = 0; sentenceLength < sentence2.length; sentenceLength++) {
            words.add(sentence2[sentenceLength]);
        }
            System.out.println(words);

        Set<String> unique = new HashSet<String>(words);
        for (String key : unique){
            System.out.println(key+": "+ Collections.frequency(words,key));
        }
    }
}
