package lesson_5.exercises;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class ReverseList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<String> characterList = new LinkedList<>();
        LinkedList<String> reverseList;

        System.out.println("Type in 10 words:");
        for(int i = 1;i<=10;i++){
            characterList.add(input.next());
        }
        System.out.println(characterList);
        System.out.println();
        reverseList = characterList;
        Collections.reverse(reverseList);
        System.out.println(reverseList);
    }
}
