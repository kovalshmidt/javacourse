package utils;

public class Utility {

    public static class Temperature {

        public static double toCelsius(double fahrenheit) {
            return 5.0 / 9.0 * (fahrenheit - 32);
        }

        public static double toFahrenheit(double celsius) {
            return 9.0 / 5.0 * celsius + 32;
        }
    }


    public static class Boolean_Tests {

        public static boolean isPrime(int number) {
            boolean prime = true;
            if (number == 0 | number == 1) {
                prime = false;
            } else {
                for (int i = 2; i < number; i++) {
                    if (number % i == 0) {
                        prime = false;
                        break;
                    }
                }
            }
            return prime;
        }


        public static boolean isPalindrome(int number) {
            StringBuilder reverseNumber = new StringBuilder();
            String letter = String.valueOf(number);
            for (int count = letter.length() - 1; count >= 0; count--) {
                reverseNumber.append(letter.charAt(count));
            }
            return reverseNumber.toString().equals(letter);
        }

        public static boolean isEven(int nmb) {
            return nmb % 2 == 0;
        }

        public static boolean isMultiple(int nmb1, int nmb2) {
            return nmb2 % nmb1 == 0;
        }

    }

    public static class Number_Test {

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

        public static double circleArea(double radius) {
            final double PI = 3.1415926535;

            return 2 * PI * radius;
        }

    }

    public static class QuotientsAndDigits {
        public static int Quotient(int number1, int number2) {
            return number1 / number2;
        }

        public static int Remainder(int number1, int number2) {
            return number1 % number2;
        }

        public static String Digits(int number) {
            StringBuilder finalResult = new StringBuilder();
            String step = Integer.toString(number);
            int[] digit = new int[step.length()];
            for (int i = 0; i < step.length(); i++) {
                digit[i] = (int) (number % Math.pow(10, (i + 1)) / Math.pow(10, i));
            }
            for (int i = step.length() - 1; i >= 0; i--) {
                if (i == 0) {
                    finalResult.append(digit[i]);
                } else {
                    finalResult.append(digit[i]).append("  ");
                }
            }
            return finalResult.toString();
        }
    }


    public static class Cryptography {
        public static int encrypt(int number) {
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
            String step = Integer.toString(digit[3]) + digit[2] + digit[1] + digit[0];
            return Integer.parseInt(step);
        }


        public static int decrypt(int number) {
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
            String step = Integer.toString(digit[3]) + digit[2] + digit[1] + digit[0];
            return Integer.parseInt(step);
        }
    }
}
