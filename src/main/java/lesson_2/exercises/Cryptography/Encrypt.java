package lesson_2.exercises.Cryptography;

import java.util.Scanner;

public class Encrypt {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Four Digit Integer:");
        number = input.nextInt();
        int[] digit = new int[4];
        for (int i = 0; i <= 3; i++) {
            digit[i] = (int) (number % Math.pow(10, (i + 1)) / Math.pow(10, i));
            digit[i] += 7;
            digit[i] %= 10;
        }
        int digitSwitch;
        for (int x = 0; x <= 1; x++) {
            digitSwitch = digit[x];
            digit[x] = digit[2 + x];
            digit[2 + x] = digitSwitch;
        }
        for (int i = 3; i >= 0; i--) System.out.print(digit[i]+"");
    }
}


