package lesson_7.EulerProject.exercises;

//Source: https://stackoverflow.com/questions/13398945/eight-queens-algorithm

import java.util.Arrays;

public class Queens {
    //Number of rows or columns
    public static final int BOARD_SIZE = 8;

    boolean[][] board;
    //Indicate an empty square
    public static final boolean EMPTY = false;
    //Indicate a square which containing a queen
    public static final boolean QUEEN = true;
    //Number of moves
    public static final int MOVES = 4;
    //Horizontal moves
    int[] horizontal;
    //Vertical moves
    int[] vertical;

    public int queens = 0;

    public Queens() {
        //Constructor creates an empty board
        board = new boolean[BOARD_SIZE][BOARD_SIZE];
        for (boolean[] booleans : board) {
            Arrays.fill(booleans, EMPTY);
        }

        horizontal = new int[MOVES];
        vertical = new int[MOVES];
        // up right
        horizontal[0] = -1;
        vertical[0] = 1;
        // down left
        horizontal[1] = 1;
        vertical[1] = -1;
        // up left
        horizontal[2] = -1;
        vertical[2] = -1;
        // down right
        horizontal[3] = 1;
        vertical[3] = 1;
    }

    public boolean placeQueens (int column) {
        if (column >= BOARD_SIZE) {
            return true;
        }
        else {
            boolean queenPlaced = false;
            int row = 0;

            while (!queenPlaced && row < BOARD_SIZE) {
                if (isUnderAttack(row, column)) {
                    ++row;
                }// end if
                else{
                    setQueen(row, column);
                    queenPlaced = placeQueens(column + 1);
                    if (!queenPlaced) {
                        removeQueen(row,column);
                        ++row;
                    }// end if
                }// end else
            }// end while
            return queenPlaced;
        }// end else
    }

    private void removeQueen(int row, int column) {
        board[row][column] = EMPTY;
        System.out.printf("queen REMOVED from [%d][%d]\n", row, column);
        --queens;
    }

    private void setQueen(int row, int column) {
        board[row][column] = QUEEN;
        System.out.printf("queen PLACED in [%d][%d]\n", row, column);
        ++queens;
    }

    public boolean isUnderAttack(int row, int col) {
        boolean condition = false;
        // check row
        for (int column = 0; column < BOARD_SIZE; column++) {
            if ((board[row][column])) {
                condition = true;
                break;
            }
        }

        // check column
        for (boolean[] booleans : board) {
            if (booleans[col]) {
                condition = true;
                break;
            }
        }

        // check diagonal
        for (int row_ = row, col_ = col; row_ >= 0 && col_ < BOARD_SIZE; row_ += horizontal[0], col_ += vertical[0]) {
            if (board[row_][col_]) {
                condition = true;
                break;
            }
        }
        for (int row_ = row, col_ = col; row_ < BOARD_SIZE && col_ >= 0; row_ += horizontal[1], col_ += vertical[1]) {
            if (board[row_][col_]) {
                condition = true;
                break;
            }
        }
        for (int row_ = row, col_ = col; row_ >= 0 && col_ >= 0; row_ += horizontal[2], col_ += vertical[2]) {
            if (board[row_][col_]) {
                condition = true;
                break;
            }
        }
        for (int row_ = row, col_ = col; row_ < BOARD_SIZE && col_ < BOARD_SIZE; row_ += horizontal[3], col_ += vertical[3]) {
            if (board[row_][col_]) {
                condition = true;
                break;
            }
        }

        return condition;
    }

    public void displayBoard () {
        int counter = 0;
        for (boolean[] booleans : board) {
            for (boolean aBoolean : booleans) {
                if (aBoolean) {
                    System.out.printf("|%s|", "x");
                    counter++;
                } else {
                    System.out.printf("|%s|", "o");
                }
            }
            System.out.println();
        }

        System.out.printf("%d queens have been placed\n", counter);
    }
}
