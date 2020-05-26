package lesson_4.exercises.Knights_Run;

/**
 * In the previous exercise we developed a solution to the Knight’s Tour problem. The approach used,
 * called the “accessibility heuristic,” generates many solutions and executes efficiently.
 * As computers continue to increase in power, we’ll be able to solve more problems with sheer computer
 * power and relatively unsophisticated algorithms. Let’s call this approach “brute-force” problem solving.
 * a) Use random-number generation to enable the knight to walk around the chessboard (in its
 * legitimate L-shaped moves) at random. Your application should run one tour and display the final
 * chessboard. How far did the knight get?
 * b) Most likely, the application in part (a) produced a relatively short tour. Now modify your application
 * to attempt 1,000 tours. Use a one-dimensional array to keep track of the number of tours of each
 * length. When your application finishes attempting the 1,000 tours, it should display this information in
 * neat tabular format. What was the best result?
 * c) Most likely, the application in part (b) gave you some “respectable” tours, but no full tours. Now let
 * your application run until it produces a full tour. [Caution: This version of the application could run for
 * hours on a powerful computer.] Once again, keep a table of the number of tours of each length, and
 * display this table when the first full tour is found. How many tours did your application attempt before
 * producing a full tour? How much time did it take?
 * d) Compare the brute-force version of the Knight’s Tour with the accessibility-heuristic version. Which
 * required a more careful study of the problem? Which algorithm was more difficult to develop? Which
 * required more computer power? Could we be certain (in advance) of obtaining a full tour with the
 * accessibility-heuristic approach? Could we be certain (in advance) of obtaining a full tour with the
 * brute-force approach? Argue the pros and cons of brute-force problem solving in general.
 */

import java.util.Random;

public class KnightBruteForce {
    public static void main(String[] args) {
        KnightFigure knight = new KnightFigure();
        int lockDown;
        int[][] chessboard = new int[8][8];
        boolean[] success = new boolean[1000];
        int[] highestResult = new int[1000];
        for (int test = 0; test <= 999; test++) {
            lockDown = 0;
            for (int i = 0; i < 8; i++) {
                for (int y = 0; y < 8; y++) {
                    chessboard[i][y] = 0;
                }
            }
            chessboard[knight.get_yPosition()][knight.get_xPosition()] = 1;
            //Chess Moves
            for (int r = 2; r <= 64; r++) {
                int m = RNG();
                int x = knight.get_xPosition();
                int y = knight.get_yPosition();

                //Move the knight
                knight.chessMove(m);

                //Check if field was taken
                if ((chessboard[knight.get_yPosition()][knight.get_xPosition()] == 0)) {
                    //Assign the value to the new field
                    chessboard[knight.get_yPosition()][knight.get_xPosition()] = r;
                    //System.out.println("valid move");
                } else {
                    //reverse move and return to previous r value
                    if (x != knight.get_xPosition() && y != knight.get_yPosition()) {
                        lockDown++;
                        r--;
                        knight.reverseMove(x, y);
                        if (lockDown > 80){
                            highestResult[test] = KnightFigure.highestNumber(chessboard);
                            success[test] = false;
                            System.out.println(test+1 +".");
                            KnightFigure.printBoard(chessboard);
                            System.out.println("Knight cornered");
                            break;
                        }
                        //System.out.println("invalid move");
                    }
                }
                //KnightFigure.printBoard(chessboard);
            }
            System.out.println(test+1+".");
            KnightFigure.printBoard(chessboard);
            success[test] = KnightFigure.checkBoard(chessboard);
            highestResult[test] = KnightFigure.highestNumber(chessboard);
        }
        for(int test = 0; test <= 999; test++){
            System.out.println((test+1)+". "+highestResult[test] + " " + (success[test]? "Complete Run":"not complete" ));
        }
    }

    public static int RNG() {
        return new Random().nextInt(8);
    }
}
