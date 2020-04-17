package utils;

public class Utility {
    public static boolean isPalindrome(int number) {
        StringBuilder reverseNumber = new StringBuilder();
        String letter = String.valueOf(number);
        for (int count = letter.length() - 1; count >= 0; count--) {
            reverseNumber.append(letter.charAt(count));
        }
        //return reverseNumber.toString().equals(letter);
        return true;
    }


    public static int getDecimal(int binary) {
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


    public static int[] encrypt(int number) {
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
        return digit;
    }


    public static int[] decrypt(int number) {
        int[] digit = new int[4];
        for (int i = 0; i <= 3; i++) {
            digit[i] = (int) (number % Math.pow(10, (i + 1)) / Math.pow(10, i));
            digit[i] += 10;
            digit[i] -= 7;
            if (digit[i] > 9) {
                digit[i] -= 10;
            }
        }
        int digitSwitch;
        for (int x = 0; x <= 1; x++) {
            digitSwitch = digit[x];
            digit[x] = digit[2 + x];
            digit[2 + x] = digitSwitch;
        }
        return digit;
    }
}
