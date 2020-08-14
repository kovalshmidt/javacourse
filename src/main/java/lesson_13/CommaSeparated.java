package lesson_13;

/**
 * Write a method that returns a comma-separated string based on a given list of integers. Each element should be
 * preceded by the letter 'e' if the number is even, and preceded by the letter 'o' if the number is odd. For example,
 * if the input list is (3,44), the output should be 'o3,e44'.
 * Use Java 8 Functionalities
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CommaSeparated {
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
       // System.out.println("Type in comma_separated numbers:");
        //String allNumbers = input.nextLine();

        List<Integer> integers = Arrays.asList(1, 5, 6, 32, 53643, 3, 23, 54, 65);

        // filter() Predicate.test() test accepts a parameter and returns boolean
        //List<Integer> evenNumbers = integers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        //List<Integer> oddNumbers = integers.stream().filter(x -> x % 2 != 0).collect(Collectors.toList());

        // map() Function.apply)_ accepts a parameter of one type and returns a parametr of another type
        //List<String> stringList = integers.stream().map(String::valueOf).collect(Collectors.toList());

        // forEach() Consumer.accept() accepts a parameter but does not return a value
       // integers.forEach(System.out::println);

        String numbers = integers.stream().map(x -> x % 2 == 0 ? "e" + x : "o" + x).collect(Collectors.joining(","));
        System.out.println(numbers);
    }
}
