package lesson_4.exercises.Knights_Run.Heuristic;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class KnightTourHeuristic {
    private int N = 8;
    private int[][] board = new int[8][8];
    private int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
    private int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};
    private final int[][] accessibility = {{2, 3, 4, 4, 4, 4, 3, 2},
            {3, 4, 6, 6, 6, 6, 4, 3},
            {4, 6, 8, 8, 8, 8, 6, 4},
            {4, 6, 8, 8, 8, 8, 6, 4},
            {4, 6, 8, 8, 8, 8, 6, 4},
            {4, 6, 8, 8, 8, 8, 6, 4},
            {3, 4, 6, 6, 6, 6, 4, 3},
            {2, 3, 4, 4, 4, 4, 3, 2}};


    public void body() {
        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board[row].length; column++)
                board[row][column] = -1;
            board[0][0] = 0;
        }
        display();

        if (!step(0, 0, 1)) {
            System.out.println("\nthe solution is:\n");
            display();
        }
    }


    public void display() {
        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board[row].length; column++)
                System.out.printf("%4d", board[row][column]);
            System.out.println();
            System.out.println();
        }
    }

    public boolean step(int x, int y, int moveCounter) {
        int row, column;

        if (moveCounter == 64) {
            return false;
        }
        //Loop through the accessibility options 2-8
        for (int accessNumber = 2; accessNumber <= N; accessNumber++) {
            ArrayList<Integer> options = new ArrayList<>();
            //Loop through the moves the knight can do
            for (int k = 0; k < N; k++) {
                row = x + vertical[k];
                column = y + horizontal[k];

                //Check if the movement is safe
                if (safe(row, column)) {
                    //Add to the list those that fulfill the condition
                    if (accessibility[row][column] == accessNumber) {
                        options.add(k); //2, 4, 5
                    }
                }
                if (k == N - 1 && !options.isEmpty()) {
                    int selectNumber = options.get(new Random().nextInt(options.size()));
                   return move(moveCounter, x + vertical[selectNumber], y + horizontal[selectNumber]);
                }
            }
        }
        return false;
    }

    private boolean move(int moveCounter, int row, int column) {
        board[row][column] = moveCounter;
        return step(row, column, moveCounter+1);
    }

    public boolean safe(int row, int column) {
        if (row >= 0 && row <= 7 && column >= 0 && column <= 7 && board[row][column] == -1)
            return true;
        return false;
    }


}

