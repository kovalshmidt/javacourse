package lesson_5.exercises;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;


/**
 * Write a program that inserts 25 random integers from 0 to 100 in order into a LinkedList object. The
 * program should sort the elements, then calculate the sum of the elements and the floating-point
 * average of the elements.
 */


public class LinkedListSortedOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Integer> numberOrder = new LinkedList<>();
        int sum = 0;
        System.out.println("How many numbers do you want to generate:");
        final int Length = input.nextInt();
        for (int i = 1; i <= Length; i++) {
            numberOrder.add(RandomNumber(100));
        }
        Collections.sort(numberOrder);
        System.out.println(numberOrder);
        for (Integer number : numberOrder) {
            sum += number;
        }
        final double sumDouble = sum,lengthDouble = numberOrder.size();
        double average = sumDouble / lengthDouble;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }


    public static int RandomNumber(int upperLimit) {
        return new Random().nextInt(upperLimit + 1);
    }
}
