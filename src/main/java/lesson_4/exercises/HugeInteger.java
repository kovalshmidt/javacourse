package lesson_4.exercises;

import lombok.ToString;

import java.util.Scanner;

public class HugeInteger {
    public static void main(String[] args) {
        int[] hugeInt = new int[40];
        StringBuilder reverseNumber = new StringBuilder();
        boolean end = false;
        Scanner input = new Scanner(System.in);

        System.out.println("Type in a 40 digit number:");
        Parse(hugeInt, reverseNumber, false, input);

        System.out.println("What do you want to do?");
        do {
            boolean correct = false;
            String action = input.next();
            switch (action) {
                case "add":
                    System.out.println("Please choose a digit:");
                    Addition(hugeInt, input, false);
                    break;
                case "subtract":
                    Subtraction(hugeInt, input, false);
                    break;

                case "compare":
                    boolean isEqualTo = false, isNotEqualTo = false, isGreaterThan = false, isLessThan = false, isGreaterThanOrEqualTo = false, isLessThanOrEqualTo = false;
                    System.out.println("Choose two digits:");
                    Compare(input, correct);
                    break;
                case "print":
                    Print(hugeInt);
                    break;
                default:
                    System.out.println("Unknown action. Please type in a valid action");
            }
            System.out.println("Anything else y/n");
            if (input.next().equals("n")) {
                end = true;
            }
        } while (!end);
    }

    private static void Print(int[] hugeInt) {
        for (int i = 0;i<=39;i++){
            System.out.print(hugeInt[i]+" ");
        }
        System.out.println();
    }

    private static void Compare(Scanner input, boolean correct) {
        boolean isGreaterThan;
        boolean isGreaterThanOrEqualTo;
        boolean isLessThan;
        boolean isLessThanOrEqualTo;
        boolean isEqualTo;
        boolean isNotEqualTo;
        do {
            int digit1 = input.nextInt() - 1;
            System.out.println("and");
            int digit2 = input.nextInt() - 1;
            if ((digit1 <= 39) & (digit2 <= 39)) {
                IsGreaterThanOrEqualTo(digit1 >= digit2, digit1 > digit2);
                IsLessThanOrEqualTo(digit1 <= digit2, digit1 < digit2);
                IsEqualTo(digit1, digit2);

                correct = true;
            }else {
                System.out.println("Two valid digits!");
            }
        } while (!correct);
    }

    private static void IsEqualTo(int digit1, int digit2) {
        boolean isEqualTo = false;
        boolean isNotEqualTo = false;
        if (digit1 == digit2) {
            isEqualTo = true;
        } else {
            isNotEqualTo = true;
        }
    }

    private static void IsLessThanOrEqualTo(boolean b, boolean b2) {
        boolean isLessThan;
        boolean isLessThanOrEqualTo;
        if (b) {
            if (b2) {
                isLessThan = true;
            }
            isLessThanOrEqualTo = true;
        }
    }

    private static void IsGreaterThanOrEqualTo(boolean b, boolean b2) {
        boolean isGreaterThan = false;
        boolean isGreaterThanOrEqualTo;
        if (b) {
            if (b2) {
                isGreaterThan = true;
            }
            isGreaterThanOrEqualTo = true;
        }
    }

    private static void Addition(int[] hugeInt, Scanner input, boolean correct) {
        do {
            int digit = input.nextInt() - 1;
            System.out.println("and how much you want to add:");
            int addition = input.nextInt();
            if (digit <= 39) {
                hugeInt[digit] += addition;
                System.out.println("Result: "+ hugeInt[digit]);
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
                System.out.println("Result: "+ hugeInt[digit]);
                correct = true;
            } else {
                System.out.println("A digit between 1 and 40");
            }
        } while (!correct);
    }

    private static void Parse(int[] hugeInt, StringBuilder reverseNumber, boolean forty, Scanner input) {
        String provisional = input.next();
        for (int count = provisional.length() - 1; count >= 0; count--) {
            reverseNumber.append(provisional.charAt(count));
        }
        String[] numbers = reverseNumber.toString().split(" ");
        for(String number: numbers){
            int i = 0;
            //hugeInt[i].add(Integer.valueOf(number));
            i++;
        }
    }
}
