package lesson_5.exercises.EulerProject;

import utils.Utility;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class HighestPalindrome {
    public static void main(String[] args) {
        LinkedList<Integer> palindromes = new LinkedList<>();
        LinkedList<Integer> factorOne = new LinkedList<>();
        LinkedList<Integer> factorTwo = new LinkedList<>();
        int product;
        final int order;

        for (int i = 100; i <= 999; i++) {
            for (int j = 100; j <= 999; j++) {
                product = i * j;
                if (Utility.Boolean_Tests.isPalindrome(product)) {

                    palindromes.add(product);
                    factorOne.add(i);
                    factorTwo.add(j);
                }
            }
        }
        final int MaxPalindrome = Collections.max(palindromes);
        System.out.println("Highest Palindrome: " + MaxPalindrome);
        order = palindromes.indexOf(MaxPalindrome);
        System.out.println("Factors: " + factorOne.get(order) + " and " + factorTwo.get(order));
    }
}
