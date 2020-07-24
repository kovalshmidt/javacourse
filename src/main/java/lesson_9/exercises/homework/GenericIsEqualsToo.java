package lesson_9.exercises.homework;

import java.util.Scanner;

/**
 * Write a simple generic version of method isEqualTo that compares its two arguments with the equals method and
 * returns true if they’re equal and false otherwise. Use this generic method in a program that calls isEqualTo with a
 * variety of built-in types, such as Object or Integer. What result do you get when you attempt to run this program?
 */

public class GenericIsEqualsToo {

    public static void main(String[] args) {
        Integer integer1 = 10;
        Integer integer2 = 10;
        Integer integer3 = 11;
        String string1 = "hello";
        String string2 = "goodbye";
        System.out.println("10 is equal to 10: " + isEqualToo(integer1, integer2));
        System.out.println("10 is equal to 11: " + isEqualToo(integer1, integer3));
        System.out.println("10 is equal to 'hello': " + isEqualToo(integer1, string1));
        System.out.println("'hello' is equal to 'goodbye' "+ isEqualToo(string1,string2));
    }

    public static <T,U> boolean isEqualToo(T object1,U object2){
        return object1.equals(object2);
    }
}
