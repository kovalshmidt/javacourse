package lesson_1.excercises;

import java.util.Scanner;

public class Asterisk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int squareSizeGoal;
        int topBottom = 0, middleOuter = 0, middle = 0;
        System.out.println("Please type in the size of the square");
        squareSizeGoal = input.nextInt();
        //topBottom line
        topBottom = bounderyCreation(squareSizeGoal, topBottom);
        //middle Lines
        middleLines(squareSizeGoal, middleOuter, middle);

        //bottom Line
        topBottom = bounderyCreation(squareSizeGoal, topBottom);
    }

    private static void middleLines(int squareSizeGoal, int middleOuter , int middle) {
        System.out.println("");
        do {
            System.out.print("*  ");
            do {
                System.out.print("   ");
                middle++;
            } while (middle < squareSizeGoal - 2);
            middle = 0;
            middleOuter++;
            System.out.println("*  ");
        } while (middleOuter < squareSizeGoal - 2);
    }

    private static int bounderyCreation(int squareSizeGoal, int topBottom) {
        do {
            System.out.print("*  ");

            topBottom++;
        } while (topBottom < squareSizeGoal);
        topBottom = 0;
        return topBottom;
    }
}
