package lesson_3.exercises;

/**
 * Use a one-dimensional array to solve the following problem:
 * Write an application that inputs five numbers, each between 10 and 100, inclusive. As each
 * number is read, display it only if it’s not a duplicate of a number already read. Provide for
 * the “worst case,” in which all five numbers are different. Use the smallest possible array to
 * solve this problem. Display the complete set of unique values input after the user enters
 * each new value.
 */

import java.util.Scanner;

public class NoDupes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] number = new int[5];
        boolean duplicate;
        for (int m = 0; m <= 4; m++) {
            number[m] = 0;
        }
        int placeholder;
        System.out.println("Please enter 5  numbers between 10 and 100, duplicates will be deleted:");
        for (int i = 0; i <= 4; i++) {
            placeholder = Integer.parseInt(input.nextLine());
            if ((placeholder >= 10) & (placeholder <= 100)) {
                number[i] = placeholder;
                for (int k = 0; k <= i; k++) {
                    duplicate = false;
                    for (int n = 0; n < k; n++) {
                        if (number[k] == number[n]) {
                            duplicate = true;
                            break;
                        }
                    }
                    System.out.print((duplicate ? "" : number[k] + " "));
                }
                System.out.println();
            } else {
                System.out.println("Between 10 and 100");
                i--;
            }
        }
        System.out.println("The unique numbers are:");
        System.out.println("***************");
        for (int i = 0; i <= 4; i++) {
            duplicate = false;
            for (int n = 0; n < i; n++) {
                if (number[i] == number[n]) {
                    duplicate = true;
                    break;
                }
            }
            System.out.print((duplicate ? "" : number[i] + " "));
        }
        System.out.println();
        System.out.println("***************");
    }
}
