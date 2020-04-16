package lesson_2.exercises;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nmb;
        StringBuilder rev= new StringBuilder();
        boolean not5 = true;
        boolean palindrome = false;
        System.out.println("Enter a 5-digit integer:");
        do {
            nmb = String.valueOf(input.nextInt());
            if (nmb.length() == 5){
                not5 = false;
                for (int count = 4; count >= 0;count--){
                   rev.append(nmb.charAt(count));
                }
            }else{
                System.out.println("Please put in a 5-digit integer.");
            }
        } while (not5);
        System.out.println(rev);
        if (nmb.equals(rev.toString())){
            System.out.println("==");
            palindrome = true;
        }else{
            System.out.println("=/=");
        }
        System.out.println(nmb);

        if (palindrome) {
            System.out.println("The integer is a Palindrome");
        }else {
            System.out.println("The integer is  not a Palindrome");
        }
    }
}
