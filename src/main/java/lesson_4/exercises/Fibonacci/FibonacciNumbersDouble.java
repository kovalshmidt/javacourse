package lesson_4.exercises.Fibonacci;


import java.util.Scanner;

public class FibonacciNumbersDouble {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number;
        System.out.println("Type in the wanted nth Fibonacci number");
        number = input.nextInt();
        System.out.println("The number is:");
        System.out.println(FibonacciResult(number));
        //highest Number: 1477 >> 1.3069892237633987E308 before infinity

    }
    public static double FibonacciResult(double number){
        double previous1 = 0;
        double previous2 = 1;
        double result = 1;
        for (int i = 0;i<= number-3;i++){
            result = previous1 + previous2;
            previous1 = previous2;
            previous2 = result;
        }
            if (number == 1){
                return 0;
            }
                else{
         return result;}
    }
}
