package lesson_4.exercises.Knights_Run;

/**
 * An interesting puzzler for chess buffs is the Knight’s Tour problem, originally proposed by the
 * mathematician Euler. Can the knight piece move around an empty chessboard and touch each of the
 * 64 squares once and only once? We study this intriguing problem in depth here.
 * The knight makes only L-shaped moves (two spaces in one direction and one space in a perpendicular
 * direction). Thus, as shown in the image below, from a square near the middle of an empty chessboard,
 * the knight (labeled K) can make eight different moves (numbered 0 through 7).
 * <p>
 * Screenshot 2020-04-26 at 21 03 38
 * <p>
 * Write a different application for the listed cases:
 * a) Draw an eight-by-eight chessboard on a sheet of paper, and attempt a Knight’s Tour by hand. Put a
 * 1 in the starting square, a 2 in the second square, a 3 in the third, and so on. Before starting the tour,
 * estimate how far you think you’ll get, remembering that a full tour consists of 64 moves. How far did
 * you get? Was this close to your estimate?
 * b) Now let’s develop an application that will move the knight around a chessboard. The board is
 * represented by an eight-by-eight two-dimensional array board. Each square is initialized to zero.
 * We describe each of the eight possible moves in terms of its horizontal and vertical components.
 * For example, a move of type 0, as shown in the picture, consists of moving two squares horizontally to the
 * right and one square vertically upward. A move of type 2 consists of moving one square horizontally to
 * the left and two squares vertically upward. Horizontal moves to the left and vertical moves upward are
 * indicated with negative numbers. The eight moves may be described by two one-dimensional arrays,
 * horizontal and vertical, as follows:
 * horizontal[0] = 2 horizontal[1] = 1 horizontal[2] = -1 horizontal[3] = -2 horizontal[4] = -2 horizontal[5]
 * = -1 horizontal[6] = 1 horizontal[7] = 2
 * vertical[0] = -1 vertical[1] = -2 vertical[2] = -2 vertical[3] = -1 vertical[4] = 1 vertical[5] = 2 vertical[6] = 2
 * vertical[7] = 1
 * Let the variables currentRow and currentColumn indicate the row and column, respectively, of the
 * knight’s current position. To make a move of type moveNumber, where moveNumber is between 0 and
 * 7, your application should use the statements
 * currentRow += vertical[moveNumber]; currentColumn += horizontal[moveNumber];
 * Write an application to move the knight around the chessboard. Keep a counter that varies from 1 to
 * 64.Record the latest count in each square the knight moves to.
 * Test each potential move to see if the knight has already visited that square. Test every potential move
 * to ensure that the knight does not land off the chessboard. Run the application. How many moves did
 * the knight make?
 * c) After attempting to write and run a Knight’s Tour application, you’ve probably developed some
 * valuable insights. We’ll use these insights to develop a heuristic (i.e., a common-sense rule) for moving
 * the knight. Heuristics do not guarantee success, but a carefully developed heuristic greatly improves
 * the chance of success. You may have observed that the outer squares are more troublesome than the
 * squares nearer the center of the board. In fact, the most troublesome or inaccessible squares are the
 * four corners.
 * Intuition may suggest that you should attempt to move the knight to the most troublesome squares
 * first and leave open those that are easiest to get to, so that when the board gets congested near the
 * end of the tour, there will be a greater chance of success.
 * We could develop an “accessibility heuristic” by classifying each of the squares according to how
 * accessible it is and always moving the knight (using the knight’s L- shaped moves) to the most
 * inaccessible square. We label a two-dimensional array accessibility with numbers indicating from how
 * many squares each particular square is accessible. On a blank chessboard, each of the 16 squares
 * nearest the center is rated as 8, each corner square is rated as 2, and the other squares have
 * accessibility numbers of 3, 4 or 6 as follows:
 * Screenshot 2020-04-26 at 21 08 07
 * Write a new version of the Knight’s Tour, using the accessibility heuristic. The knight should always
 * move to the square with the lowest accessibility number. In case of a tie, the knight may move to any of
 * the tied squares. Therefore, the tour may begin in any of the four corners. [Note: As the knight moves
 * around the chessboard, your application should reduce the accessibility numbers as more squares
 * become occupied. In this way, at any given time during the tour, each available square’s accessibility
 * number will remain equal to precisely the number of squares from which that square may be reached.]
 * Run this version of your application. Did you get a full tour? Modify the application to run 64 tours, one
 * starting from each square of the chessboard. How many full tours did you get?
 * d) Write a version of the Knight’s Tour application that, when encountering a tie between two or more
 * squares, decides what square to choose by looking ahead to those squares reachable from the “tied”
 * squares. Your application should move to the tied square for which the next move would arrive at a
 * square with the lowest accessibility number.
 */

