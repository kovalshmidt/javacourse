package lesson_5.exercises;

import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;

public class NameList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Collection<String> firstName = new HashSet<>();
        System.out.println("type in names or 'stop' to finish:");
        for (; ; ) {
            String name = input.next();
            if (name.equals("stop")) {
                break;
            } else {
                firstName.add(name);
            }
        }
        System.out.println("Check for names:");
        String check = input.next();
        boolean checkEm = false;
        for (String names : firstName) {
            if (check.equals(names)) {
                checkEm = true;
                break;
            }
        }
        System.out.println("The name " + check + (checkEm ? " exists." : " doesn't exist."));
    }
}
