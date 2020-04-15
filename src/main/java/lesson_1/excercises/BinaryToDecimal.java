package lesson_1.excercises;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Put in a binary:");
        int binary = input.nextInt();
        int result = getDecimal(binary);
        System.out.println("The decimal equivalent of "+binary+" is "+result);
    }

    private static int getDecimal(int binary) {
        int decimal = 0;
        int n = 0;
        while (true) {
            if (binary == 0) {
                break;
            } else {
                int temporary = binary % 10;
                decimal += temporary * Math.pow(2, n);
                binary = binary / 10;
                n++;
            }
        }
        return decimal;
    }

}
