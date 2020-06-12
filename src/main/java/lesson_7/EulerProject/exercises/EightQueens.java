package lesson_7.EulerProject.exercises;

import java.util.Random;

public class EightQueens {
    private final int N = 8;
    private Random rand = new Random();
    private int[][] board = new int[N][N];

    public void corpo() {
        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board[row].length; column++)
                board[row][column] = 0;
        }
        display();
        run();
        display();
    }

    public void run() {
        for (int count = 0; count < N; count++) {
            int x, y;
            x = rand.nextInt(N);
            y = rand.nextInt(N);

            if ((board[x][y]) == 0) {

                for (int row = 0; row < board[x].length; row++) {
                    board[row][y] = 1;
                }
                for (int column = 0; column < board[y].length; column++) {
                    board[x][column] = 1;
                }

                board[x][y] = N;
            } else
                count--;
        }
    }

    public void display() {
        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board[row].length; column++)
                System.out.printf("%2d", board[row][column]);
            System.out.println();
        }
        System.out.println();

    }

}

