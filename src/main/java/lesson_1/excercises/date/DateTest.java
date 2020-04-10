package lesson_1.excercises.date;

import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    Date givenDate = new Date();

        System.out.println("Please type the day in: ");
        givenDate.setDay(input.nextInt());
        System.out.println("Please type the month in: ");
        givenDate.setMonth(input.nextInt());
        System.out.println("Please type the year in:");
        givenDate.setYear(input.nextInt());

        int givenDay = givenDate.getDay();
        System.out.println("The given day is: "+givenDay);
        int givenMonth = givenDate.getMonth();
        System.out.println("The given month is: "+givenMonth);
        int givenYear = givenDate.getYear();
        System.out.println("The given year is: "+givenYear);

        String last = givenDate.displayDate();
        System.out.println("The date you gave is: "+ last);
    }
}
