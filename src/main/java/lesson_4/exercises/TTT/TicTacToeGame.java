package lesson_4.exercises.TTT;

import java.util.Scanner;

public class TicTacToeGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TicTacToeField TTTGame = new TicTacToeField();
        int player;
        int yCoordinate, xCoordinate;
        boolean check;

        System.out.println("Type in the coordinate to mark space for you:");

        for (; ; ) {
            if (TTTGame.isFirstPlayer()) {
                player = 1;
            } else {
                player = 2;
            }
            System.out.println("Player " + player);
            System.out.println("Line:");
            yCoordinate = input.nextInt() - 1;
            System.out.println("Column:");
            xCoordinate = input.nextInt() - 1;


            check = TTTGame.setTTTField(yCoordinate, xCoordinate);
            if (!check) {
                System.out.println("Field already taken!");
                TTTGame.switchPlayer();
            } else {
                TTTGame.paint();
                if (TTTGame.firstPlayerWin()) {
                    System.out.println();
                    System.out.println("X wins");
                    break;
                }
                if (TTTGame.secondPlayerWin()) {
                    System.out.println();
                    System.out.println("O wins");
                    break;
                }
            }
            TTTGame.switchPlayer();
        }
    }
}
