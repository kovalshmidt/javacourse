package lesson_3.exercises;

/**
 * A small airline has just purchased a computer for its new automated reservations system.
 * You’ve been asked to develop the new system. You’re to write an application to assign seats
 * on each flight of the airline’s only plane (capacity: 10 seats).
 * Your application should display the following alternatives: Please type 1 for First Class and Please type 2 for Economy.
 * If the user types 1, your application should assign a seat in the
 * first- class section (seats 1–5). If the user types 2, your application should assign a seat in
 * the economy section (seats 6–10). Your application should then display a boarding pass
 * indicating the person’s seat number and whether it’s in the first-class or economy section of
 * the plane.
 * Use a one-dimensional array of primitive type boolean to represent the seating chart of the
 * plane. Initialize all the elements of the array to false to indicate that all the seats are empty.
 * As each seat is assigned, set the corresponding element of the array to true to indicate that
 * the seat is no longer available.
 * Your application should never assign a seat that has already been assigned.
 * When the economy section is full, your application should ask the person if it’s acceptable to be placed
 * in the first-class section (and vice versa). If yes, make the appropriate seat assignment. If no,
 * display the message "Next flight leaves in 3 hours."
 */

import java.util.Scanner;

public class AirlineBoarding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean[] seats = new boolean[10];
        boolean seatsAvailable;
        boolean skip, error;
        String wish, answer;
        int targetClass = 0;

        for (int i = 0; i <= 9; i++) {
            seats[i] = false;
        }
        do {
            error = false;
            skip = false;
            int target = 0;
            seatsAvailable = false;
            System.out.println("Welcome customer, do you want to fly in [1] First Class or in [2] Economy Class?");
            targetClass = input.nextInt();
            switch (targetClass) {
                case 1:
                    answer = "First";
                    break;
                case 2:
                    answer = "Economy";
                    break;
                default:
                    answer = "nil";
                    System.out.println("Unclear answer. Please type in 1 for First Class or 2 for Economy Class!");
                    System.out.println();
                    error = true;
            }
            if (answer.equals("First")) {
                wish = answer;
                target = getTarget(seats, target, 0, 4);
                if (target == 0) {
                    System.out.println("No seats were available in First Class. Switch to Economy Class? yes/no");
                    if (input.next().equals("yes")) {
                        wish = "Economy";
                        target = getTarget(seats, target, 5, 9);
                        displayBoardCard(wish, target);
                    } else {
                        skip = true;
                    }
                } else {
                    displayBoardCard(wish, target);
                }
            }

            if (answer.equals("Economy")) {
                wish = answer;
                target = getTarget(seats, target, 5, 9);
                if (target == 0) {
                    System.out.println("No seats were available in Economy Class. Switch to First Class? yes/no");
                    if (input.next().equals("yes")) {
                        wish = "First";
                        target = getTarget(seats, target, 0, 4);
                        displayBoardCard(wish, target);
                    } else {
                        skip = true;
                    }
                } else {
                    displayBoardCard(wish, target);
                }
            }
            if (!error) {
                if (!skip) {
                    System.out.println();
                    System.out.println("Enjoy your flight!");
                    System.out.println();
                } else {
                    System.out.println("Next flight leaves in 3 hours");
                    System.out.println();
                }
            }
            for (int i = 0; i <= 9; i++) {
                if (!seats[i]) {
                    seatsAvailable = true;
                    break;
                }
            }
        } while (seatsAvailable);
        System.out.println("We must inform you that the flight is full and that you have to wait for the next flight in 3 hours");
    }

    private static void displayBoardCard(String wish, int target) {
        System.out.println(">>>>>>>>>>>>>>>>>>>Ross Airways Board card<<<<<<<<<<<<<<<<<<<");
        System.out.println("*************************************************************");
        System.out.println("Seat number: " + target + "||" + wish + " Class");
        System.out.println("Enjoy your flight with Ross Airways!");
        System.out.println("*************************************************************");
        System.out.println(">>>>>>>>>>>>>Lost tickets will not be replaced!!<<<<<<<<<<<<<");
    }

    private static int getTarget(boolean[] seats, int target, int i2, int i3) {
        for (int f = i2; f <= i3; f++) {
            if (!seats[f]) {
                seats[f] = true;
                target = f + 1;
                break;
            }
        }
        return target;
    }
}
