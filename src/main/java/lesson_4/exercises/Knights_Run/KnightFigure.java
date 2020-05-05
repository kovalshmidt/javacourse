package lesson_4.exercises.Knights_Run;


public class KnightFigure {
    private int yPosition;
    private int xPosition;

    public KnightFigure(int yPosition, int xPosition) {
        this.yPosition = yPosition;
        this.xPosition = xPosition;
    }

    public KnightFigure() {
        this.yPosition = 3;
        this.xPosition = 4;
    }

    public int get_yPosition() {
        return yPosition;
    }

    public int get_xPosition() {
        return xPosition;
    }

    public void set_Position(int factorY, int factorX) {
        if (((yPosition + factorY <= 7)&&(yPosition + factorY>=0))&&((xPosition + factorX <= 7)&&(xPosition + factorX>=0)) ) {
                this.xPosition += factorX;
                this.yPosition += factorY;
        }
    }

    public void chessMove(int option) {
        switch (option) {
            case 0:
                set_Position(-1, 2);
                break;
            case 1:
                set_Position(-2, 1);
                break;
            case 2:
                set_Position(-2, -1);
                break;
            case 3:
                set_Position(-1, -2);
                break;
            case 4:
                set_Position(1, -2);
                break;
            case 5:
                set_Position(2, -1);
                break;
            case 6:
                set_Position(2, 1);
                break;
            case 7:
                set_Position(1, 2);
        }
    }

    public void reverseMove(int option) {
        switch (option) {
            case 0:
                set_Position(1, -2);
                break;
            case 1:
                set_Position(2, -1);
                break;
            case 2:
                set_Position(2, 1);
                break;
            case 3:
                set_Position(1, 2);
                break;
            case 4:
                set_Position(-1, 2);
                break;
            case 5:
                set_Position(-2, 1);
                break;
            case 6:
                set_Position(-2, -1);
                break;
            case 7:
                set_Position(-1, -2);
        }
    }

    public void setYPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public void setXPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public static void printBoard(int[][] chessboard) {
        for (int i = 0; i < 8; i++) {
            for (int y = 0; y <= 7; y++) {
                        System.out.print(chessboard[i][y]+"  ");
                if (y == 7) {
                    System.out.println();
                }
            }
        }
        System.out.println();
    }
}
