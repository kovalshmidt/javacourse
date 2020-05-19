package lesson_4.exercises;

import java.util.Scanner;

public class HugeInteger {
    public static void main(String[] args) {
        int[] hugeInt = new int[40];
        StringBuilder reverseNumber = new StringBuilder();
        boolean end = false;
        Scanner input = new Scanner(System.in);

        System.out.println("Type in a 40 digit number:");
        Parse(hugeInt, input);

        System.out.println("What do you want to do?");
        boolean correct = false;
        String action = input.next();
        do {
            switch (action) {
                case "add":
                    System.out.println("Please choose a digit:");
                    Addition(hugeInt, input, false);
                    break;
                case "subtract":
                    Subtraction(hugeInt, input, false);
                    break;

                case "compare":
                    //boolean isEqualTo = false, isNotEqualTo = false, isGreaterThan = false, isLessThan = false, isGreaterThanOrEqualTo = false, isLessThanOrEqualTo = false;
                    System.out.println("Choose two digits:");
                    Compare(input, correct, hugeInt);
                    break;
                case "print":
                    Print(hugeInt);
                    break;
                default:
                    System.out.println("Unknown action. Please type in a valid action");
            }
            System.out.println("Anything else y/n");
            String finalize = input.next();
            if (finalize.equals("n")) {
                end = true;
            } else {
                action = finalize;
            }
        } while (!end);
    }

    private static void Print(int[] hugeInt) {
        for (int i = 0; i <= 39; i++) {
            System.out.print(hugeInt[i] + " ");
        }
        System.out.println();
    }

    private static void Compare(Scanner input, boolean correct, int[] hugeInt) {
        do {
            int digit1 = input.nextInt() - 1;
            System.out.println("and");
            int digit2 = input.nextInt() - 1;
            if ((digit1 <= 39) & (digit2 <= 39)) {
                if (isEqualTo(hugeInt[digit1], hugeInt[digit2])) {
                    System.out.println(hugeInt[digit1] + " is equal to " + hugeInt[digit2]);
                }
                if (isNotEqualTo(hugeInt[digit1], hugeInt[digit2])) {
                    System.out.println(hugeInt[digit1] + " is not equal than " + hugeInt[digit2]);
                }
                if (isGreaterThan(hugeInt[digit1], hugeInt[digit2])) {
                    System.out.println(hugeInt[digit1] + " is greater than " + hugeInt[digit2]);
                }
                if (isLessThan(hugeInt[digit1], hugeInt[digit2])) {
                    System.out.println(hugeInt[digit1] + " is less than " + hugeInt[digit2]);
                }
                if (isGreaterOrEqualTo(hugeInt[digit1], hugeInt[digit2])) {
                    System.out.println(hugeInt[digit1] + " is greater than or equal to " + hugeInt[digit2]);
                }
                if (isLessOrEqualTo(hugeInt[digit1], hugeInt[digit2])) {
                    System.out.println(hugeInt[digit1] + " is less than or equal to " + hugeInt[digit2]);
                }

                correct = true;
            } else {
                System.out.println("Two valid digits!");
            }
        } while (!correct);
    }

    private static boolean isEqualTo(int a, int b) {
        return (a == b);
    }

    private static boolean isNotEqualTo(int a, int b) {
        return (a != b);
    }

    private static boolean isGreaterThan(int a, int b) {
        return (a > b);
    }

    private static boolean isLessThan(int a, int b) {
        return (a < b);
    }

    private static boolean isGreaterOrEqualTo(int a, int b) {
        return (a >= b);
    }

    private static boolean isLessOrEqualTo(int a, int b) {
        return (a <= b);
    }

    private static void Addition(int[] hugeInt, Scanner input, boolean correct) {
        do {
            int digit = input.nextInt() - 1;
            System.out.println("and how much you want to add:");
            int addition = input.nextInt();
            if (digit <= 39) {
                hugeInt[digit] += addition;
                System.out.println("Result: " + hugeInt[digit]);
                correct = true;
            } else {
                System.out.println("A digit between 1 and 40");
            }
        } while (!correct);
    }

    private static void Subtraction(int[] hugeInt, Scanner input, boolean correct) {
        do {
            int digit = input.nextInt() - 1;
            System.out.println("and how much you want to subtract:");
            int subtraction = input.nextInt();
            if (digit <= 39) {
                hugeInt[digit] -= subtraction;
                System.out.println("Result: " + hugeInt[digit]);
                correct = true;
            } else {
                System.out.println("A digit between 1 and 40");
            }
        } while (!correct);
    }

    private static void Parse(int[] hugeInt, Scanner input) {
        String provisional = input.next();
        for (int i = 0; i < provisional.length(); i++) {
            int j = Character.digit(provisional.charAt(i), 10);
            Math.pow(j, 2);

            hugeInt[i] = j;
        }
    }
}