import java.util.Random;

public class KnightHeuristic {
    public static void main(String[] args) {
        KnightFigure knight = new KnightFigure();
        int[][] chessboard = new int[8][8];
        int[][] heuristic = new int[8][8];
        int alpha, beta;
        if (isZeroOrSeven()) {
            alpha = 0;
        } else {
            alpha = 7;
        }
        if (isZeroOrSeven()) {
            beta = 0;
        } else {
            beta = 7;
        }

        knight.setYPosition(alpha);
        knight.setXPosition(beta);

        for (int i = 0; i < 8; i++) {
            for (int y = 0; y < 8; y++) {
                switch (i) {
                    case 0:
                    case 7:
                        switch (y) {
                            case 0:
                            case 7:
                                heuristic[i][y] = 2;
                                break;
                            case 1:
                            case 6:
                                heuristic[i][y] = 3;
                                break;
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                                heuristic[i][y] = 4;
                                break;
                        }
                        break;
                    case 1:
                    case 6:
                        switch (y) {
                            case 0:
                            case 7:
                                heuristic[i][y] = 3;
                                break;
                            case 1:
                            case 6:
                                heuristic[i][y] = 4;
                                break;
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                                heuristic[i][y] = 6;
                                break;
                        }
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        switch (y) {
                            case 0:
                            case 7:
                                heuristic[i][y] = 4;
                                break;
                            case 1:
                            case 6:
                                heuristic[i][y] = 6;
                                break;
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                                heuristic[i][y] = 8;
                                break;
                        }
                        break;
                }
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int y = 0; y < 8; y++) {
                chessboard[i][y] = 0;
            }
        }
        //Chess Moves
        for (int r = 1; r <= 64; r++) {
            movement(knight, chessboard, heuristic, r);
        }
        KnightFigure.printBoard(chessboard);
    }

    private static void movement(KnightFigure knight, int[][] chessboard, int[][] heuristic, int r) {
        int previousX = knight.get_xPosition();
        int previousY = knight.get_yPosition();
        int currentXPosition = previousX;
        int currentYPosition = previousY;
        int foresightX = currentXPosition;
        int foresightY = currentYPosition;
        int finalMove = 0, reserveMove = 0;
        for (int trialMove = 0; trialMove <= 7; trialMove++) {
            knight.chessMove(trialMove);
            if (heuristic[knight.get_yPosition()][knight.get_xPosition()] < heuristic[currentYPosition][currentXPosition]) {
                if (heuristic[knight.get_yPosition()][knight.get_xPosition()] == heuristic[currentYPosition][currentXPosition]) {

                }
                finalMove = trialMove;
                currentYPosition = knight.get_yPosition();
                currentXPosition = knight.get_xPosition();
            }
            knight.reverseMove(previousX, previousY);

        }
        knight.chessMove(finalMove);
        KnightFigure.printBoard(chessboard);
        if ((chessboard[knight.get_yPosition()][knight.get_xPosition()] == 0)) {
            chessboard[knight.get_yPosition()][knight.get_xPosition()] = r;
            heuristic[knight.get_yPosition()][knight.get_xPosition()] = 10;
        } else {
            knight.reverseMove(previousX, previousY);
        }
    }


    public static boolean isZeroOrSeven() {
        return new Random().nextBoolean();
    }
}
